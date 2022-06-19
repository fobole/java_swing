/*
 * 添加商品
 */
package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import cn.zktr.dao.Sgoods_dao2;
import cn.zktr.dao.Sgoods_dao;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.Sxm4zuo;

import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sxmbg1fb1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JTable table;
	private JTextField textField;
	CardLayout cl_panel_5=new CardLayout();
	JPanel panel_5;
	JButton btnf_3;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	
	
	List<Sgoods_jiujia> list=new ArrayList<Sgoods_jiujia>();
	Sgoods_dao2 gdao=new Sgoods_dao2();
	JScrollPane scrollPane;
	
	
	Sgoods_jiujia cj;
	//临时集合
	List<Sgoods_jiujia> list2=new ArrayList<Sgoods_jiujia>();
	JScrollPane scrollPane_1;
	protected Sgoods g;
	
	Sxmbg1 xiao;

	/**
	 * Create the dialog.
	 */
	public Sxmbg1fb1(JFrameInterface j) {
		this.xiao=(Sxmbg1) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg1fb1.class.getResource("/img/logo544.png")));
		setTitle("增加商品(商品销售)");
		setBounds(100, 100, 1312, 770);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel.setBounds(14, 13, 731, 701);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(14, 10, 707, 123);
				panel.add(panel_3);
				panel_3.setLayout(null);
				{
					JLabel label = new JLabel("查询商品列表");
					label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
					label.setBounds(14, 13, 137, 18);
					panel_3.add(label);
				}
				{
					JLabel label = new JLabel("请输入商品编号或名称查询商品，查询到商品后添加到右边所选商品");
					label.setFont(new Font("微软雅黑", Font.PLAIN, 19));
					label.setBounds(14, 41, 583, 21);
					panel_3.add(label);
				}
				{
					JLabel label = new JLabel("输入商品编号或名称查询商品：");
					label.setFont(new Font("微软雅黑", Font.PLAIN, 19));
					label.setBounds(14, 78, 274, 27);
					panel_3.add(label);
				}
				{
					textField = new JTextField();
					textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
					textField.setBackground(new Color(0,0,0,0));
					textField.setOpaque(false);
					//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
					textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
					textField.setBounds(285, 81, 108, 24);
					panel_3.add(textField);
					textField.setColumns(10);
				}
				{
					btnf_3 = new JButton("查询");
					btnf_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent arg0) {
							//刷新表格
							try {
								updateTable();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
//							Sxmbg1fb2 s=new Sxmbg1fb2(new JFrameInterface() {
//								
//								@Override
//								public JDialog getJFrame() {
//									// TODO Auto-generated method stub
//									return Sxmbg1fb1.this;
//								}
//							});
						
							}
					});
					btnf_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnf_3.setBounds(414, 72, 183, 33);
					panel_3.add(btnf_3);
				}
			}
			{
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(14, 138, 707, 63);
				panel.add(panel_4);
				panel_4.setLayout(null);
				
				JButton button = new JButton("商品清单");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("商品清单")) {
							cl_panel_5.show(panel_5, "name_233127670889600");
						}
					}
				});
				button.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button.setBounds(10, 10, 125, 53);
				panel_4.add(button);
			}
			
			panel_5 = new JPanel();
			panel_5.setBounds(14, 196, 707, 495);
			panel.add(panel_5);
			panel_5.setLayout(cl_panel_5);
			
			JPanel panel_2 = new JPanel();
			panel_5.add(panel_2, "name_233127670889600");
			panel_2.setLayout(null);
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 20, 687, 475);
				panel_2.add(scrollPane);
				{
					try {
						table_1 = new JTable(getModel(findDb())) {
							@Override
						public boolean isCellEditable(int row, int column) {
							// TODO Auto-generated method stub
							return false;
						}};
						table_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								 if (e.getClickCount() == 2) {
										//先判断是否选中行
											if(table_1.getSelectedRow()<0){
												JOptionPane.showMessageDialog(null, "请先选中数据行");
											}else{
												//获得当前选中行的下标
												int row=table_1.getSelectedRow();
												//通过行获取该行中的列
												int gid=(int) table_1.getValueAt(row, 0);
												String gname=(String) table_1.getValueAt(row, 1);
												double gbid=(double) table_1.getValueAt(row, 2);
												double gprice=(double) table_1.getValueAt(row, 3);
												String gspec=(String) table_1.getValueAt(row, 4);
												int stshu=(int) table_1.getValueAt(row, 5);
												//将属性封装到个公共的商品对象中
												cj=new Sgoods_jiujia(gid, gname, gbid, gprice, gspec,stshu);
												
												
												//打开新增窗口,将当前父窗口传到子窗口中
												Sxmbg1fb2 add=new Sxmbg1fb2(new JFrameInterface() {
													@Override
													public JDialog getJFrame() {
														// TODO Auto-generated method stub
														return Sxmbg1fb1.this;
													}
												});
											}
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
			        head2.setFont(new Font("微软雅黑", Font.BOLD, 16));// 设置表格字体
			        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
			        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
			        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
			        render2.setHorizontalAlignment(SwingConstants.CENTER);
			        table_1.setDefaultRenderer(Object.class, render2);
			        //线条颜色
//			        table_1.setGridColor(Color.red);
			        //设置行高
			        table_1.setRowHeight(30);
					scrollPane.setViewportView(table_1);
				}
			}
		}
		{
			JPanel panel_2 = new JPanel();
			panel_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
			panel_2.setBounds(755, 13, 541, 701);
			contentPanel.add(panel_2);
			panel_2.setLayout(null);
			{
				JLabel label = new JLabel("所选商品");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(14, 13, 92, 23);
				panel_2.add(label);
			}
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 46, 521, 511);
				panel_2.add(scrollPane);
				{
					table = new JTable();
						
						
						try {
							table = new JTable(getModel2()){
								
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
						table.setFont(new Font("微软雅黑", Font.BOLD, 17));
						JTableHeader head2 = table.getTableHeader(); // 创建表格标题对象
				        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
				        head2.setFont(new Font("微软雅黑", Font.BOLD, 16));// 设置表格字体
				        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
				        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
				        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
				        render2.setHorizontalAlignment(SwingConstants.CENTER);
				        table.setDefaultRenderer(Object.class, render2);
				        //线条颜色
//				        table.setGridColor(Color.red);
				        //设置行高
				        table.setRowHeight(35);
					scrollPane.setViewportView(table);
				}
			}
			{
				JButton btnf = new JButton("修改");
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//先判断是否选中行
						if(table_1.getSelectedRow()<0){
							JOptionPane.showMessageDialog(null, "请先选中数据行");
						}else{
							//获得当前选中行的下标
							int row=table_1.getSelectedRow();
							//通过行获取该行中的列
							int gid=(int) table_1.getValueAt(row, 0);
							String gname=(String) table_1.getValueAt(row, 1);
							double gbid=(double) table_1.getValueAt(row, 2);
							double gprice=(double) table_1.getValueAt(row, 3);
							String gspec=(String) table_1.getValueAt(row, 4);
							int stshu=(int) table_1.getValueAt(row, 5);
							//将属性封装到个公共的商品对象中
							cj=new Sgoods_jiujia(gid, gname, gbid, gprice, gspec);
//							
							//打开新增窗口,将当前父窗口传到子窗口中
							Sxmbg1fb2xg add=new Sxmbg1fb2xg(new JFrameInterface() {
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return Sxmbg1fb1.this;
								}
							});
						}
					}
				});
				btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf.setBounds(10, 601, 119, 37);
				panel_2.add(btnf);
			}
			{
				JButton btndel = new JButton("删除");
				btndel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table.getSelectedRow();
						if(row>-1) {
							list2.remove(row);
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
				btndel.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btndel.setBounds(139, 601, 119, 37);
				panel_2.add(btndel);
			}
			{
				JButton btnf_1 = new JButton("确定");
				btnf_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (Sgoods_jiujia c : list2) {
							xiao.lxiao.add(c);
						}
						try {
							xiao.updateTable2();
							Sxmbg1fb1.this.dispose();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf_1.setBounds(268, 601, 119, 37);
				panel_2.add(btnf_1);
			}
			{
				JButton btnf_2 = new JButton("取消");
				btnf_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnf_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf_2.setBounds(397, 601, 114, 37);
				panel_2.add(btnf_2);
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
	public DefaultTableModel getModel(List<Sgoods_jiujia> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","进价","售价","单位","库存","类型"};
		DefaultTableModel tm=null;
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Sgoods_jiujia g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getCtype();
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
	public List<Sgoods_jiujia> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			list=gdao.selectByAllx();
		}else{
			list=gdao.selectByAllx(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_1.setModel(getModel(findDb()));
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
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		Object[] head={"商品名称","售价","单位","数量","总金额"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list2);
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Sgoods_jiujia g=list2.get(i);
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getStshu()*g.getGprice();	
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
}
