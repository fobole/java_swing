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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Kcpd1biz;
import cn.zktr.dao.KcpdbizDao;
import cn.zktr.dao.KkcpdDao;
import cn.zktr.dao.KkcpdDao1;
import cn.zktr.dao.KkcpdDao4;
import cn.zktr.dao.KkcpdDao5;
import cn.zktr.entity.Kkcpd1;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd3;
import cn.zktr.entity.Kkcpd4;
import cn.zktr.entity.Kkcpd5;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KXmjm1Kcpd extends JDialog {

	private final JPanel contentPanel = new JPanel();
	CardLayout car=new CardLayout();
	JPanel panel ;
	private JTable table;
	 JTable table_4;
	private JTable table_1;
	private JTable table_2;
	private JTable table_2_1;
	private JTable table_3;
	private JTable table_3_1;
	JScrollPane scrollPane;
	
	JScrollPane scrollPane_7;
	List<Kkcpd1> list=new ArrayList<Kkcpd1>();
	KkcpdDao gdao=new KkcpdDao();
	
	KkcpdDao1 gdao2=new KkcpdDao1();
	JScrollPane scrollPane_1 ;
	List<Kkcpd4> list3=new ArrayList<Kkcpd4>();
	KkcpdDao4 gdao3=new KkcpdDao4();
	
	JScrollPane scrollPane_2 ;
	List<Kkcpd5> list4=new ArrayList<Kkcpd5>();
	KkcpdDao5 gdao4=new KkcpdDao5();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	List<Kkcpd3> list2=new ArrayList<Kkcpd3>();
	Kcpd1biz pbiz=new Kcpd1biz();
	KcpdbizDao pdao=new KcpdbizDao();
	
	
	JLabel lblNewLabel_8;
	
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
//			KXmjm1Kcpd dialog = new KXmjm1Kcpd();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public KXmjm1Kcpd(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setTitle("库存盘点");
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm1Kcpd.class.getResource("/Img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);

		setBounds(100, 100, 1213, 800);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnNewButton = new JButton("盘点列表");
			btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if(but.getText().equals("盘点列表")) {
						car.show(panel,"name_950002586863400");
					}
				}
			});
			btnNewButton.setBounds(0, 10, 187, 37);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("历史盘点查询");
			btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if(but.getText().equals("历史盘点查询")) {
						car.show(panel,"name_950075715240000");
					}
				}
			});
			btnNewButton_1.setBounds(188, 10, 172, 37);
			contentPanel.add(btnNewButton_1);
		}
		{
			panel = new JPanel();
			panel.setBounds(0, 52, 1194, 719);
			contentPanel.add(panel);
			panel.setLayout(car);
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, "name_950002586863400");
				panel_1.setLayout(null);
				{
					JLabel lblNewLabel_1 = new JLabel("盘点单列表");
					lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
					lblNewLabel_1.setBounds(10, 20, 252, 27);
					panel_1.add(lblNewLabel_1);
				}
				{
					JButton btnNewButton_4 = new JButton("删除盘点单");
					btnNewButton_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton_4.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
//							
//							int row=table_4.getSelectedRow();
//							if(row>-1) {
//								list2.remove(row);
//								try {
//									updateTable2();
//								} catch (Exception e1) {
//									// TODO Auto-generated catch block
//									e1.printStackTrace();
//								}
//							}else {
//								JOptionPane.showMessageDialog(null, "请选择数据");
//							}
							KXmjm1a1kcpd d=new KXmjm1a1kcpd(new JFrameInterface() {
								
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									
									return KXmjm1Kcpd.this;
								}
							});
							
