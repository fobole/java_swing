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
import cn.zktr.entity.xm3hyzhengjia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Xm3xuigai1 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	//创建一个父窗口对象
	Xm3 gui;
	protected Xm3 xm;
	Xm3zengjiadao dao=new Xm3zengjiadao();
	private JPasswordField passwordField;
	private JTextField textField_1;
	/**
	 * Create the dialog.
	 */
	public Xm3xuigai1(JFrameInterface jframe) {
		//将传回的父窗口进行接收
				this.gui=(Xm3) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("修改会员信息");
		setBounds(100, 100, 511, 513);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 478, 359);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("修改会员");
				label.setFont(new Font("微软雅黑", Font.BOLD, 30));
				label.setBounds(175, 10, 136, 33);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("会员级别:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(56, 145, 109, 33);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("会员名称:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(56, 76, 109, 33);
				panel.add(label);
			}
			{
				textField_2 = new JTextField(gui.xm3zj.getVname());
				textField_2.setBackground(new Color(0,0,0,0));
				textField_2.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_2.setBounds(175, 75, 234, 33);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel label = new JLabel("会员密码:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(56, 290, 112, 33);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("联系电话:");
				label.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label.setBounds(55, 218, 101, 27);
				panel.add(label);
			}
			{
				textField_7 = new JTextField(gui.xm3zj.getVphone());
				textField_7.setBackground(new Color(0,0,0,0));
				textField_7.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_7.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_7.setFont(new Font("微软雅黑", Font.PLAIN, 18));
				textField_7.setBounds(176, 216, 234, 33);
				panel.add(textField_7);
				textField_7.setColumns(10);
			}
			{
				passwordField = new JPasswordField(gui.xm3zj.getVpwd());
				passwordField.setBackground(new Color(0,0,0,0));
				passwordField.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				passwordField.setBounds(176, 290, 234, 33);
				panel.add(passwordField);
			}
			{
				textField_1 = new JTextField("普通会员");
				textField_1.setBackground(new Color(0,0,0,0));
				textField_1.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
				textField_1.setBounds(177, 145, 234, 33);
				panel.add(textField_1);    
				textField_1.setColumns(10);
			}
		}
		{
			JButton btnf_1 = new JButton("退出");
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			btnf_1.setBounds(305, 409, 113, 37);
			contentPanel.add(btnf_1);
			contentPanel.add(btnf_1);
			{
				JButton btnf = new JButton("确定");
				btnf.setBounds(59, 409, 113, 37);
				contentPanel.add(btnf);
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(gui.table.getSelectedRow()<0) {
							JOptionPane.showMessageDialog(null, "请选中数据行");
							
						}else {
							int row=gui.table.getSelectedRow();
							int vid=(int) gui.table.getValueAt(row, 0);
//						String  vid=textField.getText();
							String vname=textField_2.getText();
							String vmm=passwordField.getText();
							String vphone=textField_7.getText();
							String vphore=textField_1.getText();//电话
							//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
							//Date vdate = null;
//						try {
//							//vdate =simpleDateFormat.parse(textField_9.getText());
//						} catch (ParseException e2) {
//							// TODO Auto-generated catch block
//							e2.printStackTrace();
//						}
							//int vid=xm.xm3zj.getVid();
							//String vopera=textField_10.getText();
							
							xm3hyzhengjia good=new xm3hyzhengjia(vid,vname, vphone , vmm,vphore);
								
							//int row=gui.
//						gui.list.get(row, new Xm3(0, gname, gbid, gprice, gspec, stshu));
							
//						Cgoods_jiujia g=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//						System.out.println(g);
//						gui.list2.add(g);
//						System.out.println(gui.list2.add(g));
									//新增成功，调用父窗口的刷新方法，并关闭当前窗口
							
									try {
										int isok=dao.updatexg(vid, good);
										if(isok>0) {
											gui.updateTable();
										}else {
											JOptionPane.showMessageDialog(null, "修改失败");
										}
										
										Xm3xuigai1.this.dispose();
									} catch (Exception e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
						}
						
					}
				});

				
				btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
			}
			
			//子页面关闭才能动主页面
			setModal(true);
			//不能改变大小
			setResizable(false);
			setVisible(true);
		}
	}

}
