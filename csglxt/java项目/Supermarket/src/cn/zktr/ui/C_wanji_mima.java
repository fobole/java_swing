package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import cn.zktr.dao.Cdenglu_dao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class C_wanji_mima extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	
	
	Cdenglu_dao mdao=new Cdenglu_dao();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			C_wanji_mima dialog = new C_wanji_mima();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public C_wanji_mima() {
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
				
		setBounds(100, 100, 550, 558);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("用 户 名：");
		label.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label.setBounds(62, 90, 121, 42);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("电话号码：");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_1.setBounds(62, 182, 170, 42);
		contentPanel.add(label_1);
		
		textField = new JTextField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		textField.setBackground(new Color(0,0,0,0));
		textField.setOpaque(false);
				        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField.setBounds(217, 96, 233, 42);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		textField_1.setBackground(new Color(0,0,0,0));
		textField_1.setOpaque(false);
				        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField_1.setBounds(217, 182, 233, 42);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_2 = new JLabel("密       码：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_2.setBounds(62, 268, 139, 36);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("修改密码");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 30));
		label_3.setBounds(198, 10, 170, 42);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("确认密码：");
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_4.setBounds(62, 344, 136, 46);
		contentPanel.add(label_4);
		
		passwordField = new JPasswordField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		passwordField.setBackground(new Color(0,0,0,0));
		passwordField.setOpaque(false);
				        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		passwordField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField.setBounds(218, 263, 230, 37);
		contentPanel.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		passwordField_1.setBackground(new Color(0,0,0,0));
		passwordField_1.setOpaque(false);
				        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		passwordField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		passwordField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField_1.setBounds(218, 344, 230, 41);
		contentPanel.add(passwordField_1);
		
		JButton btnNewButton = new JButton("取 消");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_wanji_mima.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton.setBounds(59, 441, 110, 39);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("确 定");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ename=textField.getText();
				String ephone=textField_1.getText();
				String pwd=passwordField.getText();
				String pwd1=passwordField_1.getText();
				if(pwd.equals(pwd1)) {
					try {
						int isok=mdao.wanji(pwd, ename, ephone);
						if(isok>0) {
							JOptionPane.showMessageDialog(null, "密码重置成功");
							C_wanji_mima.this.dispose();
						}else {
							JOptionPane.showMessageDialog(null, "密码重置失败");
							C_wanji_mima.this.dispose();
						}
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "密码和确认密码不一样");
					return;
				}
			
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		btnNewButton_1.setBounds(332, 441, 110, 39);
		contentPanel.add(btnNewButton_1);
		setVisible(true);
	}
	
}
