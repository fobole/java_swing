package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Toolkit;

public class C_tixing_ui extends JDialog {
	
	JPanel panel_1;
	CardLayout car=new CardLayout();
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	/**
	 * 提醒界面
	 */
	public static void main(String[] args) {
		try {
			C_tixing_ui dialog = new C_tixing_ui();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public C_tixing_ui() {
		setTitle("今日提醒");
		setIconImage(Toolkit.getDefaultToolkit().getImage(C_tixing_ui.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 846, 554);
		getContentPane().setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.WHITE);
			panel.setBounds(0, 0, 834, 520);
			getContentPane().add(panel);
			panel.setLayout(null);
			{
				JButton btnNewButton = new JButton("库存报警");
				btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("库存报警")) {
							car.show(panel_1, "name_75934001928400");
						}
					}
				});
				btnNewButton.setBounds(10, 10, 114, 35);
				panel.add(btnNewButton);
			}
			{
				JButton btnNewButton_1 = new JButton("应收款提醒");
				btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("应收款提醒")) {
							car.show(panel_1, "name_75934016141000");
						}
					}
				});
				btnNewButton_1.setBounds(134, 10, 141, 35);
				panel.add(btnNewButton_1);
			}
			{
				JButton btnNewButton_2 = new JButton("商品过期提醒");
				btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("商品过期提醒")) {
							car.show(panel_1, "name_75934033343400");
						}
					}
				});
				btnNewButton_2.setBounds(285, 10, 159, 35);
				panel.add(btnNewButton_2);
			}
			{
				JButton btnNewButton_3 = new JButton("生日提醒");
				btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				btnNewButton_3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton but=(JButton) e.getSource();
						if (but.getText().equals("生日提醒")) {
							car.show(panel_1, "name_75934046062900");
						}
					}
				});
				btnNewButton_3.setBounds(454, 10, 123, 36);
				panel.add(btnNewButton_3);
			}
			
			JButton button = new JButton("退  出");
			button.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			button.setBounds(717, 18, 93, 27);
			panel.add(button);
			
			 panel_1 = new JPanel();
			panel_1.setBounds(0, 64, 820, 440);
			panel.add(panel_1);
			panel_1.setLayout(car);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBackground(Color.WHITE);
			panel_1.add(panel_2, "name_75934001928400");
			panel_2.setLayout(null);
			
			JLabel label = new JLabel("输入商品编号/名称：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(22, 16, 189, 30);
			panel_2.add(label);
			
			textField = new JTextField();
			textField.setBounds(224, 16, 128, 30);
			panel_2.add(textField);
			textField.setColumns(10);
			
			JButton button_1 = new JButton("查询");
			button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button_1.setBounds(375, 16, 93, 30);
			panel_2.add(button_1);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 55, 810, 385);
			panel_2.add(scrollPane);
			
			table = new JTable();
			JTableHeader head3 = table.getTableHeader(); // 创建表格标题对象
	        head3.setPreferredSize(new Dimension(head3.getWidth(), 35));// 设置表头大小
	        head3.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
	        DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
	        render3.setHorizontalAlignment(SwingConstants.CENTER);
	        table.setDefaultRenderer(Object.class, render3);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table.setRowHeight(30);
			table.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			scrollPane.setViewportView(table);
			
			JPanel panel_3 = new JPanel();
			panel_3.setBackground(Color.WHITE);
			panel_1.add(panel_3, "name_75934016141000");
			panel_3.setLayout(null);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 66, 810, 374);
			panel_3.add(scrollPane_1);
			
			table_1 = new JTable();
			JTableHeader head2 = table_1.getTableHeader(); // 创建表格标题对象
	        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
	        head2.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
	        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
	        render2.setHorizontalAlignment(SwingConstants.CENTER);
	        table_1.setDefaultRenderer(Object.class, render2);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table_1.setRowHeight(30);
			table_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			scrollPane_1.setViewportView(table_1);
			
			JLabel label_1 = new JLabel("客户名称：");
			label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_1.setBounds(20, 19, 115, 29);
			panel_3.add(label_1);
			
			textField_1 = new JTextField();
			textField_1.setBounds(135, 20, 127, 29);
			panel_3.add(textField_1);
			textField_1.setColumns(10);
			
			JButton button_2 = new JButton("");
			button_2.setIcon(new ImageIcon(C_tixing_ui.class.getResource("/img/orderSel.png")));
			button_2.setBounds(272, 19, 33, 29);
			panel_3.add(button_2);
			
			JLabel label_2 = new JLabel("欠款天数");
			label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_2.setBounds(315, 19, 84, 29);
			panel_3.add(label_2);
			
			JComboBox comboBox = new JComboBox();
			comboBox.setBounds(409, 19, 50, 26);
			panel_3.add(comboBox);
			
			textField_2 = new JTextField();
			textField_2.setBounds(469, 19, 66, 26);
			panel_3.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel label_3 = new JLabel("天");
			label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_3.setBounds(545, 19, 27, 28);
			panel_3.add(label_3);
			
			JButton button_3 = new JButton("查  询");
			button_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button_3.setBounds(580, 19, 93, 27);
			panel_3.add(button_3);
			
			JPanel panel_4 = new JPanel();
			panel_4.setBackground(Color.WHITE);
			panel_1.add(panel_4, "name_75934033343400");
			panel_4.setLayout(null);
			
			JScrollPane scrollPane_2 = new JScrollPane();
			scrollPane_2.setBounds(10, 68, 800, 372);
			panel_4.add(scrollPane_2);
			
			table_2 = new JTable();
			JTableHeader head1 = table_2.getTableHeader(); // 创建表格标题对象
	        head1.setPreferredSize(new Dimension(head1.getWidth(), 35));// 设置表头大小
	        head1.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
			table_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
	        render1.setHorizontalAlignment(SwingConstants.CENTER);
	        table_2.setDefaultRenderer(Object.class, render1);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table_2.setRowHeight(30);
			table_2.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			scrollPane_2.setViewportView(table_2);
			
			JLabel label_4 = new JLabel("输入商品编号：");
			label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_4.setBounds(10, 19, 140, 28);
			panel_4.add(label_4);
			
			textField_3 = new JTextField();
			textField_3.setBounds(155, 23, 108, 28);
			panel_4.add(textField_3);
			textField_3.setColumns(10);
			
			JLabel label_5 = new JLabel("剩余天数");
			label_5.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_5.setBounds(273, 19, 97, 29);
			panel_4.add(label_5);
			
			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("宋体", Font.PLAIN, 20));
			comboBox_1.setBounds(372, 20, 71, 28);
			panel_4.add(comboBox_1);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("宋体", Font.PLAIN, 20));
			textField_4.setBounds(453, 20, 66, 28);
			panel_4.add(textField_4);
			textField_4.setColumns(10);
			
			JLabel label_6 = new JLabel("天");
			label_6.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_6.setBounds(529, 22, 29, 23);
			panel_4.add(label_6);
			
			JButton button_4 = new JButton("查询");
			button_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_4.setBounds(558, 22, 79, 27);
			panel_4.add(button_4);
			
			JLabel label_7 = new JLabel("默认提前十天提醒");
			label_7.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			label_7.setForeground(Color.RED);
			label_7.setBounds(647, 23, 150, 23);
			panel_4.add(label_7);
			
			JPanel panel_5 = new JPanel();
			panel_5.setBackground(Color.WHITE);
			panel_1.add(panel_5, "name_75934046062900");
			panel_5.setLayout(null);
			
			JScrollPane scrollPane_3 = new JScrollPane();
			scrollPane_3.setBounds(10, 64, 800, 376);
			panel_5.add(scrollPane_3);
			
			table_3 = new JTable();
			JTableHeader head = table_3.getTableHeader(); // 创建表格标题对象
	        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
	        head.setFont(new Font("楷体", Font.PLAIN, 20));// 设置表格字体
			table_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			DefaultTableCellRenderer render = new DefaultTableCellRenderer();
	        render.setHorizontalAlignment(SwingConstants.CENTER);
	        table_3.setDefaultRenderer(Object.class, render);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
	        //设置行高
	        table_3.setRowHeight(30);
			table_3.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null},
				},
				new String[] {
					"New column", "New column", "New column", "New column", "New column", "New column", "New column"
				}
			));
			scrollPane_3.setViewportView(table_3);
			
			JLabel label_8 = new JLabel("输入会员信息：");
			label_8.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_8.setBounds(27, 23, 147, 27);
			panel_5.add(label_8);
			
			textField_5 = new JTextField();
			textField_5.setBounds(174, 23, 130, 25);
			panel_5.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setBounds(326, 25, 66, 25);
			panel_5.add(textField_6);
			textField_6.setColumns(10);
			
			JLabel label_9 = new JLabel("天内生日");
			label_9.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_9.setBounds(402, 19, 93, 35);
			panel_5.add(label_9);
			
			JButton button_5 = new JButton("查询");
			button_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			button_5.setBounds(505, 22, 93, 26);
			panel_5.add(button_5);
			
			JLabel label_10 = new JLabel("默认提前3天提醒");
			label_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			label_10.setForeground(Color.RED);
			label_10.setBounds(646, 23, 147, 21);
			panel_5.add(label_10);
		}
		setVisible(true);
	}
}
