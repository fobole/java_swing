package cn.zktr.ui;
//员工设置

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.dao.Xm1dao;
import cn.zktr.dao.Xm4dao;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm4st;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.Color;

public class Xm4 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	 JTable table;
	private JTextField textField;
	JScrollPane scrollPane;
	
		List<Xm4st> list2=new ArrayList<Xm4st>();
		Xm4dao gdao=new Xm4dao();
		Xm4st xm;
		Xm4st a;
		Xm4dao sdao=new Xm4dao();
		
		String name;
		
		//
		Zujm_ui gui;
		
		
		//登录者
		JLabel lblNewLabel_1;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			// 设置本属性将改变窗口边框样式定义
//			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//			  UIManager.put("RootPane.setupButtonVisible", false);
//			  // 启用皮肤
//			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			Xm4 dialog = new Xm4();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Xm4(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm4.class.getResource("/img/logo544.png")));
		setTitle("员工信息");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 878, 572);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 0, 846, 87);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Xm4zengjia a=new Xm4zengjia(new JFrameInterface() {
	    					
	    					@Override
	    					public JDialog getJFrame() {
	    						// TODO Auto-generated method stub
	    						return Xm4.this;
	    					}
	    				});
					}
				});
				button.setIcon(new ImageIcon(Xm4.class.getResource("/img/增加.png")));
				button.setBounds(56, 16, 59, 61);
				panel.add(button);
			}
			{
				JButton btnNewButton = new JButton("");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(table.getSelectedRow()<0){
							JOptionPane.showMessageDialog(null, "请先选中数据行");
						}else{
							//获得当前选中行的下标
							int row=table.getSelectedRow();
							//通过行获取该行中的列
							
							
							for (int i = 0; i < list2.size(); i++) {
//								if() {
//									JOptionPane.showMessageDialog(null, "不能修改登录者");
//								}else {
									if(row==i) {
										xm=list2.get(i);
//										if(lblNewLabel_1.getText().equals(xm.getEname())) {
//											JOptionPane.showMessageDialog(null, "不能修改登录者");
//											return;
//										}
										if(xm.getEstate()==1) {
											JOptionPane.showMessageDialog(null, "离职不能修改");
											return;
										}else{
											Xm4xuigai a=new Xm4xuigai(new JFrameInterface() {
												@Override
												public JDialog getJFrame() {
													// TODO Auto-generated method stub
													return Xm4.this;
												}
											});
										}
										
									}
									
									

								
							}
		                	//int vopera=(int)table.getValueAt(row, 5);
							//将属性封装到个公共的商品对象中
		                	
							}
						
					}
				});
				btnNewButton.setIcon(new ImageIcon(Xm4.class.getResource("/img/修改.png")));
				btnNewButton.setBounds(261, 16, 59, 61);
				panel.add(btnNewButton);
			}
			{
				JButton button = new JButton("改为离职");
				button.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table.getSelectedRow();
						
						if(row>-1) {
							if(lblNewLabel_1.getText().equals(table.getValueAt(row, 1))) {
								JOptionPane.showMessageDialog(null, "不能修改登录者状态");
								return;
							}else {
								int eid=(int) table.getValueAt(row, 0);
								try {
									sdao.updatexgs(eid);
									updateTable();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							
						}else {
							JOptionPane.showMessageDialog(null, "请选择数据");
						}
					}
				});
				button.setIcon(null);
				button.setBounds(453, 29, 112, 37);
				panel.add(button);
			}
			{
				JButton btnNewButton_1 = new JButton("改为在职");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table.getSelectedRow();
						if(row>-1) {
							int eid=(int) table.getValueAt(row, 0);
							try {
								sdao.updatexgs2(eid);
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
				btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnNewButton_1.setBounds(673, 29, 112, 37);
				panel.add(btnNewButton_1);
			}
			{
				lblNewLabel_1 = new JLabel(gui.label_2.getText());
				lblNewLabel_1.setBounds(155, 16, -1, 15);
				panel.add(lblNewLabel_1);
			}
		}
		
		JLabel lblNewLabel = new JLabel("员工查询：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 97, 116, 38);
		contentPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField.setBounds(141, 97, 213, 33);
		contentPanel.add(textField);
		textField.setColumns(10);
		
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
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setBounds(375, 97, 93, 31);
		contentPanel.add(button);
		{
			 scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 140, 846, 393);
			contentPanel.add(scrollPane);
			{
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
//  table_1_1.setGridColor(Color.red);
    //设置行高
    table.setRowHeight(30);
    table.getColumnModel().getColumn(4).setPreferredWidth(170);
    table.getColumnModel().getColumn(4).setMaxWidth(300) ;
				scrollPane.setViewportView(table);
			}
		
				scrollPane.setViewportView(table);
			}
	
		//不能改变大小
				setResizable(false);
				setVisible(true);
	}
	public DefaultTableModel getModel(List<Xm4st> list2) throws Exception{
		//创建表头
		Object[] head={"编号","姓名","密码","职位","号码","地址","状态",};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list);
		if(list2.size()>0){
			  
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Xm4st g=list2.get(i);
				body[i][j++]=g.getEid();
				body[i][j++]=g.getEname();
				body[i][j++]=g.getEpwd().equals("123332")?"********":"********";
				body[i][j++]=g.getEposition();
				body[i][j++]=g.getEphone();
				body[i][j++]=g.getEadd();
				body[i][j++]=g.getEstate()==0?"在职":"离职";
			
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public List<Xm4st> findDb() throws Exception{
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
		table.getColumnModel().getColumn(4).setPreferredWidth(170);
	    table.getColumnModel().getColumn(4).setMaxWidth(300) ;
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
	}



}
