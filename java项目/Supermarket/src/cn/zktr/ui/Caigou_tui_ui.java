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
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.dao.C_TypeDao;
import cn.zktr.dao.C_danju_dao;
import cn.zktr.dao.Caigou_shenheztai_dao;
import cn.zktr.entity.C_danju_xiangqin;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.entity.Caigou_gongyingshang;
import cn.zktr.entity.Cgoods_caigou;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Cyonghui_denglu;

import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Caigou_tui_ui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JPanel panel;
	CardLayout car=new CardLayout();
	private JTextField textField;
	 JTable table;
	 JTextField textField_4;
	 JTextField textField_4_1;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_6_1;
	private JTable table_1;
	 JTable table_1_1;
	private JTextField textField_7;
	private JTable table_2;
	JPanel panel_1;
	//采购单号
	JLabel label_11;
	//经办人
	JComboBox comboBox_2;
	
	//采购单号
	JLabel lblx;
	
	JLabel lblNewLabel_2;
	
	//供应商
	JLabel lblNewLabel;
	
	//单据查询
	C_danju_dao ddao=new C_danju_dao();
	List<C_danju_xiangqin> list2=new ArrayList<C_danju_xiangqin>();
	JScrollPane scrollPane_1;
	List<C_jintuihuo_danju> list=new ArrayList<C_jintuihuo_danju>();
	JScrollPane scrollPane_2;
	
	//采购单临时集合
	JScrollPane scrollPane;
	List<Cgoods_jiujia> listcai=new ArrayList<Cgoods_jiujia>();
	
	Cgoods_jiujia cj;
	
	//类型dao
	C_TypeDao type=new C_TypeDao();
	
	//条件查
	JComboBox comboBox_1;
	JComboBox comboBox;
	
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
	// hh:mm:ss
	SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	//加数据库dao
	Caigou_shenheztai_dao d=new Caigou_shenheztai_dao();
	
	//整单退货
	JButton btnf_1;
	JButton btnf;
	
	//c
	String gg;
	/**
	 * 采购界面
	 */
	Zujm_ui gui;
