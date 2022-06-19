package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Kcpd1biz;
import cn.zktr.dao.KbsbyDao1;
import cn.zktr.dao.KbsbyDao2;
import cn.zktr.dao.KcpdbizDao;
import cn.zktr.dao.KkcpdDao5;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Kbsby1;
import cn.zktr.entity.Kbsby2;
import cn.zktr.entity.Kbsbykc;
import cn.zktr.entity.Kkcpd4;
import cn.zktr.entity.Kkcpd5;

import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JFormattedTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class KXmjm2bsby extends JDialog {

	private final JPanel contentPanel = new JPanel();
	CardLayout car=new CardLayout();
	JPanel panel_1 ;
	private JTable table;
	private JTable table_3;
	private JTable table_1;
	private JTable table_2;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_5;
	//采购单临时集合
		JScrollPane scrollPane;
		List<Cgoods_jiujia> listcai=new ArrayList<Cgoods_jiujia>();
		private JTextField textField_2;
		private JTextField textField;
		//
		List<Kbsby1> list=new ArrayList<Kbsby1>();
		KbsbyDao1 gdao=new KbsbyDao1();
		JScrollPane scrollPane_1;
		//查询
		List<Kbsby2> list2=new ArrayList<Kbsby2>();
		KbsbyDao2 gdao1=new KbsbyDao2();
		JScrollPane scrollPane_2;
		JScrollPane scrollPane_3;
		private JTextField textField_1;
		private JTextField textField_3;
		private JTextField textField_4;
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");

		
		JComboBox comboBox_4;
		//状态
		int z=0;
		
		
		
		//
		Kcpd1biz kbiz=new Kcpd1biz();
		 JTable table_4;
		 
		 //报损报溢详表
		 KcpdbizDao pdao=new KcpdbizDao();
		 List<Kbsby2> list4=new ArrayList<Kbsby2>();
		 
		 
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
//			KXmjm2bsby dialog = new KXmjm2bsby();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public KXmjm2bsby(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setTitle("报损报溢");
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm2bsby.class.getResource("/Img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);

		setBounds(100, 100, 1205, 796);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1189, 756);
		contentPanel.add(panel);
		
		JButton btnNewButton = new JButton("报损/报溢");
		btnNewButton.setBounds(0, 0, 150, 36);
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("报损/报溢")) {
					car.show(panel_1,"name_784285226470000");
				}
			}
		});
		panel.setLayout(null);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("报损/报溢查询");
		btnNewButton_1.setBounds(150, 1, 169, 35);
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("报损/报溢查询")) {
					car.show(panel_1,"name_784302050803000");
				}
			}
		});
		panel.add(btnNewButton_1);
		
		 panel_1 = new JPanel();
		 panel_1.setBounds(10, 33, 1169, 723);
		panel.add(panel_1);
		panel_1.setLayout(car);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "name_784285226470000");
		panel_2.setLayout(null);
		
	 lblNewLabel_1 = new JLabel("商品报损");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(478, 23, 136, 37);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(SystemColor.control);
		panel_4.setBounds(10, 70, 1149, 114);
		panel_2.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("单据类型：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 57, 108, 22);
		panel_4.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"商品报损", "商品报溢"}));
		comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	if (e.getStateChange() == ItemEvent.SELECTED) {
                    // 选择的下拉框选项
            		if(e.getItem().equals("商品报损")){
            			lblNewLabel_1.setText("商品报损");
            			lblNewLabel_5.setText("bs"+sdf.format(new Date()));
            			z=0;
            			listcai.clear();
            			try {
            				updateTablecai();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
            		}else if(e.getItem().equals("商品报溢")){
            			lblNewLabel_1.setText("商品报溢");
            			lblNewLabel_5.setText("by"+sdf.format(new Date()));
            			z=1;
            			listcai.clear();
            			try {
            				updateTablecai();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
            		}
                }
            }
        });
		
		
				

		comboBox.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		comboBox.setBounds(128, 54, 139, 29);
		panel_4.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("仓库名称：");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_3.setBounds(470, 55, 100, 26);
		panel_4.add(lblNewLabel_3);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"主仓库", "酒库", "饮料库"}));
		comboBox_5.setBounds(580, 54, 126, 32);
		panel_4.add(comboBox_5);
		
		JLabel lblNewLabel_4 = new JLabel("报损日期：");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4.setBounds(817, 57, 100, 22);
		panel_4.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("bs"+sdf.format(new Date()));
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setBounds(829, 10, 249, 22);
		panel_4.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		 Chooser ser = Chooser.getInstance();
	      
		 textField_1.setBounds(911, 57, 116, 25);
		 textField_1.setText("2021-7-19");
	        ser.register(textField_1);
		textField_1.setBounds(927, 57, 100, 25);
		panel_4.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 194, 1149, 63);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("添加商品（f2）");
		btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KXmjm2absby a=new KXmjm2absby(new JFrameInterface() {
					
					@Override
					public JDialog getJFrame() {
						// TODO Auto-generated method stub
						return KXmjm2bsby.this;
					}
				});
			}
		});
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setForeground(new Color(0, 191, 255));
		btnNewButton_2.setBounds(10, 10, 187, 43);
		panel_5.add(btnNewButton_2);
		
	 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 267, 1137, 285);
		panel_2.add(scrollPane);
		
		//创建表格
	
		
		try {
			
			table_3 = new JTable(getModelcai()){
				
				@Override
				public boolean isCellEditable(int row, int column) {
					// TODO Auto-generated method stub
					return false;
				}
			};
			table_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
			JTableHeader head2 = table_3.getTableHeader(); // 创建表格标题对象
	        head2.setPreferredSize(new Dimension(head2.getWidth(), 40));// 设置表头大小
	        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
	        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
	        ((DefaultTableCellRenderer) table_3.getTableHeader().getDefaultRenderer())
	        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
	        render2.setHorizontalAlignment(SwingConstants.CENTER);
	        table_3.setDefaultRenderer(Object.class, render2);
	        //设置行高
	        table_3.setRowHeight(35);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        //线条颜色
//        table_1.setGridColor(Color.red);
		scrollPane.setViewportView(table_3);
		{
			JButton okButton = new JButton("确定");
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String oodd=lblNewLabel_5.getText();
					Date odate=new Date();
					int ztai=z;
					String oagent=(String) comboBox_4.getSelectedItem();
					String obeizhu=textField_2.getText();
					for (int i = 0; i < listcai.size(); i++) {
						if(listcai.get(i).getStshu()>listcai.get(i).getKucun()) {
							JOptionPane.showMessageDialog(null, "数量不能大于库存");
						}else {
							Kbsby1 g=new Kbsby1(oodd, odate, oagent, ztai, obeizhu);
//							System.out.println("-------------"+ztai);
							try {
								boolean isok=kbiz.overflow(listcai, g);
								if(isok) {
									JOptionPane.showMessageDialog(null, "成功");
								}
								listcai.clear();
								updateTablecai();
								updateTable1();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					
					
				}
			});
			okButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
			okButton.setBounds(833, 654, 113, 37);
			panel_2.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		
		JLabel lblNewLabel_6 = new JLabel("经办人：");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_6.setBounds(29, 602, 93, 39);
		panel_2.add(lblNewLabel_6);
		
		comboBox_4 = new JComboBox();
		comboBox_4.addItem(gui.label_2.getText());
		comboBox_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		comboBox_4.setBounds(110, 602, 113, 33);
		panel_2.add(comboBox_4);
		
		JLabel lblNewLabel_7 = new JLabel("备注：");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_7.setBounds(496, 611, 75, 20);
		panel_2.add(lblNewLabel_7);
		{
			JButton cancelButton = new JButton("退出(f6)");
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			cancelButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
			cancelButton.setBounds(980, 654, 121, 37);
			panel_2.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.text);
		textField_2.setBounds(566, 610, 368, 21);
		textField_2.setBorder(new MatteBorder(0,0,1,0,new Color(0,0,0)));
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_784302050803000");
		panel_3.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 10, 1159, 723);
		panel_3.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("报损时间：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel.setBounds(178, 13, 100, 29);
		panel_6.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		Chooser ser1 = Chooser.getInstance();
        
        textField_3.setBounds(344, 20, 147, 29);
        textField_3.setText("2021-7-19");
        ser1.register(textField_3);
		textField_3.setBounds(344, 20, 166, 29);
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("单号查询：");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_8.setBounds(178, 82, 100, 21);
		panel_6.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField.setBounds(344, 77, 156, 29);
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("至");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_9.setBounds(586, 14, 20, 26);
		panel_6.add(lblNewLabel_9);
		
		JButton btnNewButton_7 = new JButton("查询");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//刷新表格
				try {
					updateTable1();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
			
		textField_4 = new JTextField();
		textField_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		 Chooser ser2 = Chooser.getInstance();
	       
		 textField_4.setBounds(656, 16, 200, 30);
		 textField_4.setText("2021-7-19");
	        ser2.register(textField_4);
		textField_4.setBounds(669, 20, 156, 29);
		panel_6.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_7.setBounds(669, 81, 156, 29);
		panel_6.add(btnNewButton_7);
		
		 scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 144, 1139, 208);
		panel_6.add(scrollPane_2);
		
		
		//报损报溢查询1
		

//		table_4.setBackground(new Color(255, 255, 255));
		try {
			table_4 = new JTable(getModel2(findDb2())){
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
							list4=pdao.selectByAllbao(dh);
							updateTable4();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			});
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JTableHeader head4 = table_4.getTableHeader(); // 创建表格标题对象
        head4.setPreferredSize(new Dimension(head4.getWidth(), 35));// 设置表头大小
        head4.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        DefaultTableCellRenderer render4 = new DefaultTableCellRenderer();
        ((DefaultTableCellRenderer) table_4.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        render4.setHorizontalAlignment(SwingConstants.CENTER);
        table_4.setDefaultRenderer(Object.class, render4);
        table_4.setRowHeight(35);
        //线条颜色
//        table_1.setGridColor(Color.red);
		table_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		scrollPane_2.setViewportView(table_4);
		
		
		
		
		
		
		//第一个表格
		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 255));
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
//        head.setFont(new Font("楷体", Font.PLAIN, 23));// 设置表格字体
//        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
//        render.setHorizontalAlignment(SwingConstants.CENTER);
	
		
		 scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 382, 1139, 331);
		panel_6.add(scrollPane_3);
		
		try {
			table_2 = new JTable(getModel4()) {@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}};
			table_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		JTableHeader head1 = table_2.getTableHeader(); // 创建表格标题对象
        head1.setPreferredSize(new Dimension(head1.getWidth(), 35));// 设置表头大小
        head1.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        render1.setHorizontalAlignment(SwingConstants.CENTER);
        table_2.setDefaultRenderer(Object.class, render1);
        table_2.setRowHeight(35);
        //线条颜色
