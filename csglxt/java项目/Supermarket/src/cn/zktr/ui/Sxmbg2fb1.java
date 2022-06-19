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

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import cn.zktr.dao.Sgoods_dao2;
import cn.zktr.entity.Sgoods_jiujia;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.SystemColor;
import javax.swing.border.MatteBorder;
import java.awt.Toolkit;

public class Sxmbg2fb1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	 JTable table_2;
	CardLayout car=new CardLayout();
	JPanel panel;
	JPanel panel_2;
	private JTable table;
	private JTable table_1;
	JButton btnf;
	List<Sgoods_jiujia> list=new ArrayList<Sgoods_jiujia>();
	Sgoods_dao2 gdao=new Sgoods_dao2();
	Sgoods_jiujia cj;
	//临时集合
	List<Sgoods_jiujia> list2=new ArrayList<Sgoods_jiujia>();
	JScrollPane scrollPane_1;
	JScrollPane scrollPane_2;
	/**
	 * Launch the application.
	 */
	Sxmbg2 xiao;

	
	
	/**
	 * Create the dialog.
	 */
	public Sxmbg2fb1(JFrameInterface j) {
		this.xiao=(Sxmbg2) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg2fb1.class.getResource("/img/logo544.png")));
		setTitle("增加商品(销售退货)");
		setBounds(100, 100, 1312, 770);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		
		 panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(14, 13, 731, 701);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("查询商品列表：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel.setBounds(32, 13, 157, 24);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("请输入商品编号或名称查询商品，查询到商品后添加到右边所选商品");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(26, 59, 577, 24);
		panel_1.add(lblNewLabel_1);
		
		JLabel label = new JLabel("输入商品编号或名称查询商品：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 19));
		label.setBounds(14, 99, 275, 23);
		panel_1.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setBackground(new Color(0,0,0,0));
		textField.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField.setBounds(276, 98, 120, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		btnf = new JButton("查询");
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//刷新表格
				try {
					updateTable();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				Sxmbg1fb2 s=new Sxmbg1fb2(new JFrameInterface() {
//					
//					@Override
//					public JDialog getJFrame() {
//						// TODO Auto-generated method stub
//						return Sxmbg1fb1.this;
//					}
//				});
			
				}
		});
		btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf.setBounds(420, 93, 183, 33);
		panel_1.add(btnf);
		
		JButton button = new JButton("商品清单");
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if (but.getText().equals("商品清单")) {
					car.show(panel_2, "name_168900632975100");
				}
			}
		});
		button.setBounds(14, 157, 127, 47);
		panel_1.add(button);
		
		 panel_2 = new JPanel();
		 panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(14, 214, 707, 477);
		panel_1.add(panel_2);
		panel_2.setLayout(car);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.control);
		panel_2.add(panel_6, "name_168900632975100");
		panel_6.setLayout(null);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 10, 697, 449);
		panel_6.add(scrollPane_1);
		{
		try {
			table = new JTable(getModel(findDb())) {
				@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}};
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					 if (e.getClickCount() == 2) {
							//先判断是否选中行
//								if(table.getSelectedRow()<0){
//									JOptionPane.showMessageDialog(null, "请先选中数据行");
//								}else{
									//获得当前选中行的下标
									int row=table.getSelectedRow();
									//通过行获取该行中的列
									int gid=(int) table.getValueAt(row, 0);
									String gname=(String) table.getValueAt(row, 1);
									double gbid=(double) table.getValueAt(row, 2);
									double gprice=(double) table.getValueAt(row, 3);
									String gspec=(String) table.getValueAt(row, 4);
									int stshu=(int) table.getValueAt(row, 5);
//									int sdshu= (int) table.getValueAt(row, 7);
									//将属性封装到个公共的商品对象中
									cj=new Sgoods_jiujia(gid, gname, gbid, gprice, gspec,stshu);
									
									//打开新增窗口,将当前父窗口传到子窗口中
									Sxmbg2fb3 add=new Sxmbg2fb3(new JFrameInterface() {
										@Override
										public JDialog getJFrame() {
											// TODO Auto-generated method stub
											return Sxmbg2fb1.this;
										}
									});
//								}
						 }
						
						
				}
			});
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
//        table.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(30);
		scrollPane_1.setViewportView(table);
	}
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(SystemColor.control);
		panel_2.add(panel_7, "name_168903236733000");
		panel_7.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(10, 23, 687, 444);
		panel_7.add(scrollPane_3);
		
		table_1 = new JTable();
		table_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		
		scrollPane_3.setViewportView(table_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 255, 0));
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(102, 205, 170));
		panel_4.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_5.setBounds(755, 10, 541, 701);
		panel.add(panel_5);
		panel_5.setLayout(null);
		
		scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(10, 46, 521, 511);
		panel_5.add(scrollPane_2);
		
		table_2 = new JTable();
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
		table_2.setFont(new Font("微软雅黑", Font.BOLD, 17));
		JTableHeader head21 = table_2.getTableHeader(); // 创建表格标题对象
        head21.setPreferredSize(new Dimension(head21.getWidth(), 35));// 设置表头大小
        head21.setFont(new Font("微软雅黑", Font.BOLD, 16));// 设置表格字体
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render21 = new DefaultTableCellRenderer();
        render21.setHorizontalAlignment(SwingConstants.CENTER);
        table_2.setDefaultRenderer(Object.class, render21);
        //线条颜色
