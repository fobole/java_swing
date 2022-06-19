/*
       商品销售
 * 
 *
 */


package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Sxiaoshou_biz;
import cn.zktr.dao.S_danju;
import cn.zktr.dao.S_xiaotui_dao;
import cn.zktr.dao.Sxiaoshou_dao;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.S_xiaotui;
import cn.zktr.entity.Sgoods_zengjia;

import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JRadioButton;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Sxmbg1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JPanel panel;
	CardLayout car=new CardLayout();
	 JTable table;
	private JTextField textField_6;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField_7;
	List<S_xiaotui> list=new ArrayList<S_xiaotui>();
	S_xiaotui_dao xtdao=new S_xiaotui_dao();
	JScrollPane scrollPane_1;
	JScrollPane scrollPane;
	JScrollPane scrollPane_2;
	JLabel label_3;
	JLabel label_s;
	JLabel label_4;
	JLabel label;
	JPanel panel_2;
	List<Sgoods_jiujia> lxiao=new ArrayList<Sgoods_jiujia>();
	
	List<S_danju_xiangqin> list2=new ArrayList<S_danju_xiangqin>();
	S_xiaotui_dao ddao=new S_xiaotui_dao();
	
	
	
	
	JLabel lblx;
	
	JRadioButton radioButton;
	JRadioButton radioButton_1;
	
	Sxiaoshou_dao s=new Sxiaoshou_dao();
	//销售biz
	Sxiaoshou_biz xbiz=new Sxiaoshou_biz();
	
	Sgoods_jiujia cj;
	
	JComboBox comboBox;
	
	//经办人
	JComboBox comboBox_1;
	
	Zujm_ui gui;
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
////			  table.setFont(new Font("微软雅黑", Font.BOLD, 20));
////				JTableHeader head2 = table.getTableHeader(); // 创建表格标题对象
////		        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
////		        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
////		        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
////		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
////		        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
////		        render2.setHorizontalAlignment(SwingConstants.CENTER);
////		        table.setDefaultRenderer(Object.class, render2);
////		        //线条颜色
//////		      table_1_1.setGridColor(Color.red);
////		        //设置行高
////		        table.setRowHeight(30);
//
//			Sxmbg1 dialog = new Sxmbg1();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Sxmbg1(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg1.class.getResource("/img/logo544.png")));
		setTitle("商品销售");
		setBounds(100, 100, 1030, 780);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton button = new JButton("商品销售");
			button.setFont(new Font("微软雅黑", Font.BOLD, 20));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if (but.getText().equals("商品销售")) {
						car.show(panel, "name_82394534341500");
					}
				}
			});
			button.setBounds(14, 13, 147, 52);
			contentPanel.add(button);
		}
		{
			JButton button = new JButton("销售单核查");
			button.setFont(new Font("微软雅黑", Font.BOLD, 20));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if (but.getText().equals("销售单核查")) {
						car.show(panel, "name_82398236976500");
					}
				}
			});
			button.setBounds(171, 13, 145, 52);
			contentPanel.add(button);
		}
		{
			panel = new JPanel();
			panel.setBounds(14, 75, 1000, 656);
			contentPanel.add(panel);
			panel.setLayout(car);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_1.setBackground(UIManager.getColor("CheckBox.background"));
				panel.add(panel_1, "name_82394534341500");
				panel_1.setLayout(null);
				{
					JLabel label = new JLabel("商品销售");
					label.setFont(new Font("微软雅黑", Font.BOLD, 25));
					label.setBounds(374, 23, 100, 30);
					panel_1.add(label);
				}
				{
					SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
					 lblx = new JLabel("xs"+sdf.format(new Date()));
					lblx.setForeground(Color.RED);
					lblx.setFont(new Font("微软雅黑", Font.BOLD, 17));
					lblx.setBounds(666, 52, 204, 18);
					panel_1.add(lblx);
				}
				{
					JPanel panel_2 = new JPanel();
					panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
					panel_2.setBackground(UIManager.getColor("CheckBox.background"));
					panel_2.setBounds(14, 80, 976, 76);
					panel_1.add(panel_2);
					panel_2.setLayout(null);
					{
						label = new JLabel("客户名称：");
						label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
						label.setBounds(48, 32, 117, 20);
						panel_2.add(label);
					}
					{
						label = new JLabel("销售日期：");
						label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
						label.setBounds(542, 36, 107, 19);
						panel_2.add(label);
					}
					Date now = new Date(); 
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
                 	String hehe = dateFormat.format( now ); 
					textField_7 = new JTextField(hehe);
					//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
					textField_7.setBackground(new Color(0,0,0,0));
					textField_7.setOpaque(false);
					//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
					textField_7.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
					textField_7.setFont(new Font("微软雅黑", Font.PLAIN, 16));
					textField_7.setBounds(659, 36, 175, 24);
					panel_2.add(textField_7);
					textField_7.setColumns(10);
					
					comboBox = new JComboBox();
					comboBox.setBackground(new Color(0,0,0,0));
					comboBox.setOpaque(false);
					//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
					comboBox.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
					comboBox.setBounds(145, 30, 107, 28);
					try {
						List<Sgoods_zengjia> vip=s.selectByAll();
						for (Sgoods_zengjia v:vip) {
//							System.out.println(vip);
//							System.out.println(v);
							comboBox.addItem(v);
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					panel_2.add(comboBox);
					comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				
				}
				
				scrollPane = new JScrollPane();
				scrollPane.setBounds(14, 269, 976, 251);
				panel_1.add(scrollPane);
				
				try {
					table = new JTable(getModel2());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setFont(new Font("微软雅黑", Font.BOLD, 17));
				JTableHeader head2 = table.getTableHeader(); // 创建表格标题对象
		        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
		        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
		        render2.setHorizontalAlignment(SwingConstants.CENTER);
		        table.setDefaultRenderer(Object.class, render2);
		        //线条颜色
//		        table.setGridColor(Color.red);
		        //设置行高
		        table.setRowHeight(30);

				scrollPane.setViewportView(table);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(14, 530, 976, 116);
				panel_1.add(panel_2);
				panel_2.setLayout(null);
				
				 radioButton = new JRadioButton("已审核");
				 radioButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				radioButton.setSelected(true);
				radioButton.setBounds(611, 24, 121, 42);
				panel_2.add(radioButton);
				
				 radioButton_1 = new JRadioButton("未审核");
				 radioButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				radioButton_1.setBounds(766, 24, 121, 40);
				panel_2.add(radioButton_1);
				
				
				//由于单选框只能选择一个，所以需要分组,且一个组中只能选一个
				ButtonGroup group = new ButtonGroup();
				group.add(radioButton);
				group.add(radioButton_1);
				
				
				
				
				{
					label = new JLabel("总数量：");
					label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
					label.setBounds(10, 42, 86, 24);
					panel_2.add(label);
				}
				
				JLabel label = new JLabel("总金额：");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(189, 42, 86, 24);
				panel_2.add(label);
				
				JLabel label_1 = new JLabel("经办人：");
				label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_1.setBounds(355, 42, 86, 24);
				panel_2.add(label_1);
				
				JButton btnf = new JButton("确定");
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						String saodd=lblx.getText();
						Sgoods_zengjia v=	(Sgoods_zengjia) comboBox.getSelectedItem(); 
						int vid=v.getVid();
						System.out.println(vid);
						Date sadate=new Date();
						double sacope=Double.parseDouble(label_3.getText());
						double sapaid=Double.parseDouble(label_3.getText());
						String saagent=(String) comboBox_1.getSelectedItem();
						if(radioButton.isSelected()) {
							Sgoods_jiujia g=new Sgoods_jiujia(saodd, vid, sadate, 0, sacope, sapaid, saagent);

							//库存出入库表（come）
							Sgoods_jiujia come=new Sgoods_jiujia(saodd, 2, sadate, saagent,0, sadate);
							try {
								xbiz.insertxiao(lxiao, g, come);
								JOptionPane.showMessageDialog(null, "销售商品成功");
								lxiao.clear();
								updateTable2();
								label_3.setText("");
								label_4.setText("");
								SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
								 lblx.setText("xs"+sdf.format(new Date()));
								 
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}else if(radioButton_1.isSelected()) {
							Sgoods_jiujia g=new Sgoods_jiujia(saodd, vid, sadate, 1, sacope, sapaid, saagent);
							
							//库存出入库表（come）
							Sgoods_jiujia come=new Sgoods_jiujia(saodd, 2, sadate, saagent,1, sadate);
							
							try {
								xbiz.insertxiaoshou(lxiao, g, come);
								JOptionPane.showMessageDialog(null, "销售商品成功，未审核");
								lxiao.clear();
								updateTable2();
								label_3.setText("");
								label_4.setText("");
								SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
								 lblx.setText("xs"+sdf.format(new Date()));
								 updateTable();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});
				btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnf.setBounds(606, 70, 126, 37);
				panel_2.add(btnf);
				
				JButton btnf_1 = new JButton("退出");
				btnf_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnf_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnf_1.setBounds(784, 70,127, 36);
				panel_2.add(btnf_1);
				
				label_3 = new JLabel("");
				label_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				label_3.setBounds(93, 43, 86, 23);
				panel_2.add(label_3);
				
				label_4 = new JLabel("");
				label_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				label_4.setBounds(291, 43, 70, 23);
				panel_2.add(label_4);
				
				 comboBox_1 = new JComboBox();
				 comboBox_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				comboBox_1.addItem(gui.label_2.getText());
				comboBox_1.setBounds(451, 42, 121, 34);
				panel_2.add(comboBox_1);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_3.setBounds(14, 190, 976, 69);
				panel_1.add(panel_3);
				panel_3.setLayout(null);
				{
					JButton button = new JButton("添加商品");
					button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							Sxmbg1fb1 fb1=new Sxmbg1fb1(new JFrameInterface() {
								
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return Sxmbg1.this;
								}
							});
						}
					});
					button.setFont(new Font("微软雅黑", Font.BOLD, 20));
					button.setBounds(60, 13, 154, 46);
					panel_3.add(button);
				}
				
				JButton button = new JButton("修改商品");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//先判断是否选中行
						if(table.getSelectedRow()<0){
							JOptionPane.showMessageDialog(null, "请先选中数据行");
						}else{
							//获得当前选中行的下标
							int row=table.getSelectedRow();
							//通过行获取该行中的列
							String gname=(String) table.getValueAt(row, 0);
							double gprice=(double) table.getValueAt(row, 1);
							String gspec=(String) table.getValueAt(row, 2);
							int stshu=(int) table.getValueAt(row, 3);
							double zsj=(double) table.getValueAt(row, 4);
							//将属性封装到个公共的商品对象中
							cj=new Sgoods_jiujia(gname, gprice, gspec,stshu,zsj);
							System.out.println(cj.toString());
							//打开新增窗口,将当前父窗口传到子窗口中
							Sxmbg1_1xg add=new Sxmbg1_1xg(new JFrameInterface() {
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return Sxmbg1.this;
								}
							});
						}
					}
				});
				button.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button.setBounds(243, 13, 154, 46);
				panel_3.add(button);
				
				JButton button_1 = new JButton("删除");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table.getSelectedRow();
						if(row>-1) {
							lxiao.remove(row);
							try {
								updateTable2();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "请选择数据");
						}
					}
				});
				button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button_1.setBounds(420, 13, 154, 46);
				panel_3.add(button_1);
			}
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_1.setBackground(UIManager.getColor("CheckBox.background"));
				panel.add(panel_1, "name_82398236976500");
				panel_1.setLayout(null);
				
				panel_2 = new JPanel();
				panel_2.setBounds(10, 10, 980, 66);
				panel_1.add(panel_2);
				panel_2.setLayout(null);
				
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table_1.getSelectedRow();
						if(row>-1) {
							list.remove(row);
							try {
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
				button.setIcon(new ImageIcon(Sxmbg1.class.getResource("/img/deleteSupply.png")));
				button.setBounds(31, 6, 57, 53);
				panel_2.add(button);
				
				JButton button_1 = new JButton("");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if(table_1.getSelectedRow()<0) {
							JOptionPane.showMessageDialog(null, "请选择行");
						}else {
							try {
								xbiz.insertxiaoshenhe(list2);
								
								list2.clear();
								updateTable3();
								updateTable();
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				});
				button_1.setIcon(new ImageIcon(Sxmbg1.class.getResource("/img/1622766948(1).jpg")));
				button_1.setBounds(121, 6, 65, 59);
				panel_2.add(button_1);
				
				JButton button_4 = new JButton("");
				button_4.setIcon(new ImageIcon(Sxmbg1.class.getResource("/img/exit.png")));
				button_4.setBounds(209, 6, 57, 53);
				panel_2.add(button_4);
				
				JPanel panel_3 = new JPanel();
				panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_3.setBounds(10, 86, 980, 79);
				panel_1.add(panel_3);
				panel_3.setLayout(null);
				
				JLabel label_1 = new JLabel("输入单据相关信息进行查询：");
				label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_1.setBounds(369, 21, 277, 37);
				panel_3.add(label_1);
				
				textField_6 = new JTextField();
				textField_6.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				textField_6.setBackground(new Color(0,0,0,0));
				textField_6.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_6.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
				textField_6.setBounds(627, 27, 86, 24);
				panel_3.add(textField_6);
				textField_6.setColumns(10);
				
				JButton btnf_2 = new JButton("查询");
				btnf_2.addActionListener(new ActionListener() {
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
				btnf_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf_2.setBounds(723, 21, 114, 37);
				panel_3.add(btnf_2);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 175, 980, 191);
				panel_1.add(scrollPane_1);
				
				
				try {
					table_1 = new JTable(getModel(findDb())){
						@Override
						public boolean isCellEditable(int row, int column) {
							// TODO Auto-generated method stub
							return false;
						}
					};
					table_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent a) {
							//获得当前选中行的下标
							int row=table_1.getSelectedRow();
							//System.out.println(row);
							//通过行获取该行中的列
							String saodd=(String) table_1.getValueAt(row, 2);
							String s=(String) table_1.getValueAt(row, 0);
							label_s.setText(s);
							try {
								 list2=ddao.selectByAll3(saodd);
//								 System.out.println(list2);
								updateTable3();
							} catch (Exception a1) {
								// TODO Auto-generated catch block
								a1.printStackTrace();
							}
						}
					});
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
				table_1.setFont(new Font("微软雅黑", Font.BOLD, 17));
				JTableHeader head2 = table_1.getTableHeader(); // 创建表格标题对象
		        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
		        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
		        render2.setHorizontalAlignment(SwingConstants.CENTER);
		        table_1.setDefaultRenderer(Object.class, render2);
		        //线条颜色
//		        table_1.setGridColor(Color.red);
		        //设置行高
		        table_1.setRowHeight(30);
				scrollPane_1.setViewportView(table_1);
				
				JPanel panel_4 = new JPanel();
				panel_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_4.setForeground(new Color(0, 206, 209));
				panel_4.setBounds(10, 376, 980, 66);
				panel_1.add(panel_4);
				panel_4.setLayout(null);
				
				JLabel label_2 = new JLabel("客户：");
				label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_2.setBounds(14, 24, 60, 18);
				panel_4.add(label_2);
				
				label_s = new JLabel();
				label_s.setForeground(new Color(0, 0, 255));
				label_s.setBackground(new Color(0,0,0,0));
				label_s.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				label_s.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
				label_s.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				label_s.setBounds(71, 24, 70, 20);
				panel_4.add(label_s);
				
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(10, 452, 980, 194);
				panel_1.add(scrollPane_2);
				
				try {
					table_2 = new JTable(getModel3());
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table_2.addMouseListener(new MouseAdapter() {
					
					@Override
					public void mouseClicked(MouseEvent e) {
//						try {
//							updateTable3();
//						} catch (Exception e1) {
//							// TODO Auto-generated catch block
//							e1.printStackTrace();
//						}
					}
				});
				table_2.setFont(new Font("微软雅黑", Font.BOLD, 17));
				JTableHeader head21 = table_2.getTableHeader(); // 创建表格标题对象
		        head21.setPreferredSize(new Dimension(head21.getWidth(), 35));// 设置表头大小
		        head21.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        DefaultTableCellRenderer render21 = new DefaultTableCellRenderer();
		        render21.setHorizontalAlignment(SwingConstants.CENTER);
		        table_2.setDefaultRenderer(Object.class, render21);
		        //线条颜色
//		        table_2.setGridColor(Color.red);
		        //设置行高
		        table_2.setRowHeight(30);
				scrollPane_2.setViewportView(table_2);
				
			}
		}
		setModal(true);
		setVisible(true);
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel(List<S_xiaotui> list) throws Exception{
		//创建表头
		Object[] head={"客户名称","日期","单号","应付金额","实付金额","经办人"};
		DefaultTableModel tm=null;
//	    list=xtdao.selectByAll();
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				S_xiaotui g=list.get(i);
				body[i][j++]=g.getVname();
				body[i][j++]=g.getVdate();
				body[i][j++]=g.getSaodd();
				body[i][j++]=g.getSacope();
				body[i][j++]=g.getSapaid();
				body[i][j++]=g.getSaagent();
				
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	
	/**
	 * 通用查询
	 * @return
	 * @throws Exception 
	 */
	public List<S_xiaotui> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_6.getText().equals(null) || textField_6.getText().equals("")){
			list=xtdao.selectByAll();
		}else{
			list=xtdao.selectByAll(textField_6.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_1.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_1);
		//通知面板立即生效
		scrollPane_1.validate();
		}
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		double zje=0;
		int zsl=0;
		Object[] head={"商品名称","售价","单位","数量","总金额"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list2);
		if(lxiao.size()>0){
			//表主体
			Object[][] body=new Object[lxiao.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Sgoods_jiujia g=lxiao.get(i);
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getStshu()*g.getGprice();
				zje+=g.getGprice()*g.getStshu();
				label_3.setText(zje+"");
				label_4.setText(zje+"");
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTable2() throws Exception{
		//重新建模
		table.setModel(getModel2());
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
		}

	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel3() throws Exception{
		//创建表头
		
		Object[] head={"商品编号","商品名称","规格","数量","总金额"};
		DefaultTableModel tm=null;
//		System.out.println("PPPP"+list2);
//	    list=xtdao.selectByAll();
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				S_danju_xiangqin g=list2.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getSdshu();
				body[i][j++]=g.getGprice()*g.getSdshu();
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTable3() throws Exception{
		//重新建模
		table_2.setModel(getModel3());
		//创建将表格加入滚动面板中
		scrollPane_2.setViewportView(table_2);
		//通知面板立即生效
		scrollPane_2.validate();
		}
}
