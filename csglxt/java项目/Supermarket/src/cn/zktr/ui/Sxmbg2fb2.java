/*
 * 查询子页面
 */
package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sxmbg2fb2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the dialog.
	 */
	public Sxmbg2fb2() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg2fb2.class.getResource("/img/logo544.png")));
		setTitle("查找");
		setBounds(100, 100, 490, 391);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel label = new JLabel("客户名称：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setBounds(50, 34, 105, 18);
		panel.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setBounds(154, 28, 159, 24);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("开单日期：");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_1.setBounds(50, 76, 105, 18);
		panel.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_1.setBounds(153, 73, 160, 24);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("至");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_2.setBounds(116, 117, 27, 18);
		panel.add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_2.setBounds(153, 116, 160, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_3 = new JLabel("仓库名称：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_3.setBounds(50, 156, 105, 18);
		panel.add(label_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"所有仓库", "主仓库", "酒库", "饮料库"}));
		comboBox.setBounds(152, 153, 161, 24);
		panel.add(comboBox);
		
		JLabel label_4 = new JLabel("操作员：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_4.setBounds(68, 193, 87, 23);
		panel.add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"所有操作员", "刘伟", "兰凯军", "肖涵丰", "赖春艳"}));
		comboBox_1.setBounds(152, 189, 163, 27);
		panel.add(comboBox_1);
		
		JButton btnf = new JButton("确定");
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf.setBounds(74, 247, 139, 37);
		panel.add(btnf);
		
		JButton btnf_1 = new JButton("退出");
		btnf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf_1.setBounds(266, 247, 138, 37);
		panel.add(btnf_1);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Sxmbg2fb2.class.getResource("/img/orderSel.png")));
		button.setBounds(323, 25, 39, 27);
		panel.add(button);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setModal(true);
		setVisible(true);
	}
}
