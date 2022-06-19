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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class C_xiugai_mima extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	private JPasswordField passwordField_2;
	
	//用户名
	JLabel label_1;
	
	Cdenglu_dao mdao=new Cdenglu_dao();
	
	Zujm_ui gui;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			C_xiugai_mima dialog = new C_xiugai_mima();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public C_xiugai_mima(JFrameInterface2 j) {
		this.gui=(Zujm_ui) j.getJFrame();
		//子页面关闭才能动主页面
				setModal(true);
				//不能改变大小
				setResizable(false);
		setBounds(100, 100, 554, 538);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("修改密码");
		label.setFont(new Font("微软雅黑", Font.BOLD, 30));
		label.setBounds(168, 29, 162, 45);
		contentPanel.add(label);
		
		JLabel lblNewLabel = new JLabel("用 户 名：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
		lblNewLabel.setBounds(70, 112, 131, 45);
		contentPanel.add(lblNewLabel);
		
		label_1 = new JLabel(gui.label_2.getText());
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		label_1.setBackground(new Color(0,0,0,0));
		label_1.setOpaque(false);
		        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		label_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_1.setBounds(233, 112, 214, 34);
		contentPanel.add(label_1);
		
		passwordField = new JPasswordField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		passwordField.setBackground(new Color(0,0,0,0));
		passwordField.setOpaque(false);
        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		passwordField.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField.setBounds(233, 185, 214, 34);
		contentPanel.add(passwordField);
		
		JLabel label_2 = new JLabel("老 密 码：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_2.setBounds(70, 178, 117, 45);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel("新 密 码：");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_3.setBounds(70, 254, 117, 45);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("确认密码：");
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_4.setBounds(70, 324, 131, 45);
		contentPanel.add(label_4);
		
		passwordField_1 = new JPasswordField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		passwordField_1.setBackground(new Color(0,0,0,0));
		passwordField_1.setOpaque(false);
		        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		passwordField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		passwordField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField_1.setBounds(233, 254, 214, 34);
		contentPanel.add(passwordField_1);
		
		passwordField_2 = new JPasswordField();
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		passwordField_2.setBackground(new Color(0,0,0,0));
		passwordField_2.setOpaque(false);
		        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		passwordField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		passwordField_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		passwordField_2.setBounds(233, 324, 214, 34);
		contentPanel.add(passwordField_2);
		
		JButton button = new JButton("取 消");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				C_xiugai_mima.this.dispose();
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 25));
		button.setBounds(70, 411, 101, 39);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("确 定");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ename=label_1.getText();
				String pwd=passwordField.getText();
				String pwd1=passwordField_1.getText();
				String pwd2=passwordField_2.getText();
				if(pwd1.equals(pwd2)) {
					try {
						int isok=mdao.xiugai(pwd2, ename, pwd);
						if(isok>0) {
							JOptionPane.showMessageDialog(null, "密码重置成功");
							C_xiugai_mima.this.dispose();
							gui.dispose();
							Denglu_ui2 d=new Denglu_ui2();
						}else {
							JOptionPane.showMessageDialog(null, "密码重置失败");
							C_xiugai_mima.this.dispose();
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
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
		button_1.setBounds(332, 411, 101, 39);
		contentPanel.add(button_1);
		setVisible(true);
	}
}
