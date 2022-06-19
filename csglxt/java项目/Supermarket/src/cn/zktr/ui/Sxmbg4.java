/*
 * POS收银系统
 */
package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Sxiaoshou_biz;
import cn.zktr.dao.Sxiaoshou_dao;
import cn.zktr.dao.Sxm4_dao;
import cn.zktr.entity.S_jintuihuo_danju;
import cn.zktr.entity.Sgoods_jiujia;
import cn.zktr.entity.Sgoods_zengjia;
import cn.zktr.entity.Sxm4zuo;

import javax.swing.border.MatteBorder;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Sxmbg4 extends JDialog {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTextField textField_3;
	private JTable table_2;
	JTextField textField_4;
	JLabel lblNewLabel_1;
	JLabel lblNewLabel_2;
	JLabel lblNewLabel_3;
	
	JComboBox comboBox;
	
	Sxm4_dao sdao=new Sxm4_dao();
	Sxm4_dao s=new Sxm4_dao();
	
	//左边list
	List<Sxm4zuo> listz=new ArrayList<Sxm4zuo>();
	
	//右边list
		List<Sxm4zuo> listy=new ArrayList<Sxm4zuo>();
		JScrollPane scrollPane;
		
		JScrollPane scrollPane_2;
		
		Zujm_ui gui;
		
		JLabel label_6 ;
		
		JLabel lblN;
		
		JLabel label_4;
		
		//减库存biz
		Sxiaoshou_biz sbiz=new Sxiaoshou_biz();
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//				try {
//					// 设置本属性将改变窗口边框样式定义
//					  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//					  UIManager.put("RootPane.setupButtonVisible", false);
//					  // 启用皮肤
//					  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//					Sxmbg4 dialog = new Sxmbg4();
//					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//					dialog.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}

	/**
	 * Create the frame.
	 */
	public Sxmbg4(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg4.class.getResource("/img/logo544.png")));
		setTitle("收银");
//		setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 768);
		contentPane = new JPanel();
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("客户：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setBounds(49, 18, 63, 18);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(109, 16, 108, 24);
		comboBox.setBackground(new Color(0,0,0,0));
		comboBox.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		comboBox.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		try {
			List<Sxm4zuo> vip=s.selectByAll2();
			for (Sxm4zuo v:vip) {
//				System.out.println(v.getVid());
//				System.out.println(vip);
//				System.out.println(v);
				comboBox.addItem(v);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
					if (e.getStateChange() == ItemEvent.SELECTED) {
						Sxm4zuo g=(Sxm4zuo) comboBox.getSelectedItem();
	            		if(g.getVgrade().equals("普通客户")) {
	            			label_6.setText("   无");
	            		}else if(g.getVgrade().equals("vip会员")){
	            			label_6.setText("  九折");
	            		}
	                }
			}
			});
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		contentPane.add(comboBox);
		
		JLabel label_2 = new JLabel("单号：");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_2.setBounds(396, 18, 63, 18);
		contentPane.add(label_2);
		
		 lblN = new JLabel("xs"+new Date().getTime());
		lblN.setForeground(Color.RED);
		lblN.setFont(new Font("微软雅黑", Font.BOLD, 15));
		lblN.setBounds(454, 18, 135, 20);
		lblN.setBackground(new Color(0,0,0,0));
		lblN.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		lblN.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		contentPane.add(lblN);
		
		JLabel label_3 = new JLabel("收银员：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_3.setBounds(652, 16, 89, 23);
		contentPane.add(label_3);
		
		 label_4 = new JLabel(gui.label_2.getText());
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_4.setBounds(722, 13, 72, 23);
		label_4.setBackground(new Color(0,0,0,0));
		label_4.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		label_4.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		contentPane.add(label_4);
		
		JLabel lblNewLabel = new JLabel("日期：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel.setBounds(820, 18, 66, 18);
		contentPane.add(lblNewLabel);
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
     	String hehe = dateFormat.format( now ); 
		textField_1 = new JTextField(hehe);
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 13));
		textField_1.setBounds(873, 18, 149, 24);
		textField_1.setBackground(new Color(0,0,0,0));
		textField_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_2.setBounds(49, 68, 258, 39);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("折扣：");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_5.setBounds(269, 13, 66, 28);
		contentPane.add(label_5);
		
		
		label_6 = new JLabel("   无");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_6.setBounds(323, 16, 63, 23);
		label_6.setBackground(new Color(0,0,0,0));
		label_6.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		label_6.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		contentPane.add(label_6);
		
		JButton button = new JButton("确 认");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					updateTable();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button.setBackground(new Color(30, 144, 255));
		button.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		button.setForeground(Color.BLACK);
		button.setBounds(314, 68, 104, 39);
		contentPane.add(button);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(23, 124, 481, 493);
		contentPane.add(scrollPane);
		
		try {
			table = new JTable(getModel(findDb())) {@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}};
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setFont(new Font("微软雅黑", Font.BOLD,17));
		JTableHeader head23 = table.getTableHeader(); // 创建表格标题对象
        head23.setPreferredSize(new Dimension(head23.getWidth(), 35));// 设置表头大小
        head23.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
        render2.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, render2);
        //线条颜色
