/*
 * 顾客退货
 */
package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Sxiaoshou_biz;
import cn.zktr.dao.S_xiaotui_dao;
import cn.zktr.dao.Sxiaoshou_dao;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.Sgoods_zengjia;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.S_xiaotui;

import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class Sxmbg2 extends JDialog {

	
	private final JPanel contentPanel = new JPanel();
	JPanel panel;
	CardLayout car=new CardLayout();
	private JTextField textField_1;
    JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_6_1;
	private JTable table_1;
	private JTextField textField_7;
	JTextField textField_7_1;
	private JTable table_2;
	List<S_xiaotui> list=new ArrayList<S_xiaotui>();
	S_xiaotui_dao xtdao=new S_xiaotui_dao();
	JScrollPane scrollPane;
	JScrollPane scrollPane_1;
	JScrollPane scrollPane_2;
	List<Sgoods_jiujia> lxiao=new ArrayList<Sgoods_jiujia>();
	
	List<S_danju_xiangqin> list2=new ArrayList<S_danju_xiangqin>();
	S_xiaotui_dao ddao=new S_xiaotui_dao();
	
	
	JLabel label_9;
	Sgoods_jiujia cj;
	
	Sxiaoshou_biz sbiz=new Sxiaoshou_biz();
	
	
	//单号
	JLabel lblx;
	
	
	//销售加主祥表
	Sxiaoshou_dao s=new Sxiaoshou_dao();
	private JTextField textField;
	
	//经办人
	JComboBox comboBox_1;
	
	
	Zujm_ui gui;
	/**f
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			// 设置本属性将改变窗口边框样式定义
//			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//			  UIManager.put("RootPane.setupButtonVisible", false);
//			  // 启用皮肤
//			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			Sxmbg2 dialog = new Sxmbg2();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Sxmbg2(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg2.class.getResource("/img/logo544.png")));
		setTitle("顾客退货");
		setBounds(100, 100, 1030, 780);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("顾客退货");
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if (but.getText().equals("顾客退货")) {
					car.show(panel, "name_149830963598100");
				}
			}
		});
		btnNewButton.setBounds(14, 13, 147, 52);
		contentPanel.add(btnNewButton);
		
		JButton button = new JButton("退货查询");
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if (but.getText().equals("退货查询")) {
					car.show(panel, "name_149833569186100");
				}
			}
		});
		button.setBounds(171, 13, 145, 52);
		contentPanel.add(button);
		
		panel = new JPanel();
		panel.setBackground(SystemColor.control);
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel.setBounds(14, 75, 1000, 653);
		contentPanel.add(panel);
		panel.setLayout(car);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("CheckBox.background"));
		panel_1.setForeground(new Color(0, 0, 0));
		panel.add(panel_1, "name_149830963598100");
		panel_1.setLayout(null);
		{
			JLabel label = new JLabel("商品退货");
			label.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label.setBounds(404, 22, 100, 30);
			panel_1.add(label);
		}
		{
			SimpleDateFormat sdf2=new SimpleDateFormat("yyyyMMddhhmmss");
			lblx = new JLabel("xs"+sdf2.format(new Date()));
			lblx.setForeground(Color.RED);
			lblx.setFont(new Font("微软雅黑", Font.BOLD, 17));
			lblx.setBounds(688, 52, 214, 18);
			panel_1.add(lblx);
		}
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(UIManager.getColor("CheckBox.background"));
		panel_3.setBounds(14, 80, 974, 76);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label = new JLabel(" 客户名称：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setBounds(37, 23, 117, 35);
		panel_3.add(label);
		
		JLabel label_2 = new JLabel("退货日期：");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_2.setBounds(569, 28, 107, 24);
		panel_3.add(label_2);
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
     	String hehe = dateFormat.format( now ); 
		textField_1 = new JTextField(hehe);
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		textField_1.setBackground(new Color(0,0,0,0));
		textField_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_1.setBounds(681, 31, 174, 24);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		try {
			List<Sgoods_zengjia> vip=s.selectByAll();
			for (Sgoods_zengjia v:vip) {
//				System.out.println(vip);
//				System.out.println(v);
				comboBox.addItem(v);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBox.setBackground(new Color(0,0,0,0));
		comboBox.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		comboBox.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		comboBox.setBounds(156, 28, 117, 29);
		panel_3.add(comboBox);
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(14, 190, 974, 69);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		{
			JButton btnf = new JButton("添加退货商品");
			btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sxmbg2fb1 fb1=new Sxmbg2fb1(new JFrameInterface() {
						
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Sxmbg2.this;
						}
					});
				}
			});
			btnf.setBounds(10, 13, 194, 46);
			panel_4.add(btnf);
		}
		{
			JButton btnf_1 = new JButton("签单退货");
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Sxmbg2fb1_1 fb1=new Sxmbg2fb1_1(new JFrameInterface() {

						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Sxmbg2.this;
						}
					});
				}
			});
			btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnf_1.setBounds(240, 13, 170, 46);
			panel_4.add(btnf_1);
		}
		
		JButton button_6 = new JButton("修改");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					Sxmbg2_1xg add=new Sxmbg2_1xg(new JFrameInterface() {
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Sxmbg2.this;
						}
					});
				}
			}
		});
		button_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_6.setBounds(451, 13, 128, 46);
		panel_4.add(button_6);
		
		JButton button_7 = new JButton("删除");
		button_7.addActionListener(new ActionListener() {
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
		button_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_7.setBounds(599, 13, 128, 46);
		panel_4.add(button_7);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(14, 269, 974, 266);
		panel_1.add(scrollPane);
		
		try {
			table = new JTable(getModel2()){@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}};
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		table.setFont(new Font("微软雅黑", Font.BOLD, 17));
		JTableHeader head21 = table.getTableHeader(); // 创建表格标题对象
        head21.setPreferredSize(new Dimension(head21.getWidth(), 35));// 设置表头大小
        head21.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render21 = new DefaultTableCellRenderer();
        render21.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, render21);
        //线条颜色
//        table.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(14, 545, 974, 97);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel label_3 = new JLabel("应退金额：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_3.setBounds(26, 42, 105, 24);
		panel_5.add(label_3);
		
		JLabel label_4 = new JLabel("实退金额：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_4.setBounds(217, 42, 100, 24);
		panel_5.add(label_4);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		textField.setBackground(new Color(0,0,0,0));
		textField.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField.setBounds(312, 42, 89, 30);
		panel_5.add(textField);
		textField.setColumns(10);
		
		 comboBox_1 = new JComboBox();
		 comboBox_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		comboBox_1.addItem(gui.label_2.getText());
		comboBox_1.setBackground(new Color(0,0,0,0));
		comboBox_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		comboBox_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		comboBox_1.setBounds(503, 36, 105, 37);
		panel_5.add(comboBox_1);
		
		
		
		JLabel label_5 = new JLabel("经办人：");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_5.setBounds(413, 42, 108, 24);
		panel_5.add(label_5);
		
		textField_4 = new JTextField();
		
		textField_5 = new JTextField();
		
		JButton button_4 = new JButton("确定");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String saodd=lblx.getText();
				Sgoods_zengjia v=(Sgoods_zengjia) comboBox.getSelectedItem(); 
				int vid=v.getVid();
				
				Date sadate=new Date();
				double sacope=Double.parseDouble(label_9.getText());
				double sapaid=Double.parseDouble(textField.getText());
				String saagent=(String) comboBox_1.getSelectedItem();
				Sgoods_jiujia g=new Sgoods_jiujia(saodd, vid, sadate, 0, sacope, sapaid, saagent);
				//库存出入库表（come）
				Sgoods_jiujia come=new Sgoods_jiujia(saodd, 3, sadate, saagent,0, sadate);
			
					try {
						sbiz.inserttui(lxiao, g, come);
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "退货成功");
					lxiao.clear();
					try {
						updateTable2();
						label_9.setText("");
						textField.setText("");
						SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
						lblx.setText("xs"+sdf.format(new Date()));
						updateTable3();
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
			}
		});
		
		
		label_9 = new JLabel("");
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_9.setBounds(127, 43, 66, 23);
		panel_5.add(label_9);
		
		button_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_4.setBounds(657, 36, 126, 37);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("退出");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_5.setBounds(807, 36,127, 36);
		panel_5.add(button_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("CheckBox.background"));
		panel.add(panel_2, "name_149833569186100");
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(10, 13, 978, 98);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sxmbg2fb2 fb2=new Sxmbg2fb2();
			}
		});
		button_1.setIcon(new ImageIcon(Sxmbg2.class.getResource("/img/querySupply.png")));
		button_1.setBounds(46, 13, 58, 61);
		panel_6.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(Sxmbg2.class.getResource("/img/seldet.png")));
		button_2.setBounds(134, 13, 58, 61);
		panel_6.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Sxmbg2.class.getResource("/img/out.png")));
		button_3.setBounds(225, 13, 58, 61);
		panel_6.add(button_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(Sxmbg2.class.getResource("/img/exit.png")));
		btnNewButton_1.setBounds(310, 13, 52, 61);
		panel_6.add(btnNewButton_1);
		
		JLabel label_7 = new JLabel("客户/单据号：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_7.setBounds(506, 43, 129, 18);
		panel_6.add(label_7);
		
		textField_6 = new JTextField();
		textField_6_1 = new JTextField();
		textField_6_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_6_1.setBackground(new Color(0,0,0,0));
		textField_6_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_6_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_6_1.setBounds(631, 41, 110, 24);
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
		btnf_2.setBounds(767, 29, 139, 37);
		panel_6.add(btnf_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(8, 121, 980, 225);
		panel_2.add(scrollPane_1);
		
		table_1 = new JTable();
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
					String saodd=(String) table_1.getValueAt(row, 0);
					textField_7_1.setText(saodd);
					try {
						 list2=ddao.selectByAll3(saodd);
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
		table_1.setFont(new Font("微软雅黑", Font.PLAIN,17));
		JTableHeader head2 = table_1.getTableHeader(); // 创建表格标题对象
        head2.setPreferredSize(new Dimension(head21.getWidth(), 35));// 设置表头大小
        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
        render2.setHorizontalAlignment(SwingConstants.CENTER);
        table_1.setDefaultRenderer(Object.class, render2);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table_1.setRowHeight(30);
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_7.setBounds(10, 356, 978, 56);
		panel_2.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel label_8 = new JLabel("单据的详细信息：");
		label_8.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_8.setBounds(14, 13, 165, 18);
		panel_7.add(label_8);
		
		textField_7 = new JTextField();
		textField_7_1 = new JTextField();
		textField_7_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_7_1.setBackground(new Color(0,0,0,0));
		textField_7_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_7_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_7_1.setBounds(168, 8, 251, 30);
		panel_7.add(textField_7_1);
		textField_7_1.setColumns(10);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 422, 978, 219);
		panel_2.add(scrollPane_2);
		
		try {
			table_2 = new JTable(getModel3());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		table_2.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					updateTable3();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		table_2.setFont(new Font("微软雅黑", Font.BOLD,17));
		JTableHeader head23 = table_2.getTableHeader(); // 创建表格标题对象
        head23.setPreferredSize(new Dimension(head23.getWidth(), 35));// 设置表头大小
        head23.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render23 = new DefaultTableCellRenderer();
        render23.setHorizontalAlignment(SwingConstants.CENTER);
        table_2.setDefaultRenderer(Object.class, render23);
        //线条颜色
//        table_2.setGridColor(Color.red);
        //设置行高
        table_2.setRowHeight(30);
		scrollPane_2.setViewportView(table_2);
		
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
		Object[] head={"单据号","开单日期","客服名称","应收金额","实收金额","经办人"};
		DefaultTableModel tm=null;
//	    list=xtdao.selectByAll();
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				S_xiaotui g=list.get(i);
				body[i][j++]=g.getSaodd();
				body[i][j++]=g.getVdate();
				body[i][j++]=g.getVname();
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
		if(textField_6_1.getText().equals(null) || textField_6_1.getText().equals("")){
			list=xtdao.selectByAlltui();
		}else{
			list=xtdao.selectByAlltui(textField_6_1.getText());
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
		double je=0;
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
				//body[i][j++]=g.getSdshu();
				je+=g.getGprice()*g.getStshu();
				label_9.setText(je+"");
				textField.setText(je+"");
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
		Object[] head={"商品编号","商品名称","规格","数量","售价","总金额"};
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
				body[i][j++]=g.getGprice();
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