//	public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//            	Caigou_tui_ui frame = new Caigou_tui_ui();
//                frame.setVisible(true);
//               
//            }
//        });
//    }
	public Caigou_tui_ui(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Caiguo_cai_ui.class.getResource("/img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setFont(new Font("微软雅黑", Font.PLAIN, 15));
		setTitle("采购进货");
		setBounds(100, 100, 1243, 773);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("采购退货");
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if (but.getText().equals("采购退货")) {
					car.show(panel, "name_149830963598100");
				}
			}
		});
		btnNewButton.setBounds(14, 13, 153, 37);
		contentPanel.add(btnNewButton);
		
		panel = new JPanel();
		panel.setBounds(14, 58, 1203, 664);
		contentPanel.add(panel);
		panel.setLayout(car);
		
		 panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setForeground(new Color(0, 0, 0));
		panel.add(panel_1, "name_149830963598100");
		panel_1.setLayout(null);
		{
			JLabel label = new JLabel("采购退货");
			label.setFont(new Font("华文楷体", Font.BOLD, 50));
			label.setBounds(438, 6, 213, 45);
			panel_1.add(label);
		}
		{
			lblx = new JLabel("CT"+sdf.format(new Date()));
			lblx.setForeground(Color.RED);
			lblx.setFont(new Font("宋体", Font.BOLD, 18));
			lblx.setBounds(980, 25, 213, 29);
			panel_1.add(lblx);
		}
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(248, 248, 255));
		panel_3.setBounds(10, 60, 1183, 59);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel("供应商：");
		label.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label.setBounds(10, 19, 85, 32);
		panel_3.add(label);
		
		
		
		
		
		JLabel label_1 = new JLabel("类型：");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_1.setBounds(444, 21, 85, 28);
		panel_3.add(label_1);
		
		 comboBox = new JComboBox();
		comboBox.setFont(new Font("微软雅黑", Font.BOLD, 20));
		try {
			List<C_kucun_biandong> list=type.selectAll();
			//循环集合，将值依次赋予给下拉框
			comboBox.addItem("全部");
			for (C_kucun_biandong c : list) {
				comboBox.addItem(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboBox.setBounds(509, 19, 127, 32);
		panel_3.add(comboBox);
		
		JLabel label_2 = new JLabel("进货日期：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(827, 19, 111, 32);
		panel_3.add(label_2);
		//日历
//		Chooser ser = Chooser.getInstance();
//        p.initCalendarPanel();
//
//        JLabel l = new JLabel("日历面板");
//        p.add(l);
		
		 comboBox_1 = new JComboBox();
		try {
			List<Caigou_gongyingshang> list=type.selectAll1();
			//循环集合，将值依次赋予给下拉框
			for (Caigou_gongyingshang c : list) {
				comboBox_1.addItem(c);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		comboBox_1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	
            }
        });
		comboBox_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		comboBox_1.setBounds(94, 19, 146, 32);
		panel_3.add(comboBox_1);
		
		JLabel lblNewLabel_1 = new JLabel(sdf2.format(new Date()));
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setBounds(929, 19, 220, 32);
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 129, 1183, 59);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		{
			btnf = new JButton("老商品退货");
			btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Caigou_jiujiatui_ui cjiu=new Caigou_jiujiatui_ui(new JFrameInterface() {
						
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Caigou_tui_ui.this;
						}
					});
				}
			});
			btnf.setBounds(17, 10, 155, 34);
			panel_4.add(btnf);
		}
		{
			 btnf_1 = new JButton("整单退货");
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Caigou_zhengdantui_ui c=new Caigou_zhengdantui_ui(new JFrameInterface() {
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Caigou_tui_ui.this;
						}
					});
					
				}
			});
			btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnf_1.setBounds(202, 10, 155, 34);
			panel_4.add(btnf_1);
		}
		
		JButton button_7 = new JButton("修改");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//先判断是否选中行
				if(table.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table.getSelectedRow();
					for (int i = 0; i < listcai.size(); i++) {
						if(row==i) {
							cj=listcai.get(i);
						}
					}
					Caigou_tuihuoshu_ui3 c=new Caigou_tuihuoshu_ui3(new JFrameInterface() {
						
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Caigou_tui_ui.this;
						}
					});
					
					
				}
			}
		});
		button_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_7.setBounds(402, 14, 143, 32);
		panel_4.add(button_7);
		
		JButton button_8 = new JButton("删除");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得当前选中行的下标
				
				if(table.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					int row=table.getSelectedRow();
					for (int i = 0; i < listcai.size(); i++) {
						if(row==i) {
							listcai.remove(i);
							try {
								updateTablecai();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					}
					
					
				}
			}
		});
		button_8.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_8.setBounds(587, 14, 143, 32);
		panel_4.add(button_8);
		
		JButton button_10 = new JButton("清空");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listcai.clear();
				try {
					updateTablecai();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_10.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_10.setBounds(773, 15, 143, 30);
		panel_4.add(button_10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 198, 1183, 364);
		panel_1.add(scrollPane);
		lblNewLabel_2 = new JLabel();
		textField_4_1 = new JTextField();
		try {
			
			table = new JTable(getModelcai()){
				
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
		JTableHeader head = table.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        render1.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, render1);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(30);
		
		
		scrollPane.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(10, 572, 1183, 82);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_3 = new JLabel("应付金额：");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_3.setBounds(20, 29, 100, 26);
		panel_5.add(label_3);
		
		
		 
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_2.setBackground(new Color(0,0,0,0));
		lblNewLabel_2.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		lblNewLabel_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		lblNewLabel_2.setBounds(120, 31, 100, 24);
		panel_5.add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("经办人：");
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_4.setBounds(495, 30, 86, 24);
		panel_5.add(label_4);
		
		comboBox_2 = new JComboBox();
		
				comboBox_2.addItem(gui.label_2.getText());
			
		comboBox_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		comboBox_2.setBounds(591, 29, 126, 27);
		panel_5.add(comboBox_2);
		
		JLabel label_5 = new JLabel("应付金额：");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_5.setBounds(243, 28, 104, 28);
		panel_5.add(label_5);
		
		
		
		textField_4_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_4_1.setBackground(new Color(0,0,0,0));
		textField_4_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_4_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_4_1.setBounds(359, 28, 111, 30);
		panel_5.add(textField_4_1);
		textField_4_1.setColumns(10);
		
		textField_5 = new JTextField();
		
		JButton button_6 = new JButton("确  定");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(listcai.size()==0) {
					JOptionPane.showMessageDialog(null, "无退货商品");
					return;
				}else {
					String podd1=listcai.get(0).getPodd1();
					try {
							d.updatezt1(podd1);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						for (int i = 0; i < listcai.size(); i++) {
							if(listcai.get(i).getStshu()>listcai.get(i).getXpshu()) {
								JOptionPane.showMessageDialog(null, "退货数量不能大于库存");
							}else {
								
								Caigou_shenhezhuantai_ui2 tui=new Caigou_shenhezhuantai_ui2(new JFrameInterface() {
									
									@Override
									public JDialog getJFrame() {
										// TODO Auto-generated method stub
										return Caigou_tui_ui.this;
									}
								});
							}
						}
				}
				
				
					
			
				
				
				
			}
		});
		button_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_6.setBounds(1057, 27, 99, 31);
		panel_5.add(button_6);
		
		
		label_11 = new JLabel(lblx.getText());
		label_11.setForeground(Color.RED);
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_11.setBounds(773, 14, 0, 26);
		panel_5.add(label_11);
		
		JButton button = new JButton("退  出");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Caigou_tui_ui.this.dispose();
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setBounds(906, 27, 99, 31);
		panel_5.add(button);
		
		JLabel label_10 = new JLabel("单号：");
		label_10.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_10.setBounds(904, 22, 66, 30);
		panel_1.add(label_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBackground(new Color(240, 255, 240));
		panel.add(panel_2, "name_149833569186100");
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		panel_6.setBounds(10, 10, 1183, 80);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Caiguo_cai_ui.class.getResource("/img/seldet.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		button_1.setBounds(21, 10, 74, 61);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_1_1.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table_1_1.getSelectedRow();
					String podd=(String)table_1_1.getValueAt(row, 0);
				
						try {
							d.updatezt(podd);
							list2.clear();
							updateTable();
							updateTable2();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
				}
			}
		});
		button_2.setIcon(new ImageIcon(Caiguo_cai_ui.class.getResource("/img/deleteSupply.png")));
		
		button_2.setBounds(111, 10, 74, 61);
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_1_1.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					Caigou_shenhe_ui2 c=new Caigou_shenhe_ui2(new JFrameInterface() {
						
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Caigou_tui_ui.this;
						}
					});
				}
				
			}
		});
		button_3.setIcon(new ImageIcon(Caiguo_cai_ui.class.getResource("/img/danjush.png")));
		
		button_3.setBounds(208, 10, 74, 61);
		panel_6.add(button_3);
		
		JLabel label_7 = new JLabel("客户/单据号：");
		label_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_7.setBounds(669, 28, 162, 27);
		panel_6.add(label_7);
		
		
		textField_6_1 = new JTextField();
		textField_6_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField_6_1.setBackground(new Color(0,0,0,0));
		textField_6_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_6_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_6_1.setBounds(803, 27, 198, 27);
		panel_6.add(textField_6_1);
		textField_6_1.setColumns(10);
		
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
		btnf_2.setBounds(1036, 26, 102, 30);
		panel_6.add(btnf_2);
		
		 scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 100, 1183, 223);
		panel_2.add(scrollPane_1);
		
		
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
					
							//获得当前选中行的下标
							 int row=table_1_1.getSelectedRow();
							 //通过行获取该行中的列
							String podd=(String) table_1_1.getValueAt(row, 0);
							String pname=(String) table_1_1.getValueAt(row, 1);
							lblNewLabel.setText(pname);
							try {
								list2=ddao.weishenhe_xiang(podd);
								updateTable2();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
					
					
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table_1_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JTableHeader head2 = table_1_1.getTableHeader(); // 创建表格标题对象
        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_1_1.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
        render2.setHorizontalAlignment(SwingConstants.CENTER);
        table_1_1.setDefaultRenderer(Object.class, render2);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table_1_1.setRowHeight(30);
//        if(list.size()>0) {
//        	table_1_1.setRowSelectionInterval(0, 0); //设置选择中行
//        }
		table_1_1.getColumnModel().getColumn(0).setPreferredWidth(250);
        table_1_1.getColumnModel().getColumn(0).setMaxWidth(300) ;
        table_1_1.getColumnModel().getColumn(2).setPreferredWidth(250);
        table_1_1.getColumnModel().getColumn(2).setMaxWidth(300) ;
		scrollPane_1.setViewportView(table_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(10, 333, 1183, 51);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel label_8 = new JLabel("供应商：");
		label_8.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_8.setBounds(14, 7, 93, 31);
		panel_7.add(label_8);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel.setBounds(95, 12, 132, 25);
		panel_7.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("增加商品");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.setBounds(753, 9, 119, 31);
		panel_7.add(btnNewButton_1);
		
		JButton button_4 = new JButton("修改商品");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_4.setBounds(897, 8, 119, 33);
		panel_7.add(button_4);
		
		JButton button_5 = new JButton("删除商品");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_2.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table_2.getSelectedRow();
					int podd=(int)table_2.getValueAt(row, 0);
					
				}
			}
		});
		button_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_5.setBounds(1026, 7, 135, 34);
		panel_7.add(button_5);
		
		textField_7 = new JTextField();
		
		 scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 394, 1183, 260);
		panel_2.add(scrollPane_2);
		
		
		try {
			
			table_2 = new JTable(getModel2()){
				
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
		table_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JTableHeader head3 = table_2.getTableHeader(); // 创建表格标题对象
        head3.setPreferredSize(new Dimension(head3.getWidth(), 35));// 设置表头大小
        head3.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
        render3.setHorizontalAlignment(SwingConstants.CENTER);
        table_2.setDefaultRenderer(Object.class, render3);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table_2.setRowHeight(35);
		
		scrollPane_2.setViewportView(table_2);
		
		JButton button_9 = new JButton("退货查询");
		button_9.setFont(new Font("微软雅黑", Font.BOLD, 25));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if(gui.lblZhiwei.getText().equals("超级管理员")) {
					if (but.getText().equals("退货查询")) {
						car.show(panel, "name_149833569186100");
					}
				}else {
					JOptionPane.showMessageDialog(null, "你不是超级管理员");
				}
			}
		});
		button_9.setBounds(199, 10, 153, 37);
		contentPanel.add(button_9);
		setVisible(true);
		
	}
	public DefaultTableModel getModel(List<C_jintuihuo_danju> list) throws Exception{
		
		
		//创建表头
		Object[] head={"单号","供应商","退货时间","应付金额","实付金额","经办人"};
		DefaultTableModel tm=null;
//		list=ddao.selectByAll();
//		System.out.println(list);
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
//			System.out.println(list);
			for (int i = 0; i < body.length; i++) {
				C_jintuihuo_danju g=list.get(i);
				body[i][j++]=g.getPodd();
				body[i][j++]=g.getSbusiness();
				body[i][j++]=sdf2.format(g.getPdate());
				body[i][j++]=g.getPcope();
				body[i][j++]=g.getPpaid();
				body[i][j++]=g.getPagent();
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
	public List<C_jintuihuo_danju> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_6_1.getText().equals(null) || textField_6_1.getText().equals("")){
			list=ddao.tuihuodan();
		}else{
			list=ddao.tuihuodan(textField_6_1.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_1_1.setModel(getModel(findDb()));
		table_1_1.getColumnModel().getColumn(0).setPreferredWidth(250);
        table_1_1.getColumnModel().getColumn(0).setMaxWidth(300) ;
        table_1_1.getColumnModel().getColumn(2).setPreferredWidth(250);
        table_1_1.getColumnModel().getColumn(2).setMaxWidth(300) ;
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_1_1);
		//通知面板立即生效
		scrollPane_1.validate();
		}
	//第二个表格
		public DefaultTableModel getModel2() throws Exception{
			
			//创建表头
			Object[] head={"商品编号","商品名称","单位","单价","数量","总金额"};
			DefaultTableModel tm=null;
			
			if(list2.size()>0){
				//表主体
				Object[][] body=new Object[list2.size()][head.length];
				int j=0;
				
//				System.out.println(list2);
				for (int i = 0; i < body.length; i++) {
					C_danju_xiangqin g=list2.get(i);
					body[i][j++]=g.getGid();
					body[i][j++]=g.getGname();
					body[i][j++]=g.getGspec();
					body[i][j++]=g.getGbid();
					body[i][j++]=g.getXpshu();
					body[i][j++]=g.getGbid()*g.getXpshu();
					
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
			scrollPane_2.setViewportView(table_2);
			//通知面板立即生效
			scrollPane_2.validate();
			}
		
		//采购表格添加
		/**
		 * 建模
		 * @return
		 */
		public DefaultTableModel getModelcai(){
			if (listcai.size()>0) {
        		comboBox_1.setEnabled(false);
        		btnf_1.setEnabled(false);
				btnf.setEnabled(false);
            }else {
            	comboBox_1.setEnabled(true);
            	btnf_1.setEnabled(true);
				btnf.setEnabled(true);
            }
			
			int kucun=0;
			//应付金额
			double zonghe=0;
			//创建表头
			Object[] head={"商品名称","进价","售价","单位","数量","总金额","库存"};
			DefaultTableModel tm=null;
			
			if(listcai.size()>0){
				
				//表主体
				Object[][] body=new Object[listcai.size()][head.length];
				int j=0;
				for (int i = 0; i < body.length; i++) {
					Cgoods_jiujia g=listcai.get(i);
					body[i][j++]=g.getGname();
					body[i][j++]=g.getGbid();
					body[i][j++]=g.getGprice();
					body[i][j++]=g.getGspec();
					body[i][j++]=g.getStshu();
					body[i][j++]=g.getStshu()*g.getGbid();
					try {
						List<Cgoods_caigou> k=d.selectkc(g.getGid());
						listcai.get(i).setXpshu(k.get(0).getSthu());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					body[i][j++]=g.getXpshu();
					zonghe+=g.getStshu()*g.getGbid();
					lblNewLabel_2.setText(zonghe+"");
					textField_4_1.setText(zonghe+"");
					j=0;
				}
				tm=new DefaultTableModel(body, head);
			}else{
				tm=new DefaultTableModel(null, head);
				lblNewLabel_2.setText(0+"");
				textField_4_1.setText(0+"");
			}
			return tm;
		}
		public void updateTablecai() throws Exception{
			//重新建模
			table.setModel(getModelcai());
			//创建将表格加入滚动面板中
			scrollPane.setViewportView(table);
			//通知面板立即生效
			scrollPane.validate();
			}
}