//        table.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
		JLabel label_7 = new JLabel("数量：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_7.setBounds(49, 646, 63, 24);
		contentPane.add(label_7);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_3.setBounds(109, 644, 204, 28);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_1 = new JButton("添加");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "请选择数据行");
				}else {
					lblNewLabel_2.setText(0.0+"");
					lblNewLabel_3.setText(0.0+"");
					int row=table.getSelectedRow();
					int gid=(int) table.getValueAt(row, 0);
					String gname=(String) table.getValueAt(row, 1);
					double gprice=(double) table.getValueAt(row, 2);
					String gspec=(String) table.getValueAt(row, 3);
					int stshu=Integer.parseInt(textField_3.getText());

							Sxm4zuo  g=new Sxm4zuo(gid, gname, gspec, gprice,stshu);
							for (Sxm4zuo s : listy) {
								if(s.getGid()==gid) {
									s.setStshu(s.getStshu()+stshu);
									try {
										updateTableyou();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
									return;
								}
							}
							listy.add(g);
						
					}
					
					
					try {
						updateTableyou();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_1.setBounds(323, 639, 86, 39);
		contentPane.add(button_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(UIManager.getColor("CheckBox.background"));
		panel.setBounds(529, 68, 515, 623);
		contentPane.add(panel);
		panel.setLayout(null);
		
		 scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 57, 515, 455);
		panel.add(scrollPane_2);
		
		try {
			table_2 = new JTable(getModelyou());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		table_2.setBorder(new EmptyBorder(1, 0, 1, 0));
//		table_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		table_2.setFont(new Font("微软雅黑", Font.BOLD,17));
		JTableHeader head2 = table_2.getTableHeader(); // 创建表格标题对象
		head2.setPreferredSize(new Dimension(head23.getWidth(), 35));// 设置表头大小
		head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
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
		
		JLabel label_8 = new JLabel("实收：");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_8.setBounds(10, 563, 86, 28);
		panel.add(label_8);
		
		lblNewLabel_1 = new JLabel("0.0");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(83, 32, 54, 15);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("0.0");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(235, 32, 54, 15);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("0.0");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(376, 32, 54, 15);
		panel.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_4.setBounds(83, 563, 86, 28);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JButton button_2 = new JButton("删除");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_2.getSelectedRow();
				if(row>-1) {
					listy.remove(row);
					try {
						updateTableyou();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}
			}
		});
		button_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_2.setBounds(208, 546, 86, 45);
		panel.add(button_2);
		
		JButton button_3 = new JButton("清空");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listy.clear();
				lblNewLabel_1.setText(0.0+"");
				lblNewLabel_2.setText(0.0+"");
				lblNewLabel_3.setText(0.0+"");
				textField_4.setText("");
				try {
					updateTableyou();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_3.setBounds(304, 546, 86, 45);
		panel.add(button_3);
		
		JButton button_4 = new JButton("结算");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setText(textField_4.getText());
				double yinshou=Double.parseDouble(lblNewLabel_1.getText());
				if(textField_4.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "实收金额未填");
					return;
				}
				double shishou=Double.parseDouble(textField_4.getText());
				lblNewLabel_3.setText(shishou-yinshou+"");
				
				//形成销售单
				String saodd=lblN.getText();
				Sxm4zuo v=	(Sxm4zuo) comboBox.getSelectedItem(); 
				int vid=v.getVid();
//				System.out.println(vid);
				Date sadate=new Date();
//				double sacope=Double.parseDouble(label_3.getText());
//				double sapaid=Double.parseDouble(label_3.getText());
				String saagent=label_4.getText();
				
				try {
					Sgoods_jiujia g=new Sgoods_jiujia(saodd, vid, sadate, 0, yinshou, shishou, saagent);

					//库存出入库表（come）
					Sgoods_jiujia come=new Sgoods_jiujia(saodd, 2, sadate, saagent,0, sadate);
					sbiz.pos(listy,g,come);
					updateTable();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				listy.clear();
				textField_4.setText("");
				try {
					updateTableyou();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_4.setBounds(400, 546, 86, 45);
		panel.add(button_4);
		
		JLabel label_9 = new JLabel("应收：");
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_9.setBounds(36, 25, 73, 29);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("实收：");
		label_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_10.setBounds(191, 25, 73, 29);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("找零：");
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_11.setBounds(324, 25, 73, 29);
		panel.add(label_11);
		
		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);
	}
public DefaultTableModel getModel(List<Sxm4zuo> list) throws Exception{
		
		//创建表头
		Object[] head={"商品编号","商品名称","售价","规格","库存数量"};
		DefaultTableModel tm=null;
	   
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Sxm4zuo g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
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
	
	/**
	 * 通用查询
	 * @return
	 * @throws Exception 
	 */
	public List<Sxm4zuo> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_2.getText().equals(null) || textField_2.getText().equals("")){
			listz=sdao.selectByAll();
		}else{
			listz=sdao.selectByAll(textField_2.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return listz;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
		}
	
	
	
	//右边表格
public DefaultTableModel getModelyou() throws Exception{
	    double he=0; 
		//创建表头
		Object[] head={"商品名称","售价","数量","小计"};
		DefaultTableModel tm=null;
		
		if(listy.size()>0){
			//表主体
			Object[][] body=new Object[listy.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Sxm4zuo g=listy.get(i);
				body[i][j++]=g.getGname();
			    body[i][j++]=g.getGprice();
                body[i][j++]=g.getStshu();
                body[i][j++]=g.getGprice()*g.getStshu();
                
                
                if(label_6.getText().equals("  九折")) {
                	he=g.getGprice()*g.getStshu()*0.9;
                }else {
                	he=g.getGprice()*g.getStshu();
                }
                lblNewLabel_1.setText(he+"");
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
//			 lblNewLabel_1.setText(he+"");
		}
		return tm;
	}
	

	
	public void updateTableyou() throws Exception{
		//重新建模
		table_2.setModel(getModelyou());
		//创建将表格加入滚动面板中
		scrollPane_2.setViewportView(table_2);
		//通知面板立即生效
		scrollPane_2.validate();
		}
}
