package cn.zktr.ui;
//商品管理
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.tree.DefaultTreeModel;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.dao.Xm2zengjiadao;
import cn.zktr.dao.Xm3hyDao;
import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.dao.shangpindao;
import cn.zktr.entity.Xm2spcx;
import cn.zktr.entity.Xm2st;
import cn.zktr.entity.Xm3users;
import cn.zktr.entity.xm3hyzhengjia;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Xm2 extends JDialog {

	private JPanel contentPane;
	private JTextField textField_1;
	 JTable table;
	List<Xm2spcx> list1=new ArrayList<Xm2spcx>();
	shangpindao gdao3=new shangpindao();
	JScrollPane scrollPane; 
	Xm2zengjiadao sdao=new Xm2zengjiadao();
	Xm2spcx  xm2sp;
	
	SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	//
	Zujm_ui gui;
	
	//操作人
	JLabel label;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					// 设置本属性将改变窗口边框样式定义
//					  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//					  UIManager.put("RootPane.setupButtonVisible", false);
//					  // 启用皮肤
//					  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//					Xm2 frame = new Xm2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Xm2(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setTitle("商品信息");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 1285, 783);
		//居中
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 19, 110);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 0, 1242, 110);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xm2zengjia a=new Xm2zengjia(new JFrameInterface() {
					
					@Override
					public JDialog getJFrame() {
						// TODO Auto-generated method stub
						return Xm2.this;
					}
				});
			}
		});
		button.setBounds(307, 28, 64, 57);
		button.setIcon(new ImageIcon(Xm2.class.getResource("/img/增加.png")));
		panel_1.add(button);
		
		JLabel label_2 = new JLabel("商品列表");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 30));
		label_2.setBounds(25, 28, 150, 55);
		panel_1.add(label_2);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "请选中数据行");
				}else {
					int row =table.getSelectedRow();
					for (int i = 0; i < list1.size(); i++) {
						
							if(row==i) {
								xm2sp=list1.get(i);
							}
					
						
					}
					
					Xm2xuigai b=new Xm2xuigai(new JFrameInterface() {
							
							@Override
							public JDialog getJFrame() {
								// TODO Auto-generated method stub
								return Xm2.this;
							}
						});
				}
				
          
			}
		});
		button_1.setIcon(new ImageIcon(Xm2.class.getResource("/img/修改.png")));
		button_1.setBounds(558, 27, 64, 58);
		panel_1.add(button_1);
		
		JButton button_2 = new JButton("下架商品");
		button_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				if(row>-1) {
					int gid=(int) table.getValueAt(row, 0);
					try {
						sdao.updatexgj(gid);
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}			}
		});
		button_2.setIcon(null);
		button_2.setBounds(783, 41, 113, 37);
		panel_1.add(button_2);
		
		JButton btnNewButton = new JButton("上架商品");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				if(row>-1) {
					int gid=(int) table.getValueAt(row, 0);
					try {
						sdao.updatexgj2(gid);
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
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(1014, 39, 113, 40);
		panel_1.add(btnNewButton);
		
		 label = new JLabel(gui.label_2.getText());
		label.setBounds(154, 10, 0, 15);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 108, 1259, 62);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblf = new JLabel("商品编号:");
		lblf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblf.setBounds(45, 13, 152, 33);
		panel_2.add(lblf);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_1.setBounds(152, 17, 179, 24);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnf = new JButton("查询");
		btnf.addActionListener(new ActionListener() {
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
		btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf.setBounds(359, 16, 124, 36);
		panel_2.add(btnf);
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 180, 1259, 564);
		contentPane.add(scrollPane);
		
		table = new JTable();
		try {
			
			table = new JTable(getModel(findDb())){
				
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

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
//table_1_1.setGridColor(Color.red);
//设置行高
table.getColumnModel().getColumn(8).setPreferredWidth(250);
table.getColumnModel().getColumn(8).setMaxWidth(300) ;
table.getColumnModel().getColumn(6).setPreferredWidth(150);
table.getColumnModel().getColumn(6).setMaxWidth(300) ;
table.setRowHeight(30);
		scrollPane.setViewportView(table);
//		
		//不能改变大小
		setResizable(false);
		setVisible(true);
	}

public DefaultTableModel getModel(List<Xm2spcx> list) throws Exception{
	
	//创建表头
	Object[] head={"编号","商品名称","进价","售价","规格","类别","供货商编号","操作人","操作时间","状态"};
	DefaultTableModel tm=null;
//	list1=gdao3.selectByAll();
//	System.out.println(list1);
	if(list1.size()>0){
		//表主体
		Object[][] body=new Object[list1.size()][head.length];
		int j=0;
		for (int i = 0; i < body.length; i++) {
			Xm2spcx g=list1.get(i);
			body[i][j++]=g.getGid();
			body[i][j++]=g.getGname();
			body[i][j++]=g.getGbid();
			body[i][j++]=g.getGprice();
			body[i][j++]=g.getGspec();
			body[i][j++]=g.getCtype();
			body[i][j++]=g.getSbusiness();
		    body[i][j++]=g.getGopera();
		    body[i][j++]=sdf2.format(g.getGdate());
		    body[i][j++]=g.getSztai()==0?"已上架":"已下架";
			j=0;
		}
		tm=new DefaultTableModel(body, head);
		
	}else{
		tm=new DefaultTableModel(null, head);
	}
	return tm;
}
public List<Xm2spcx> findDb() throws Exception{
	//1.如果第一次来，输入框中无值，则查询所有
	if(textField_1.getText().equals(null) || textField_1.getText().equals("")){
		list1=gdao3.selectByAll();
	}else{
		list1=gdao3.selectByAll(textField_1.getText());
	}
	//2.如果下拉框中有值，则带条件查询
	return list1;
}

public void updateTable() throws Exception{
	//重新建模
	table.setModel(getModel(findDb()));
	table.getColumnModel().getColumn(8).setPreferredWidth(250);
    table.getColumnModel().getColumn(8).setMaxWidth(300) ;
    table.getColumnModel().getColumn(6).setPreferredWidth(150);
    table.getColumnModel().getColumn(6).setMaxWidth(300) ;
	scrollPane.setViewportView(table);
	//通知面板立即生效
	scrollPane.validate();
	}
}