//        table_1.setGridColor(Color.red);
		scrollPane_3.setColumnHeaderView(table_2);
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(null);
		}
		setVisible(true);
	}
	//采购表格添加
			/**
			 * 建模
			 * @return
			 */
			public DefaultTableModel getModelcai(){
				//创建表头
				Object[] head={"商品名称","进价","售价","单位","数量","总金额","库存"};
				DefaultTableModel tm=null;

				if(listcai.size()>0){
					//表主体
					Object[][] body=new Object[listcai.size()][head.length];
					int j=0;
					for (int i = 0; i < body.length; i++) {
						//System.out.println("**********"+listcai.get(0).getGid());
						Cgoods_jiujia g=listcai.get(i);
						body[i][j++]=g.getGname();
						body[i][j++]=g.getGbid();
						body[i][j++]=g.getGprice();
						body[i][j++]=g.getGspec();
						body[i][j++]=g.getStshu();
						body[i][j++]=g.getStshu()*g.getGbid();
						try {
							List<Cgoods_jiujia> k=gdao.selectkc(g.getGid());
							listcai.get(i).setKucun(k.get(0).getStshu());
//							System.out.println(k.get(0).getStshu());
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						body[i][j++]=g.getKucun();
						j=0;
					}
					tm=new DefaultTableModel(body, head);
					
				}else{
					tm=new DefaultTableModel(null, head);
				}
				return tm;
			}
			public void updateTablecai() throws Exception{
				//重新建模
				table_3.setModel(getModelcai());
				//创建将表格加入滚动面板中
				scrollPane.setViewportView(table_3);
				//通知面板立即生效
				scrollPane.validate();
				}
			
			//
			/**
			 * 建模
			 * @return
			 * @throws Exception 
			 */
			public DefaultTableModel getModel1(List<Kbsby1> list) throws Exception{
				//创建表头
				Object[] head={"商品编号","商品名称","盘点单号","类别名称","单位"};
				DefaultTableModel tm=null;
//				list=gdao.selectByAll();
//				System.out.println(list);
				if(list.size()>0){
					//表主体
					Object[][] body=new Object[list.size()][head.length];
					int j=0;
					for (int i = 0; i < body.length; i++) {
						Kbsby1 g=list.get(i);
						body[i][j++]=g.getOagent();
						body[i][j++]=g.getOdate();
						body[i][j++]=g.getOodd();
						body[i][j++]=g.getStopera();
						body[i][j++]=g.getObeizhu();
						
						
						
						
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
			public List<Kbsby1> findDb() throws Exception{
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
				table_1.setModel(getModel1(findDb()));
				//创建将表格加入滚动面板中
				scrollPane_1.setViewportView(table_1);
				//通知面板立即生效
				scrollPane_1.validate();
				}
			
			
			
			//报损报溢查询1
			/**
			 * 建模
			 * @return
			 * @throws Exception 
			 */
			public DefaultTableModel getModel2(List<Kbsby2> list2) throws Exception{
				//创建表头
				Object[] head={"报损单号","报损日期","经办人","操作员","备注"};
				DefaultTableModel tm=null;
	
				if(list2.size()>0){
					//表主体
					Object[][] body=new Object[list2.size()][head.length];
					int j=0;
					for (int i = 0; i < body.length; i++) {
						Kbsby2 g=list2.get(i);
						body[i][j++]=g.getOodd();
						body[i][j++]=g.getOdate();
						body[i][j++]=g.getOagent();
						body[i][j++]=g.getLopera();
						body[i][j++]=g.getObeizhu();
						
						
						
						
						
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
			public List<Kbsby2> findDb2() throws Exception{
				//1.如果第一次来，输入框中无值，则查询所有
				if(textField.getText().equals(null) || textField.getText().equals("")){
					list2=gdao1.selectByAll();
					
				}else{
					list2=gdao1.selectByAll(textField.getText());
				}
				//2.如果下拉框中有值，则带条件查询
				return list2;
			}
			
			public void updateTable1() throws Exception{
				//重新建模
				table_4.setModel(getModel2(findDb2()));
				//创建将表格加入滚动面板中
				scrollPane_2.setViewportView(table_4);
				//通知面板立即生效
				scrollPane_2.validate();
				}
			
			//报损报溢详情表
			public DefaultTableModel getModel4() throws Exception{
				//创建表头
				Object[] head={"商品编号","商品名称","数量","单价","总金额","规格"};
				DefaultTableModel tm=null;
					
				if(list4.size()>0){
					//表主体
					Object[][] body=new Object[list4.size()][head.length];
					int j=0;
					for (int i = 0; i < body.length; i++) {
						Kbsby2 g=list4.get(i);
						body[i][j++]=g.getGid();
						body[i][j++]=g.getGname();
						body[i][j++]=g.getGprice();
						body[i][j++]=g.getStshu();
						body[i][j++]=g.getGspec();
						j=0;
					}
					tm=new DefaultTableModel(body, head);
					
				}else{
					tm=new DefaultTableModel(null, head);
				}
				return tm;
			}
//			public List<Kbsby2> findDbxiang() throws Exception{
//				String dh=(String) table_4.getValueAt(0, 0);
//				if(list4.size()==0) {
//					list4=pdao.selectByAllbao(dh);
//				}
//				
//				return list4;
//			}
			
			
			
			public void updateTable4() throws Exception{
				//重新建模
				table_2.setModel(getModel4());
				//创建将表格加入滚动面板中
				scrollPane_3.setViewportView(table_2);
				//通知面板立即生效
				scrollPane_3.validate();
				}

			
			
			
			
}
