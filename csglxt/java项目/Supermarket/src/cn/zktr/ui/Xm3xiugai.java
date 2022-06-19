package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class Xm3xiugai extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the dialog.
	 */
	public Xm3xiugai() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("修改会员信息");
		setBounds(100, 100, 724, 513);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(14, 25, 678, 384);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("会员信息:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 0, 72, 18);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("会员编号:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 32, 72, 18);
				panel.add(label);
			}
			{
				textField = new JTextField();
				textField.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField.setBounds(89, 29, 194, 24);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员级别:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(333, 32, 72, 18);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setText("高级会员");
				textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_1.setBounds(419, 29, 183, 24);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员名称:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 62, 72, 18);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_2.setBounds(89, 59, 194, 24);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员密码:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
				label.setBounds(333, 65, 72, 20);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_3.setBounds(419, 59, 183, 24);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员生日:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 96, 72, 18);
				panel.add(label);
			}
			{
				textField_4 = new JTextField();
				textField_4.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_4.setBounds(89, 93, 64, 24);
				panel.add(textField_4);
				textField_4.setColumns(10);
			}
			{
				JSpinner spinner = new JSpinner();
				spinner.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				spinner.setBounds(167, 93, 52, 24);
				panel.add(spinner);
			}
			{
				JSpinner spinner = new JSpinner();
				spinner.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				spinner.setBounds(233, 96, 50, 24);
				panel.add(spinner);
			}
			{
				JLabel label = new JLabel("确定密码:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(333, 96, 72, 18);
				panel.add(label);
			}
			{
				textField_5 = new JTextField();
				textField_5.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_5.setBounds(419, 94, 183, 24);
				panel.add(textField_5);
				textField_5.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员积分:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 133, 72, 18);
				panel.add(label);
			}
			{
				textField_6 = new JTextField();
				textField_6.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_6.setBounds(89, 130, 194, 24);
				panel.add(textField_6);
				textField_6.setColumns(10);
			}
			{
				JLabel label = new JLabel("联系电话:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(333, 133, 72, 18);
				panel.add(label);
			}
			{
				textField_7 = new JTextField();
				textField_7.setBounds(419, 131, 183, 24);
				panel.add(textField_7);
				textField_7.setColumns(10);
			}
			{
				JLabel label = new JLabel("微信卡号:");
				label.setBounds(14, 170, 72, 18);
				panel.add(label);
			}
			{
				textField_8 = new JTextField();
				textField_8.setBounds(89, 167, 194, 24);
				panel.add(textField_8);
				textField_8.setColumns(10);
			}
			{
				JLabel label = new JLabel("加入日期:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 206, 72, 18);
				panel.add(label);
			}
			{
				textField_9 = new JTextField();
				textField_9.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_9.setText("2021-06-09");
				textField_9.setBounds(89, 201, 194, 24);
				panel.add(textField_9);
				textField_9.setColumns(10);
			}
			{
				JLabel label = new JLabel("截止日期:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(333, 207, 72, 18);
				panel.add(label);
			}
			{
				textField_10 = new JTextField();
				textField_10.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_10.setText("2021-06-09");
				textField_10.setBounds(419, 204, 183, 24);
				panel.add(textField_10);
				textField_10.setColumns(10);
			}
			{
				JCheckBox checkBox = new JCheckBox("该会员卡按积分自动升级");
				checkBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				checkBox.setBounds(14, 233, 269, 27);
				panel.add(checkBox);
			}
			{
				JCheckBox checkBox = new JCheckBox("该会员卡有截止日期");
				checkBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				checkBox.setBounds(329, 234, 206, 27);
				panel.add(checkBox);
			}
			{
				JCheckBox checkBox = new JCheckBox("与微信会员进行关联");
				checkBox.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				checkBox.setBounds(14, 260, 194, 27);
				panel.add(checkBox);
			}
			{
				JCheckBox chckbxNewCheckBox = new JCheckBox("启用该会员卡");
				chckbxNewCheckBox.setBounds(329, 261, 133, 27);
				panel.add(chckbxNewCheckBox);
			}
			{
				JLabel label = new JLabel("备注:");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				label.setBounds(14, 296, 72, 18);
				panel.add(label);
			}
			{
				textField_11 = new JTextField();
				textField_11.setFont(new Font("微软雅黑", Font.PLAIN, 15));
				textField_11.setBounds(89, 296, 470, 88);
				panel.add(textField_11);
				textField_11.setColumns(10);
			}
		}
		{
			JButton btnf = new JButton("确定(F5)");
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			
			btnf.setBounds(178, 422, 113, 27);
			contentPanel.add(btnf);
		}
		{
			JButton btnf_1 = new JButton("退出(F4)");
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf_1.setBounds(324, 422, 113, 27);
			contentPanel.add(btnf_1);
			
		}
		
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setVisible(true);
	}

}
