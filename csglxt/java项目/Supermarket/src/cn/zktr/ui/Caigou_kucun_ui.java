package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.dao.C_kucun_dao;
import cn.zktr.dao.C_kucun_jtshu_dao;
import cn.zktr.dao.C_kuncun_xinxi_dao;
import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.entity.C_kucun_jtshu;
import cn.zktr.entity.C_kucun_xinxi;
import cn.zktr.entity.Cgoods_jiujia;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class Caigou_kucun_ui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	CardLayout car=new CardLayout();
	JPanel panel_1;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField_2;
	private JTable table_1;
	private JTextField textField_4;
	private JTable table_2;
	List<C_kucun_biandong> list=new ArrayList<C_kucun_biandong>();
	C_kucun_dao kdao=new C_kucun_dao();
	JScrollPane scrollPane;
	
	List<C_kucun_jtshu> list2=new ArrayList<C_kucun_jtshu>();
	C_kucun_jtshu_dao ksdao=new C_kucun_jtshu_dao();
	JScrollPane scrollPane_1;
	
	List<C_kucun_xinxi> list3=new ArrayList<C_kucun_xinxi>();
	C_kuncun_xinxi_dao xxdao=new C_kuncun_xinxi_dao();
	JScrollPane scrollPane_2;
	/**
	 * 库存查询界面
	 */
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	Caigou_kucun_ui frame = new Caigou_kucun_ui();
                frame.setVisible(true);
               
            }
        });
    }


	public Caigou_kucun_ui() {
//		try {
//			UIManager.setLookAndFeel(new SubstanceLookAndFeel());
//		} catch (UnsupportedLookAndFeelException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		setIconImage(Toolkit.getDefaultToolkit().getImage(Caigou_kucun_ui.class.getResource("/img/logo544.png")));
		setTitle("库存");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(0, 0, 1225, 785);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 10, 1209, 41);
		contentPanel.add(panel);
		
		JButton button = new JButton("库存情况");
		button.setFont(new Font("微软雅黑", Font.BOLD, 25));
		button.setBounds(10, 0, 141, 40);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if (but.getText().equals("库存变动情况")) {
					car.show(panel_1, "name_519239703167100");
				}
			}
		});
		panel.setLayout(null);
		panel.add(button);
		
		JButton button_3 = new JButton("退   出");
		button_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caigou_kucun_ui.this.dispose();
			}
		});
		button_3.setBounds(1106, 7, 93, 29);
		panel.add(button_3);
		
		 panel_1 = new JPanel();
		panel_1.setBounds(0, 60, 1209, 672);
		contentPanel.add(panel_1);
		panel_1.setLayout(car);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "name_519239703167100");
		panel_2.setLayout(null);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 0, 1189, 68);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(0,0,0,0));
		textField_1.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

		textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField_1.setBounds(210, 15, 214, 35);
		panel_6.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("商品名称或编号：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 22));
		label_2.setBounds(23, 11, 214, 37);
		panel_6.add(label_2);
		
//		textField_1 = new JTextField();
//		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
//		textField_1.setBounds(597, 11, 98, 26);
//		panel_6.add(textField_1);
//		textField_1.setColumns(10);
		
		JButton button_12 = new JButton("查   询");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//刷新表格
				try {
					updateTable();
					
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		button_12.setFont(new Font("微软雅黑", Font.BOLD, 22));
		button_12.setBounds(462, 12, 118, 37);
		panel_6.add(button_12);
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 1189, 602);
		panel_2.add(scrollPane);
		table = new JTable();
		try {
			
			table = new JTable(getModel(findDb())){
				
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
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, render);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(35);
		
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, "name_519242973926400");
		panel_3.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(20, 10, 1179, 60);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_3 = new JLabel("统计时间：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_3.setBounds(10, 8, 105, 42);
		panel_8.add(label_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		comboBox_1.setBounds(117, 16, 137, 31);
		panel_8.add(comboBox_1);
		
		JLabel label_4 = new JLabel("至");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_4.setBounds(264, 16, 30, 24);
		panel_8.add(label_4);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		comboBox_2.setBounds(299, 17, 137, 29);
		panel_8.add(comboBox_2);
		
		JLabel label_5 = new JLabel("商品名称或编号：");
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_5.setBounds(483, 8, 173, 42);
		panel_8.add(label_5);
		
		textField_2 = new JTextField();
		textField_2.setBounds(652, 18, 105, 29);
		panel_8.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button_16 = new JButton("查  询");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				//刷新表格
//				try {
//					updateTable2();
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		});
		button_16.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_16.setBounds(793, 15, 98, 32);
		panel_8.add(button_16);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 80, 1189, 582);
		panel_3.add(scrollPane_1);
		
		table_1 = new JTable();
//		try {
//			
//			table_1 = new JTable(getModel2(findDb2())){
//				@Override
//				public boolean isCellEditable(int row, int column) {
//					// TODO Auto-generated method stub
//					return false;
//				}
//			};
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		 JTableHeader head1 = table_1.getTableHeader(); // 创建表格标题对象
	        head1.setPreferredSize(new Dimension(head1.getWidth(), 35));// 设置表头大小
	        head1.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
	        DefaultTableCellRenderer render4 = new DefaultTableCellRenderer();
	        render4.setHorizontalAlignment(SwingConstants.CENTER);
	        table_1.setDefaultRenderer(Object.class, render4);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table_1.setRowHeight(35);
		table_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		scrollPane_1.setViewportView(table_1);
		
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, "name_519255315981400");
		panel_4.setLayout(null);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(10, 0, 1189, 662);
		panel_4.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel label_8 = new JLabel("商品列表");
		label_8.setFont(new Font("微软雅黑", Font.PLAIN, 23));
		label_8.setBounds(10, 0, 126, 40);
		panel_10.add(label_8);
		
		JLabel label_9 = new JLabel("商品信息查询：");
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_9.setBounds(77, 44, 158, 34);
		panel_10.add(label_9);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_4.setBounds(230, 48, 117, 26);
		panel_10.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel label_10 = new JLabel("(输入商品编号，名称)");
		label_10.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_10.setBounds(467, 44, 201, 34);
		panel_10.add(label_10);
		
		 scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(204, 88, 985, 564);
		panel_10.add(scrollPane_2);
		
		table_2 = new JTable();
