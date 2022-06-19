package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.entity.Xm3users;
import cn.zktr.entity.xm3hyzhengjia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Xm3zengjia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_2;
	private JTextField textField_7;
	Xm3 xm;
	/**
	 * Launch the application.
	 */
	//创建一个父窗口对象
	Xm3zengjiadao dao=new Xm3zengjiadao();
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Create the dialog.
	 */
	public Xm3zengjia(JFrameInterface jframe) {
		//将传回的父窗口进行接收
		this.xm=(Xm3) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("增加会员信息");
		setBounds(100, 100, 535, 576);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 509, 535);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("新增会员");
				label.setFont(new Font("微软雅黑", Font.BOLD, 30));
				label.setBounds(181, 0, 186, 50);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("会员级别:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(61, 85, 109, 34);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("会员名称:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(61, 161, 108, 43);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBackground(new Color(0,0,0,0));
				textField_2.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_2.setBounds(192, 165, 245, 34);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员密码:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(61, 356, 112, 31);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("联系电话:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(61, 260, 101, 34);
				panel.add(label);
			}
			{
				textField_7 = new JTextField();
				textField_7.setBackground(new Color(0,0,0,0));
				textField_7.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_7.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_7.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_7.setBounds(192, 260, 245, 34);
				panel.add(textField_7);
				textField_7.setColumns(10);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBackground(new Color(0,0,0,0));
				textField_1.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
				textField_1.setBounds(192, 85, 245, 34);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JButton btnf = new JButton("确定");
				btnf.setBounds(58, 452, 113, 34);
				panel.add(btnf);
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//int  vid=Integer.parseInt(textField.getText());
						String vname=textField_2.getText();
						
						String vmm=passwordField.getText();
						String vphone=textField_7.getText();
						String vgrade=textField_1.getText();
						String vopera="肖涵丰";
						//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
						//Date vdate = null;
//					try {
//						//vdate =simpleDateFormat.parse(textField_9.getText());
//					} catch (ParseException e2) {
//						// TODO Auto-generated catch block
//						e2.printStackTrace();
//					}
						
						//String vopera=textField_10.getText();
						xm3hyzhengjia good=new xm3hyzhengjia(vname, vphone, vmm,vgrade, 0,vgrade);
						try {
							int isok=dao.intstevip(good,vopera);
							if(isok>0){
								//新增成功，调用父窗口的刷新方法，并关闭当前窗口
								xm.updateTable();
							}else{
								
								JOptionPane.showMessageDialog(null, "商品新增失败");
							}
							Xm3zengjia.this.dispose();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						
						}
					}});
				
				btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
			}
			JButton btnf_1 = new JButton("退出");
			btnf_1.setBounds(324, 452, 113, 34);
			panel.add(btnf_1);
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			
			passwordField = new JPasswordField();
			passwordField.setBackground(new Color(0,0,0,0));
			passwordField.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			passwordField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			passwordField.setBounds(192, 354, 245, 34);
			panel.add(passwordField);
		}
		{
			
			//子页面关闭才能动主页面
			setModal(true);
			//不能改变大小
			setResizable(false);
			setVisible(true);
		}
	}
}
