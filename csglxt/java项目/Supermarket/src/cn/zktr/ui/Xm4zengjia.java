package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import cn.zktr.dao.Xm1dao;
import cn.zktr.dao.Xm4dao;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm4st;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Xm4zengjia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	Xm4 xm;
	/**
	 * Launch the application.
	 */
	//创建一个父窗口对象
	Xm4dao dao=new Xm4dao();
	private JPasswordField passwordField;

	/**
	 * Create the dialog.
	 */
	public Xm4zengjia(JFrameInterface jframe) {
		this.xm=(Xm4) jframe.getJFrame();
		setTitle("增加员工");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 520, 587);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("员工姓名:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(56, 120, 116, 27);
			contentPanel.add(label);
		}
		{
			textField = new JTextField();
			textField.setBackground(new Color(0,0,0,0));
			textField.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField.setBounds(193, 116, 255, 34);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel label = new JLabel("所任职务:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(56, 193, 93, 37);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("联系电话:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(61, 276, 93, 29);
			contentPanel.add(label);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBackground(new Color(0,0,0,0));
			textField_2.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField_2.setBounds(193, 272, 256, 37);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"采购人员", "销售人员", "仓库人员", "系统人员", "超级管理员"}));
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		comboBox.setBounds(193, 193, 255, 37);
		contentPanel.add(comboBox);
		
		JLabel label_1 = new JLabel("增加员工");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 35));
		label_1.setBounds(175, 27, 221, 46);
		contentPanel.add(label_1);
		{
			JLabel label = new JLabel("联系地址:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(61, 353, 92, 34);
			contentPanel.add(label);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBackground(new Color(0,0,0,0));
			textField_3.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_3.setBounds(193, 355, 256, 37);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JButton btnf = new JButton("确定");
			btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
                    String ename=textField.getText();
					String epwd=passwordField.getText();
					String eposition=(String) comboBox.getSelectedItem();
					String ephone=textField_2.getText();
					String eadd=textField_3.getText();
					
					//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					//Date vdate = null;
//				try {
//					//vdate =simpleDateFormat.parse(textField_9.getText());
//				} catch (ParseException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
					
					//String vopera=textField_10.getText();
					Xm4st good=new Xm4st(ename,epwd,eposition,ephone,eadd);
					try {
						int isok=dao.intste(good);
					if(isok>0){
							//新增成功，调用父窗口的刷新方法，并关闭当前窗口
							xm.updateTable();
						}else{
							
							JOptionPane.showMessageDialog(null, "商品新增失败");
						}
						Xm4zengjia.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					setVisible(false);
					}
				}
			});
			{
				JLabel lblNewLabel = new JLabel("密     码：");
				lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				lblNewLabel.setBounds(61, 427, 111, 34);
				contentPanel.add(lblNewLabel);
			}
			
			passwordField = new JPasswordField();
			passwordField.setBackground(new Color(0,0,0,0));
			passwordField.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			passwordField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			passwordField.setBounds(193, 427, 255, 34);
			contentPanel.add(passwordField);
			btnf.setBounds(61, 499, 116, 27);
			contentPanel.add(btnf);
		}
		{
			JButton btnf_1 = new JButton("退出");
			btnf_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf_1.setBounds(332, 499, 116, 27);
			contentPanel.add(btnf_1);
		}
		//子页面关闭才能动主页面
				setModal(true);
				//不能改变大小
				setResizable(false);
				setVisible(true);
	}
}
