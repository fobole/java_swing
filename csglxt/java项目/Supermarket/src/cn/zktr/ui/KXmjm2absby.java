package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;


import cn.zktr.dao.Cgoods_dao;
import cn.zktr.entity.Cgoods_jiujia;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KXmjm2absby extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	JTable table_2;
	private JTextField textField;
	JPanel panel_5;
	private JTable table_1;
	private JTable table_1_1;
	List<Cgoods_jiujia> list=new ArrayList<Cgoods_jiujia>();
	Cgoods_dao gdao=new Cgoods_dao();
	JScrollPane scrollPane;
	
	Cgoods_jiujia cj;
	//临时集合
	List<Cgoods_jiujia> list2=new ArrayList<Cgoods_jiujia>();
	JScrollPane scrollPane_1;
	
	Cgoods_jiujia g;
	KXmjm2bsby gui;
	/**
	 * 旧商品添加 采购退货
	 */
//	 public static void main(String[] args) {
//	        EventQueue.invokeLater(new Runnable() {
//	            @Override
//	            public void run() {
//	            	KXmjm2absby frame = new KXmjm2absby();
//	                frame.setVisible(true);
//	               
//	            }
//	        });
//	    }
	/**
	 * Create the dialog.
	 */
	public KXmjm2absby(JFrameInterface jframe) {
		//将传回的父窗口进行接收
		this.gui=(KXmjm2bsby) jframe.getJFrame();
		  try {
			  
			// 设置本属性将改变窗口边框样式定义
			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
			  UIManager.put("RootPane.setupButtonVisible", false);
			  // 启用皮肤
			BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		setTitle("增加商品（商品报损）");
		setBounds(100, 100, 1331, 813);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 731, 749);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_3 = new JPanel();
				panel_3.setBounds(0, 0, 695, 126);
				panel.add(panel_3);
				panel_3.setLayout(null);
				{
					JLabel label = new JLabel("查询商品列表");
					label.setFont(new Font("微软雅黑", Font.BOLD, 20));
					label.setBounds(10, 0, 139, 31);
					panel_3.add(label);
				}
				{
					JLabel label = new JLabel("请输入商品编号或名称查询商品，查询到商品后添加到右边所选商品");
					label.setFont(new Font("微软雅黑", Font.BOLD, 20));
					label.setBounds(24, 41, 661, 24);
					panel_3.add(label);
				}
				{
					JLabel label = new JLabel("输入商品编号或名称查询商品：");
					label.setFont(new Font("微软雅黑", Font.BOLD, 20));
					label.setBounds(10, 75, 353, 33);
					panel_3.add(label);
				}
				{
					textField = new JTextField();
					textField.setFont(new Font("微软雅黑", Font.BOLD, 15));
					textField.setBounds(324, 79, 110, 29);
					panel_3.add(textField);
					textField.setColumns(10);
				}
				{
					JButton btnf_3 = new JButton("查询商品");
					btnf_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
//							Caigou_geshu_ui c=new Caigou_geshu_ui();
							//刷新表格
							try {
								updateTable();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					btnf_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnf_3.setBounds(469, 76, 150, 33);
					panel_3.add(btnf_3);
				}
			}
			{
				JPanel panel_4 = new JPanel();
				panel_4.setBounds(0, 136, 695, 69);
				panel.add(panel_4);
				panel_4.setLayout(null);
				
				JButton button = new JButton("商品清单");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("商品清单")) {
//							cl_panel_5.show(panel_5, "name_233127670889600");
						}
					}
				});
				button.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button.setBounds(0, 26, 113, 46);
				panel_4.add(button);
				
				JButton button_1 = new JButton("商品列表");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