//		try {
//			
//			table_2 = new JTable(getModel3(findDb3())){
//				@Override
//				public boolean isCellEditable(int row, int column) {
//					// TODO Auto-generated method stub
//					return false;
//				}
//			};
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		table_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		 JTableHeader head3 = table_2.getTableHeader(); // 创建表格标题对象
	        head3.setPreferredSize(new Dimension(head3.getWidth(), 35));// 设置表头大小
	        head3.setFont(new Font("楷体", Font.PLAIN, 20));// 设置表格字体
	        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
	        render1.setHorizontalAlignment(SwingConstants.CENTER);
	        table_2.setDefaultRenderer(Object.class, render1);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table_2.setRowHeight(35);
		scrollPane_2.setViewportView(table_2);
		
		JButton button_4 = new JButton("查询");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				//刷新表格
//				try {
//					updateTable3();
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
			}
		});
		button_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		button_4.setBounds(364, 44, 93, 32);
		panel_10.add(button_4);
		
		JTree tree = new JTree();
		tree.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		tree.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("商品") {
				{
					
				}
			}
		));
		tree.setBounds(10, 88, 184, 564);
		panel_10.add(tree);
		
		setVisible(true);
		
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */ 
	public DefaultTableModel getModel(List<C_kucun_biandong> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","进价","售价","单位","类别","库存"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list);
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				C_kucun_biandong g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getCtype();
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
	public List<C_kucun_biandong> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_1.getText().equals(null) || textField_1.getText().equals("")){
			list=kdao.selectByAll();
		}else{
			list=kdao.selectByAll(textField_1.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
		}
//	//第二个表格
//	public DefaultTableModel getModel2(List<C_kucun_jtshu> list2) throws Exception{
//		//创建表头
//		Object[] head={"商品编号","商品名称","库存","采退合计","销退合计"};
//		DefaultTableModel tm=null;
////		list=gdao.selectByAll();
////		System.out.println(list2);
//		if(list.size()>0){
//			//表主体
//			Object[][] body=new Object[list.size()][head.length];
//			int j=0;
//			for (int i = 0; i < body.length; i++) {
//				C_kucun_jtshu g=list2.get(i);
//				body[i][j++]=g.getGid();
//				body[i][j++]=g.getGname();
//				body[i][j++]=g.getStshu();
//				body[i][j++]=g.getXpshu();
//				body[i][j++]=g.getSdshu();
//				j=0;
//			}
//			tm=new DefaultTableModel(body, head);
//			
//		}else{
//			tm=new DefaultTableModel(null, head);
//		}
//		return tm;
//	}
//	/**
//	 * 通用查询
//	 * @return
//	 * @throws Exception 
//	 */
//	public List<C_kucun_jtshu> findDb2() throws Exception{
//		//1.如果第一次来，输入框中无值，则查询所有
//		if(textField_2.getText().equals(null) || textField_2.getText().equals("")){
//			list2=ksdao.selectByAll();
//		}else{
//			list2=ksdao.selectByAll(textField_2.getText());
//		}
//		//2.如果下拉框中有值，则带条件查询
//		return list2;
//	}
//	public void updateTable2() throws Exception{
//		//重新建模
//		table_1.setModel(getModel2(findDb2()));
//		//创建将表格加入滚动面板中
//		scrollPane_1.setViewportView(table_1);
//		//通知面板立即生效
//		scrollPane_1.validate();
//		}
//	//第三个表格
//		public DefaultTableModel getModel3(List<C_kucun_xinxi> list3) throws Exception{
//			//创建表头
//			Object[] head={"商品编号","商品名称","库存","采退合计","销退合计"};
//			DefaultTableModel tm=null;
////			list=gdao.selectByAll();
////			System.out.println(list3);
//			if(list.size()>0){
//				//表主体
//				Object[][] body=new Object[list3.size()][head.length];
//				int j=0;
//				for (int i = 0; i < body.length; i++) {
//					C_kucun_xinxi g=list3.get(i);
//					body[i][j++]=g.getGid();
//					body[i][j++]=g.getGname();
//					body[i][j++]=g.getStshu();
//					
//					j=0;
//				}
//				tm=new DefaultTableModel(body, head);
//				
//			}else{
//				tm=new DefaultTableModel(null, head);
//			}
//			return tm;
//		}
//		/**
//		 * 通用查询
//		 * @return
//		 * @throws Exception 
//		 */
//		public List<C_kucun_xinxi> findDb3() throws Exception{
//			//1.如果第一次来，输入框中无值，则查询所有
//			if(textField_4.getText().equals(null) || textField_4.getText().equals("")){
//				list3=xxdao.selectByAll();
//			}else{
//				list3=xxdao.selectByAll(textField_4.getText());
//			}
//			//2.如果下拉框中有值，则带条件查询
//			return list3;
//		}
//		
//		public void updateTable3() throws Exception{
//			//重新建模
//			table_2.setModel(getModel3(findDb3()));
//			//创建将表格加入滚动面板中
//			scrollPane_2.setViewportView(table_2);
//			//通知面板立即生效
//			scrollPane_2.validate();
//			}
}
