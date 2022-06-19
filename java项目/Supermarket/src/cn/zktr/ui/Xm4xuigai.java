package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
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
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Xm4xuigai extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	JTable table;
	/**
	 * Launch the application.
	 */
	Xm4 gui;
	 Xm4 xm;
	Xm4dao dao=new Xm4dao();
	
	JComboBox comboBox ;
	

	
	
	//员工名
	JLabel label;

	/**
	 * Create the dialog.
	 */
	public Xm4xuigai(JFrameInterface jframe) {
		this.gui=(Xm4) jframe.getJFrame();
		setTitle("修改员工");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 551, 556);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label_1 = new JLabel();
			label_1.setBounds(0, 0, 105, 49);
			contentPanel.add(label_1);
		}
		{
			JLabel label = new JLabel("员工姓名:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(55, 83, 116, 33);
			contentPanel.add(label);
		}
		{
			label = new JLabel(gui.xm.getEname());
			label.setFont(new Font("微软雅黑", Font.BOLD, 20));
			label.setBounds(191, 83, 280, 39);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("所任职务:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(55, 155, 93, 33);
			contentPanel.add(label);
		}
		{
		 comboBox = new JComboBox();
			comboBox.setFont(new Font("微软雅黑", Font.BOLD, 24));
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"采购人员", "销售人员", "仓库人员", "系统人员", "超级管理员"}));
			comboBox.setBounds(191, 156, 280, 36);
			contentPanel.add(comboBox);
		}
		{
			JLabel label = new JLabel("联系电话:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(55, 236, 93, 36);
			contentPanel.add(label);
		}
		{
			textField_2 = new JTextField(gui.xm.getEphone());
			textField_2.setBackground(new Color(0,0,0,0));
			textField_2.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			textField_2.setBounds(191, 236, 288, 36);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel label = new JLabel("联系地址:");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(55, 309, 92, 36);
			contentPanel.add(label);
		}
		{
			textField_3 = new JTextField(gui.xm.getEadd());
			textField_3.setBackground(new Color(0,0,0,0));
			textField_3.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			textField_3.setBounds(191, 309, 288, 36);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel label = new JLabel("密    码：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(55, 383, 116, 39);
			contentPanel.add(label);
		}
		{
			passwordField = new JPasswordField(gui.xm.getEpwd());
			passwordField.setBackground(new Color(0,0,0,0));
			passwordField.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			passwordField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			passwordField.setBounds(191, 392, 288, 33);
			contentPanel.add(passwordField);
		}
		{
			JButton btnf = new JButton("确定");
			btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(gui.table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "请选中数据行");
						
					}else {
						int row=gui.table.getSelectedRow();
						int eid=(int) gui.table.getValueAt(row, 0);
////						
						 String ename=label.getText();
						
							String epwd=passwordField.getText();
							String eposition=(String) comboBox.getSelectedItem();
							String ephone=textField_2.getText();
							String eadd=textField_3.getText();
							

						Xm4st good=new Xm4st(eid,ename,epwd,eposition,ephone,eadd);
//							String name=xm.a.getEname()
								try {
									if(gui.lblNewLabel_1.getText().equals(ename)) {
										 int isok=dao.updatexg(eid,good);
										 if(isok>0) {
												gui.updateTable();
											}else {
												JOptionPane.showMessageDialog(null, "修改失败");
											}
											Xm4xuigai.this.dispose();
//											System.exit(0);
//											new Zujm_ui().dispose();
											gui.dispose();
											gui.gui.dispose();
											Denglu_ui2 d=new Denglu_ui2();
									 }else {
										 int isok=dao.updatexg(eid,good);
											if(isok>0) {
												gui.updateTable();
											}else {
												JOptionPane.showMessageDialog(null, "修改失败");
											}
											Xm4xuigai.this.dispose();
									 }
									
									
									
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					}
					setVisible(false);
				}
			});
			btnf.setBounds(55, 465, 116, 36);
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
			btnf_1.setBounds(362, 465, 116, 36);
			contentPanel.add(btnf_1);
		}
		{
			JLabel label = new JLabel("修改员工");
			label.setFont(new Font("微软雅黑", Font.BOLD, 30));
			label.setBounds(182, 10, 193, 49);
			contentPanel.add(label);
		}
		//子页面关闭才能动主页面
				setModal(true);
				//不能改变大小
				setResizable(false);
				setVisible(true);
	}

}