//						Caigou_geshu_ui c=new Caigou_geshu_ui();
					}
				});
				button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button_1.setBounds(106, 26, 113, 46);
				panel_4.add(button_1);
			}
			
			panel_5 = new JPanel();
			panel_5.setBounds(0, 203, 731, 546);
			panel.add(panel_5);
			panel_5.setLayout(null);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 0, 734, 546);
			panel_5.add(panel_2);
			panel_2.setLayout(null);
			{
				 scrollPane = new JScrollPane();
				scrollPane.setBounds(0, 10, 734, 536);
				panel_2.add(scrollPane);
				{
					table_1 = new JTable();
						try {
						
						table_1_1 = new JTable(getModel(findDb())){
							@Override
							public boolean isCellEditable(int row, int column) {
								// TODO Auto-generated method stub
								return false;
							}
						};
						table_1_1.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								 if (e.getClickCount() == 2) {
									//先判断是否选中行
										if(table_1_1.getSelectedRow()<0){
											JOptionPane.showMessageDialog(null, "请先选中数据行");
										}else{
											//获得当前选中行的下标
											int row=table_1_1.getSelectedRow();
											//通过行获取该行中的列
											int gid=(int) table_1_1.getValueAt(row, 0);
											String gname=(String) table_1_1.getValueAt(row, 1);
											double gbid=(double) table_1_1.getValueAt(row, 2);
											double gprice=(double) table_1_1.getValueAt(row, 3);
											String gspec=(String) table_1_1.getValueAt(row, 4);
											int stshu=(int) table_1_1.getValueAt(row, 5);
											//将属性封装到个公共的商品对象中
											cj=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec,stshu);
//											System.out.println(cj.toString());
											//打开新增窗口,将当前父窗口传到子窗口中
											Kbsby2a1 add=new Kbsby2a1(new JFrameInterface() {
												@Override
												public JDialog getJFrame() {
													// TODO Auto-generated method stub
													return KXmjm2absby.this;
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
						JTableHeader head = table_1_1.getTableHeader(); // 创建表格标题对象
				        head.setPreferredSize(new Dimension(head.getWidth(), 42));// 设置表头大小
				        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
				        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
				        ((DefaultTableCellRenderer) table_1_1.getTableHeader().getDefaultRenderer())
				        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
				        render.setHorizontalAlignment(SwingConstants.CENTER);
				        table_1_1.setDefaultRenderer(Object.class, render);
				        //线条颜色
//				        table_1.setGridColor(Color.red);
			        //设置行高
			        table_1_1.setRowHeight(35);
					table_1_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
					scrollPane.setViewportView(table_1_1);
				}
			}
		}
		{
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(741, 0, 584, 749);
			contentPanel.add(panel_2);
			panel_2.setLayout(null);
			{
				JLabel label = new JLabel("所选商品");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(10, 10, 95, 32);
				panel_2.add(label);
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 53, 566, 616);
				panel_2.add(scrollPane_1);
				{
					table = new JTable();
					try {
						
						table_2 = new JTable(getModel2()){
							
							@Override
							public boolean isCellEditable(int row, int column) {
								// TODO Auto-generated method stub
								return false;
							}
						};
						table_2.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								 if (e.getClickCount() == 2) {
								 }
							}
						});
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					JTableHeader head = table_2.getTableHeader(); // 创建表格标题对象
			        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
			        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
			        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			        render.setHorizontalAlignment(SwingConstants.CENTER);
			        table_2.setDefaultRenderer(Object.class, render);
			        //线条颜色
//			        table_1.setGridColor(Color.red);
			        //设置行高
			        table_2.setRowHeight(35);
					table_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
					
					scrollPane_1.setViewportView(table_2);
				}
			}
			{
				JButton btnf = new JButton("修改");
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//先判断是否选中行
						if(table_2.getSelectedRow()<0){
							JOptionPane.showMessageDialog(null, "请先选中数据行");
						}else{
							//获得当前选中行的下标
							int row=table_1_1.getSelectedRow();
							//通过行获取该行中的列
							int gid=(int) table_1_1.getValueAt(row, 0);
							String gname=(String) table_1_1.getValueAt(row, 1);
							double gbid=(double) table_1_1.getValueAt(row, 2);
							double gprice=(double) table_1_1.getValueAt(row, 3);
							String gspec=(String) table_1_1.getValueAt(row, 4);
							int stshu=(int) table_1_1.getValueAt(row, 5);
							//将属性封装到个公共的商品对象中
							cj=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec,stshu);
//							System.out.println(cj.toString());
							//打开新增窗口,将当前父窗口传到子窗口中
							Kbsby2a2 add=new Kbsby2a2(new JFrameInterface() {
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return KXmjm2absby.this;
								}
							});
						}
					}
					
				});
				btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf.setBounds(43, 701, 95, 27);
				panel_2.add(btnf);
			}
			{
				JButton btndel = new JButton("删除");
				btndel.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						int row=table_2.getSelectedRow();
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
				btndel.setBounds(172, 701, 103, 27);
				panel_2.add(btndel);
			}
			{
				JButton btnf_1 = new JButton("确定");
				btnf_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						for (int i = 0; i < list2.size(); i++) {
							g=list2.get(i);
							gui.listcai.add(g);
						}
						try {
							gui.updateTablecai();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
//						cai.panel_1.validate(); 
//						cai.panel_1.repaint(); 
//						cai.panel_1.revalidate();

						KXmjm2absby.this.dispose();
					}
				});
				btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnf_1.setBounds(301, 701, 95, 27);
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
				btnf_2.setBounds(422, 701, 95, 27);
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
	public DefaultTableModel getModel(List<Cgoods_jiujia> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","进价","售价","单位","库存","类型"};
		DefaultTableModel tm=null;
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Cgoods_jiujia g=list.get(i);
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
	public List<Cgoods_jiujia> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			list=gdao.selectByAll();
		}else{
			list=gdao.selectByAll(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_1_1.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table_1_1);
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
		Object[] head={"商品名称","进价","单位","数量","总金额"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list2);
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Cgoods_jiujia g=list2.get(i);
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getStshu()*g.getGbid();
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
		table_2.setModel(getModel2());
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_2);
		//通知面板立即生效
		scrollPane_1.validate();
		}
}
