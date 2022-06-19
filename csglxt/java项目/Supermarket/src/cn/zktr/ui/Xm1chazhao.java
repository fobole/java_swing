package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Xm1chazhao extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	
	/**
	 * Create the dialog.
	 */
	public Xm1chazhao() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("供货商查找");
		setBounds(100, 100, 528, 355);
		//居中
		setLocationRelativeTo(null);
		
		getContentPane().setLayout(new BorderLayout());
		{
			JPanel panel = new JPanel();
			getContentPane().add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			
			JLabel label = new JLabel("供货商名称:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(93, 31, 111, 21);
			panel.add(label);
			
			textField = new JTextField();
			textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField.setBounds(214, 28, 170, 24);
			panel.add(textField);
			textField.setColumns(10);
			
			JLabel label_1 = new JLabel("联系人:");
			label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_1.setBounds(132, 62, 83, 21);
			panel.add(label_1);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField_1.setBounds(214, 62, 170, 24);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel label_2 = new JLabel("联系电话:");
			label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_2.setBounds(113, 102, 102, 21);
			panel.add(label_2);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField_2.setBounds(214, 99, 170, 24);
			panel.add(textField_2);
			textField_2.setColumns(10);
			
			JLabel label_3 = new JLabel("联系地址:");
			label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_3.setBounds(110, 139, 94, 21);
			panel.add(label_3);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField_3.setBounds(214, 136, 170, 24);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			JButton btnNewButton = new JButton("确定(F5)");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnNewButton.setBounds(104, 224, 111, 27);
			panel.add(btnNewButton);
			
			JButton btnf = new JButton("取消(F4)");
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf.setBounds(263, 224, 111, 27);
			panel.add(btnf);
		}

		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setVisible(true);
	}

}