//        table_2.setGridColor(Color.red);
        //设置行高
        table_2.setRowHeight(30);
		scrollPane_2.setViewportView(table_2);
		
		JLabel label_1 = new JLabel("所选商品");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_1.setBounds(14, 13, 92, 23);
		panel_5.add(label_1);
		
		JButton btnf_1 = new JButton("修改");
		btnf_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//先判断是否选中行
				if(table.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table.getSelectedRow();
					//通过行获取该行中的列
					int gid=(int) table.getValueAt(row, 0);
					String gname=(String) table.getValueAt(row, 1);
					double gbid=(double) table.getValueAt(row, 2);
					double gprice=(double) table.getValueAt(row, 3);
					String gspec=(String) table.getValueAt(row, 4);
					int stshu=(int) table.getValueAt(row, 5);
					//将属性封装到个公共的商品对象中
					cj=new Sgoods_jiujia(gid, gname, gbid, gprice, gspec,stshu);
					System.out.println(cj.toString());
					//打开新增窗口,将当前父窗口传到子窗口中
				Sxmbg2fb2xg add=new Sxmbg2fb2xg(new JFrameInterface() {
					
					@Override
					public JDialog getJFrame() {
						// TODO Auto-generated method stub
						return Sxmbg2fb1.this;
					}
				});
				}
			}
		});
		
			
		btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf_1.setBounds(10, 601, 119, 37);
		panel_5.add(btnf_1);
		
		JButton btndel = new JButton("删除");
		btndel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
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
		btndel.setBounds(139, 601, 119, 37);
		panel_5.add(btndel);
		
		JButton btnf_2 = new JButton("确定");
		btnf_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			for (Sgoods_jiujia c : list2) {
			
				xiao.lxiao.add(c);
			}
				try {
					xiao.updateTable2();
					Sxmbg2fb1.this.dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnf_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf_2.setBounds(268, 601, 119, 37);
		panel_5.add(btnf_2);
		
		JButton btnf_3 = new JButton("取消");
		btnf_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnf_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf_3.setBounds(397, 601, 114, 37);
		panel_5.add(btnf_3);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
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
				List<Sgoods_jiujia> he=gdao.selectByAllhe(g.getGid());
//				List<Sgoods_jiujia> he1=gdao.tuihe();
//				System.out.println(he1.get(0).getSdshu());
//				body[i][j++]=he.get(0).getSdshu();
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
			list=gdao.selectByAll();
		}else{
			list=gdao.selectByAll(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table);
		//通知面板立即生效
		scrollPane_1.validate();
		}
	
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		Object[] head={"商品名称","售价","单位","数量","总金额","销售总数"};
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
				body[i][j++]=g.getSdshu();
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
}
