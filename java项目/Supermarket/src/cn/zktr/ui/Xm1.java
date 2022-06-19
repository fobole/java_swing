package cn.zktr.ui;
//供货商管理

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.dao.Xm1dao;
import cn.zktr.dao.Xm3hyDao;
import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm3users;
import cn.zktr.entity.xm3hyzhengjia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Xm1 extends JDialog {
	 JTable table;
	List<Xm1st> list2=new ArrayList<Xm1st>();
	Xm1dao gdao=new Xm1dao();
	JScrollPane scrollPane;
	private JTextField textField;
	

	
Xm1st m1;
	//删除dao
	Xm1dao sdao=new Xm1dao();
	JScrollPane scrollPane_1;
;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			// 设置本属性将改变窗口边框样式定义
			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
			  UIManager.put("RootPane.setupButtonVisible", false);
			  // 启用皮肤
			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
			Xm1 dialog = new Xm1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Xm1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("供货商信息");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 1007, 600);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.WHITE);
				panel_1.setBounds(10, 0, 981, 93);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JButton btnNewButton_1 = new JButton("");
					btnNewButton_1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							//先判断是否选中行
							if(table.getSelectedRow()<0){
								JOptionPane.showMessageDialog(null, "请先选中数据行");
							}else{
								//获得当前选中行的下标
								int row=table.getSelectedRow();
								//通过行获取该行中的列
								int sid=(int) table.getValueAt(row, 0);
								String sbusiness=(String) table.getValueAt(row, 1);
								String sname=(String) table.getValueAt(row,2 );
								String sphone=(String) table.getValueAt(row, 3);
								String saddress=(String)table.getValueAt(row, 4);
//								int sztai=(int)table.getValueAt(row, 5);
			                	//int vopera=(int)table.getValueAt(row, 5);
								//将属性封装到个公共的商品对象中
			                	 m1=new Xm1st(sid,sbusiness,sname,sphone,saddress);
								}
							Xm1xuigai b=new Xm1xuigai(new JFrameInterface() {
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return Xm1.this;
								}
							});
						}
					});
					btnNewButton_1.setIcon(new ImageIcon(Xm1.class.getResource("/img/修改.png")));
					btnNewButton_1.setBounds(295, 13, 61, 70);
					panel_1.add(btnNewButton_1);
				}
				{	
					JButton btnNewButton_2 = new JButton("下架供应商");
					btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							int row=table.getSelectedRow();
							if(row>-1) {
								int sid=(int) table.getValueAt(row, 0);
								try {
									sdao.updatexgs(sid);
									updateTable();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}else {
								JOptionPane.showMessageDialog(null, "请选择数据");
							}
					}
					});
					
					btnNewButton_2.setIcon(null);
					btnNewButton_2.setBounds(458, 23, 133, 37);
					panel_1.add(btnNewButton_2);
				}
				{
					JButton btnNewButton = new JButton("");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Xm1zhengjia a=new Xm1zhengjia(new JFrameInterface() {
		    					
		    					@Override
		    					public JDialog getJFrame() {
		    						// TODO Auto-generated method stub
		    						return Xm1.this;
		    					}
		    				});
						}
					});
					btnNewButton.setIcon(new ImageIcon(Xm1.class.getResource("/img/增加.png")));
					btnNewButton.setBounds(103, 13, 67, 70);
					panel_1.add(btnNewButton);
				}
				
				JButton btnNewButton_3 = new JButton("上架供应商");
				btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table.getSelectedRow();
						if(row>-1) {
							int sid=(int) table.getValueAt(row, 0);
							try {
								sdao.updatexgs2(sid);
								updateTable();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "请选择数据");
						}
					}
				});
				btnNewButton_3.setBounds(668, 23, 133, 37);
				panel_1.add(btnNewButton_3);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBackground(Color.CYAN);
				panel_1.setBounds(10, 530, 981, 31);
				panel.add(panel_1);
				panel_1.setLayout(null);
			}
			
			JButton button = new JButton("查询");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//刷新表格
					try {
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			
				
			});
			button.setBounds(470, 116, 93, 31);
			panel.add(button);
			button.setFont(new Font("微软雅黑", Font.BOLD, 20));
			{
				textField = new JTextField();
				textField.setBounds(147, 119, 281, 26);
				panel.add(textField);
				textField.setFont(new Font("微软雅黑", Font.PLAIN, 18));
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("供货商查询");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(25, 119, 112, 26);
				panel.add(label);
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 170, 981, 350);
				panel.add(scrollPane_1);
				
				table = new JTable();
				try {
					
					table = new JTable(getModel(findDb())){
						
						@Override
						public boolean isCellEditable(int row, int column) {
							// TODO Auto-generated method stub
							return false;
						}
					};
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				table.setFont(new Font("微软雅黑", Font.BOLD, 20));
				JTableHeader head2 = table.getTableHeader(); // 创建表格标题对象
		        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
		        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
		        render2.setHorizontalAlignment(SwingConstants.CENTER);
		        table.setDefaultRenderer(Object.class, render2);
		        //线条颜色
//		      table_1_1.setGridColor(Color.red);
		        //设置行高
		        table.setRowHeight(30);

				scrollPane_1.setViewportView(table);
			}
		}
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setVisible(true);
		setResizable(false);
	}
		public DefaultTableModel getModel(List<Xm1st> list2) throws Exception{
			//创建表头
			Object[] head={"编号","商品名称","联系人","联系人号码","地址","状态",};
			DefaultTableModel tm=null;
//			list=gdao.selectByAll();
//			System.out.println(list);
			if(list2.size()>0){
				//表主体
				Object[][] body=new Object[list2.size()][head.length];
				int j=0;
				for (int i = 0; i < body.length; i++) {
					Xm1st g=list2.get(i);
					body[i][j++]=g.getSid();
					body[i][j++]=g.getSbusiness();
					body[i][j++]=g.getSname();
					body[i][j++]=g.getSphone();
					body[i][j++]=g.getSaddress();
					body[i][j++]=g.getSztai()==0?"可用":"不可用";
					j=0;
				}
				tm=new DefaultTableModel(body, head);
				
			}else{
				tm=new DefaultTableModel(null, head);
			}
			return tm;
		}
		public List<Xm1st> findDb() throws Exception{
			//1.如果第一次来，输入框中无值，则查询所有
			if(textField.getText().equals(null) || textField.getText().equals("")){
				list2=gdao.selectByAll();
			}else{
				list2=gdao.selectByAll(textField.getText());
			}
			//2.如果下拉框中有值，则带条件查询
			return list2;
		}
		
		public void updateTable() throws Exception{
			//重新建模
			table.setModel(getModel(findDb()));
			//创建将表格加入滚动面板中
			scrollPane_1.setViewportView(table);
			//通知面板立即生效
			scrollPane_1.validate();
		}
}
