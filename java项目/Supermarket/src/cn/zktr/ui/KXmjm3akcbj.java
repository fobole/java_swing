package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class KXmjm3akcbj extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JLayeredPane layeredPane;
	CardLayout car=new CardLayout();
	private JTable table;
	private JTable table_1;
	/**
	 * 库存报警进退货参考
	 */
	public static void main(String[] args) {
		try {
			KXmjm3akcbj dialog = new KXmjm3akcbj();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public KXmjm3akcbj() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm3akcbj.class.getResource("/img/logo544.png")));
		setTitle("进退货参考");
		setBounds(100, 100, 1206, 798);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1200, 769);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JButton button = new JButton("进货参考");
			button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if (but.getText().equals("进货参考")) {
						car.show(layeredPane, "name_934939146979400");
					}
				}
			});
			button.setBounds(10, 10, 118, 29);
			panel.add(button);
			
			JButton button_1 = new JButton("退货参考");
			button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JButton but=(JButton) e.getSource();
					if (but.getText().equals("退货参考")) {
						car.show(layeredPane, "name_934939169291400");
					}
				}
			});
			button_1.setBounds(138, 10, 118, 29);
			panel.add(button_1);
			
			 layeredPane = new JLayeredPane();
			layeredPane.setBounds(10, 43, 1190, 726);
			panel.add(layeredPane);
			layeredPane.setLayout(car);
			
			JLayeredPane layeredPane_1 = new JLayeredPane();
			layeredPane_1.setBackground(new Color(255, 255, 255));
			layeredPane.add(layeredPane_1, "name_934939146979400");
			
			JButton btnNewButton = new JButton("");
			btnNewButton.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/querySupply.png")));
			btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnNewButton.setBounds(10, 10, 72, 68);
			layeredPane_1.add(btnNewButton);
			
			JButton button_2 = new JButton("");
			button_2.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/GoodUpdate.png")));
			button_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_2.setBounds(96, 10, 72, 68);
			layeredPane_1.add(button_2);
			
			JButton button_3 = new JButton("");
			button_3.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/GoodDel.png")));
			button_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_3.setBounds(189, 10, 72, 68);
			layeredPane_1.add(button_3);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 88, 1190, 595);
			layeredPane_1.add(scrollPane);
			
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"\u5546\u54C1\u7F16\u53F7", "\u5546\u54C1\u540D\u79F0", "\u5355\u4F4D", "\u89C4\u683C\u578B\u53F7", "\u989C\u8272", "\u4F9B\u5E94\u5546", "\u53C2\u8003\u8FDB\u8D27\u6570\u91CF", "\u5F53\u524D\u5E93\u5B58\u6570\u91CF"
				}
			));
			table.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			JTableHeader head3 = table.getTableHeader(); // 创建表格标题对象
	        head3.setPreferredSize(new Dimension(head3.getWidth(), 35));// 设置表头大小
	        head3.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
	        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
	        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
	        DefaultTableCellRenderer render3 = new DefaultTableCellRenderer();
	        render3.setHorizontalAlignment(SwingConstants.CENTER);
	        table.setDefaultRenderer(Object.class, render3);
			scrollPane.setViewportView(table);
			
			JLayeredPane layeredPane_2 = new JLayeredPane();
			layeredPane_2.setBackground(new Color(204, 153, 153));
			layeredPane.add(layeredPane_2, "name_934939169291400");
			
			JButton button_4 = new JButton("");
			button_4.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/querySupply.png")));
			button_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_4.setBounds(10, 10, 77, 73);
			layeredPane_2.add(button_4);
			
			JButton button_5 = new JButton("");
			button_5.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/GoodUpdate.png")));
			button_5.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_5.setBounds(110, 10, 77, 73);
			layeredPane_2.add(button_5);
			
			JButton button_6 = new JButton("");
			button_6.setIcon(new ImageIcon(KXmjm3akcbj.class.getResource("/img/deleteSupply.png")));
			button_6.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			button_6.setBounds(208, 10, 77, 73);
			layeredPane_2.add(button_6);
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 132, 1190, 637);
			panel.add(scrollPane_1);
			
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
					{null, null, null, null, null, null, null, null},
				},
				new String[] {
					"\u5546\u54C1\u7F16\u53F7", "\u5546\u54C1\u540D\u79F0", "\u5355\u4F4D", "\u89C4\u683C\u578B\u53F7", "\u989C\u8272", "\u4F9B\u5E94\u5546", "\u53C2\u8003\u8FDB\u8D27\u6570\u91CF", "\u5F53\u524D\u5E93\u5B58\u6570\u91CF"
				}
			));
			table_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			JTableHeader head2 = table_1.getTableHeader(); // 创建表格标题对象
	        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
	        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
	        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
	        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
	        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
	        render2.setHorizontalAlignment(SwingConstants.CENTER);
	        table_1.setDefaultRenderer(Object.class, render2);
	        //线条颜色
//	      table_1_1.setGridColor(Color.red);
	        //设置行高
	        table_1.setRowHeight(30);

			
			scrollPane_1.setViewportView(table_1);
		}
		//子页面关闭才能动主页面
						setModal(true);
						//不能改变大小
						setResizable(false);

		//居中
						setLocationRelativeTo(null);


		setVisible(true);
	}
}