//							
						}
					});
					
					btnNewButton_4.setIcon(null);
					btnNewButton_4.setBounds(630, 64, 137, 42);
					panel_1.add(btnNewButton_4);
				}
				{
					JButton btnNewButton_5 = new JButton("高级查询");
					btnNewButton_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton_5.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							KXjm1a2kcpd f=new KXjm1a2kcpd();
						}
					});
					btnNewButton_5.setIcon(null);
					btnNewButton_5.setBounds(933, 65, 123, 40);
					panel_1.add(btnNewButton_5);
				}
				{
					JButton btnNewButton_2 = new JButton("修改盘点单");
					btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton_2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
						}
					});
					btnNewButton_2.setIcon(null);
					btnNewButton_2.setBounds(371, 64, 137, 42);
					panel_1.add(btnNewButton_2);
				}
				{
					JButton btnNewButton_3 = new JButton("添加盘点单");
					btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton_3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							KXmjm1aKcpd b=new KXmjm1aKcpd(new JFrameInterface() {
								
								@Override
								public JDialog getJFrame() {
									// TODO Auto-generated method stub
									return KXmjm1Kcpd.this;
								}
							});
						}
					});
					btnNewButton_3.setIcon(null);
					btnNewButton_3.setBounds(91, 64, 137, 42);
					panel_1.add(btnNewButton_3);
				}
				{
					 scrollPane_7 = new JScrollPane();
					scrollPane_7.setBounds(10, 130, 1174, 228);
					panel_1.add(scrollPane_7);
					
//					table = new JTable();
//					table.setFont(new Font("微软雅黑", Font.BOLD, 14));

					try {
						table_4 = new JTable(getModel()){
							@Override
							public boolean isCellEditable(int row, int column) {
								// TODO Auto-generated method stub
								return false;
							}
						};
						table_4.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseClicked(MouseEvent e) {
								if(table_4.getSelectedRow()<0) {
									JOptionPane.showMessageDialog(null, "");
								}else {
									int row=table_4.getSelectedRow();
									String dh=(String) table_4.getValueAt(row, 0);
									try {
										list2=pdao.selectByAll(dh);
										updateTable2();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
							}
						});
						table_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					JTableHeader head = table_4.getTableHeader(); // 创建表格标题对象
			        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
			        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
			        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
			        ((DefaultTableCellRenderer) table_4.getTableHeader().getDefaultRenderer())
			        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
			        render.setHorizontalAlignment(SwingConstants.CENTER);
			        table_4.setDefaultRenderer(Object.class, render);
			        table_4.setRowHeight(35);
			        //线条颜色
//			        table_1.setGridColor(Color.red);
					scrollPane_7.setViewportView(table_4);
				}
				
				 scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 420, 1174, 289);
				panel_1.add(scrollPane);
				
				
				try {
					table_1 = new JTable(getModel2()){
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
				JTableHeader head = table_1.getTableHeader(); // 创建表格标题对象
		        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
		        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        render.setHorizontalAlignment(SwingConstants.CENTER);
		        table_1.setDefaultRenderer(Object.class, render);
		        //线条颜色
//		        table_1.setGridColor(Color.red);
				table_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				
				scrollPane.setViewportView(table_1);
				
				JLabel lblNewLabel_5 = new JLabel("盘点商品明细");
				lblNewLabel_5.setForeground(new Color(255, 0, 0));
				lblNewLabel_5.setFont(new Font("微软雅黑", Font.BOLD, 19));
				lblNewLabel_5.setBounds(10, 368, 117, 26);
				panel_1.add(lblNewLabel_5);
				
				JLabel lblNewLabel_6 = new JLabel("盘点单号:");
				lblNewLabel_6.setFont(new Font("微软雅黑", Font.BOLD, 19));
				lblNewLabel_6.setBounds(154, 368, 90, 26);
				panel_1.add(lblNewLabel_6);
				
				JLabel lblNewLabel_7 = new JLabel("pd"+new Date().getTime());
				lblNewLabel_7.setForeground(new Color(255, 0, 0));
				lblNewLabel_7.setFont(new Font("微软雅黑", Font.BOLD, 18));
				lblNewLabel_7.setBounds(270, 369, 210, 26);
				panel_1.add(lblNewLabel_7);
				
				lblNewLabel_8 = new JLabel(gui.label_2.getText());
				lblNewLabel_8.setBounds(326, 31, -1, 15);
				panel_1.add(lblNewLabel_8);
			}
			{
				JPanel panel_1 = new JPanel();
				panel.add(panel_1, "name_950075715240000");
				panel_1.setLayout(null);
				{
					JLabel lblNewLabel = new JLabel("查询日期：");
					lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
					lblNewLabel.setBounds(10, 34, 119, 25);
					panel_1.add(lblNewLabel);
				}
				
				JLabel lblNewLabel_2 = new JLabel("至");
				lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_2.setBounds(281, 37, 24, 18);
				panel_1.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("类型名称");
				lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_3.setBounds(517, 17, 100, 50);
				panel_1.add(lblNewLabel_3);
				
				JComboBox comboBox_2 = new JComboBox();
				comboBox_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"所有仓库", "酒库", "饮料库", "主仓库"}));
				comboBox_2.setBounds(614, 23, 143, 38);
				panel_1.add(comboBox_2);
				
				textField = new JTextField();
				textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
				textField.setBounds(856, 27, 131, 37);
				panel_1.add(textField);
				textField.setColumns(10);
				
				JLabel lblNewLabel_4 = new JLabel("编号查询：");
				lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_4.setBounds(767, 23, 100, 38);
				panel_1.add(lblNewLabel_4);
				
				JButton btnNewButton_6 = new JButton("查询");
				btnNewButton_6.addActionListener(new ActionListener() {
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
				btnNewButton_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnNewButton_6.setBounds(1047, 24, 93, 36);
				panel_1.add(btnNewButton_6);
				
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 90, 1174, 619);
				panel_1.add(scrollPane_1);
				
				table_2 = new JTable();
				try {
					
					table_2_1 = new JTable(getModel3(findDb())){
						
						@Override
						public boolean isCellEditable(int row, int column) {
							// TODO Auto-generated method stub
							return false;
						}
					};
					table_2_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							if(table_2_1.getSelectedRow()<0) {
								JOptionPane.showMessageDialog(null, "请选择数据行");
							}else {
								try {
									
									int row=table_2_1.getSelectedRow();
									String dh=(String) table_2_1.getValueAt(row, 2);
									
									
									list4=gdao4.selectByAll(dh);
//									System.out.println(list4);
									updateTable2();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
							
						}
					});
					table_2_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JTableHeader head = table_2_1.getTableHeader(); // 创建表格标题对象
		        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
		        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
		        ((DefaultTableCellRenderer) table_2_1.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        render.setHorizontalAlignment(SwingConstants.CENTER);
		        table_2_1.setDefaultRenderer(Object.class, render);
		        table_2_1.setRowHeight(35);
		        //线条颜色
//		        table_1.setGridColor(Color.red);
			
				scrollPane_1.setViewportView(table_2_1);
				
				scrollPane_2 = new JScrollPane();
				scrollPane_2.setBounds(10, 711, 1174, -2);
				panel_1.add(scrollPane_2);
				
				table_3 = new JTable();
				try {
					table_3_1 = new JTable(getModel4()){
						@Override
						public boolean isCellEditable(int row, int column) {
							// TODO Auto-generated method stub
							return false;
						}
					};
					table_3_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				JTableHeader head1 = table_3_1.getTableHeader(); // 创建表格标题对象
		        head1.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
		        head1.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
		        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
		        ((DefaultTableCellRenderer) table_3_1.getTableHeader().getDefaultRenderer())
		        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
		        render1.setHorizontalAlignment(SwingConstants.CENTER);
		        table_3_1.setDefaultRenderer(Object.class, render1);
		        //线条颜色
//		        table_1.setGridColor(Color.red);
				scrollPane_2.setViewportView(table_3_1);
				
				textField_1 = new JTextField();
				 Chooser ser = Chooser.getInstance();
			      
			        textField_1.setBounds(10, 10, 200, 30);
			        textField_1.setText("2021-7-13");
			        ser.register(textField_1);
				textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				textField_1.setForeground(new Color(0, 0, 0));
				textField_1.setBounds(108, 30, 131, 37);
				panel_1.add(textField_1);
				textField_1.setColumns(10);
				
				textField_2 = new JTextField();
				 Chooser ser1 = Chooser.getInstance();
			       
			        textField_2.setBounds(350, 30, 200, 30);
			        textField_2.setText("2021-7-19");
			        ser1.register(textField_2);
				textField_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				textField_2.setBounds(330, 33, 131, 34);
				panel_1.add(textField_2);
				textField_2.setColumns(10);
			}
				
		}
		setVisible(true);
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception yy
	 */
	public DefaultTableModel getModel() throws Exception{
		//创建表头
		Object[] head={"盘点单号","日期","操作员","商品条数","商品数量","备注"};
		DefaultTableModel tm=null;
		list=gdao.selectByAll();	
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcpd1 g=list.get(i);
				body[i][j++]=g.getLodd();
				body[i][j++]=g.getLdate();
				body[i][j++]=g.getLopera();
				body[i][j++]=g.getLtiao();
				body[i][j++]=g.getLshu();
				body[i][j++]=g.getChremarks();
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTablelcy() throws Exception{
		//重新建模
		table_4.setModel(getModel());
		//创建将表格加入滚动面板中
		scrollPane_7.setViewportView(table_4);
		//通知面板立即生效
		scrollPane_7.validate();
		}
	
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel3(List<Kkcpd4> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","盘点单号","单位","库存数量","盘点日期","盘点数量"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list3);
		if(list3.size()>0){
			//表主体
			Object[][] body=new Object[list3.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcpd4 g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getLodd();
				
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getLdate();
				body[i][j++]=g.getChpanshu();
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
	public List<Kkcpd4> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			list3=gdao3.selectByAll();
		}else{
			list3=gdao3.selectByAll(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list3;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_2_1.setModel(getModel3(findDb()));
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_2_1);
		//通知面板立即生效
		scrollPane_1.validate();
		}
	
	
	//历史盘点2
	public DefaultTableModel getModel4() throws Exception{
		//创建表头
		Object[] head={"进货序号","进货日期","进货数量","盘点时剩余数量","盘点数量"};
		DefaultTableModel tm=null;
	
			
			
		if(list4.size()>0){
			//表主体
			Object[][] body=new Object[list4.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcpd5 g=list4.get(i);
				body[i][j++]=g.getPid();
				body[i][j++]=g.getPdate();
				body[i][j++]=g.getXpshu();
				body[i][j++]=g.getChkushu();
				body[i][j++]=g.getChpanshu();
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTable4() throws Exception{
		//重新建模
		table_3_1.setModel(getModel4());
		//创建将表格加入滚动面板中
		scrollPane_2.setViewportView(table_3_1);
		//通知面板立即生效
		scrollPane_2.validate();
		}

	
	
	
	//第二个表格
		public DefaultTableModel getModel2() throws Exception{
			//创建表头
			Object[] head={"商品编号","商品名称","进价","售价","单位","库存"};
			DefaultTableModel tm=null;
			
			if(list2.size()>0){
				//表主体
				Object[][] body=new Object[list2.size()][head.length];
				int j=0;
				for (int i = 0; i < body.length; i++) {
					Kkcpd3 g=list2.get(i);
					body[i][j++]=g.getGid();
					body[i][j++]=g.getGname();
					body[i][j++]=g.getGbid();
					body[i][j++]=g.getGprice();
					body[i][j++]=g.getGspec();
					body[i][j++]=g.getStshu();
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
			table_1.setModel(getModel2());
			//创建将表格加入滚动面板中
			scrollPane.setViewportView(table_1);
			//通知面板立即生效
			scrollPane.validate();
			}
}
