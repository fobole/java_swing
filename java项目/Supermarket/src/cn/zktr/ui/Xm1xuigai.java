package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import cn.zktr.dao.Xm1dao;
import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.xm3hyzhengjia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Xm1xuigai extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	
	Xm1 gui;
	protected Xm1 xm;
	Xm1dao dao=new Xm1dao();
	/*
	 * Create the dialog.
	 */
	public Xm1xuigai(JFrameInterface jframe) {
		//将传回的父窗口进行接收
		this.gui=(Xm1) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("修改供货商");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 506, 501);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 361);
		contentPanel.add(panel);
		panel.setLayout(null);
		{
			JLabel label = new JLabel("供货商名称：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(51, 85, 127, 34);
			panel.add(label);
		}
		{
			textField = new JTextField(gui.m1.getSbusiness());
			textField.setBackground(new Color(0,0,0,0));
			textField.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
			textField.setBounds(203, 85, 221, 34);
			panel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel label = new JLabel("联系人：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(51, 165, 96, 30);
			panel.add(label);
		}
		{
			textField_1 = new JTextField(gui.m1.getSname());
			textField_1.setBackground(new Color(0,0,0,0));
			textField_1.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			textField_1.setBounds(203, 165, 221, 34);
			panel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel label = new JLabel("联系电话：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(51, 245, 116, 30);
			panel.add(label);
		}
		{
			textField_2 = new JTextField(gui.m1.getSphone());
			textField_2.setBackground(new Color(0,0,0,0));
			textField_2.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
			textField_2.setBounds(203, 245, 221, 34);
			panel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel label = new JLabel("联系地址：");
			label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label.setBounds(51, 310, 127, 34);
			panel.add(label);
		}
		{
			textField_3 = new JTextField(gui.m1.getSaddress());
			textField_3.setBackground(new Color(0,0,0,0));
			textField_3.setOpaque(false);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

			textField_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
			textField_3.setBounds(203, 310, 221, 34);
			panel.add(textField_3);
			textField_3.setColumns(10);
		}
		
		JLabel label = new JLabel("修改供应商");
		label.setFont(new Font("微软雅黑", Font.BOLD, 30));
		label.setBounds(153, 10, 204, 41);
		panel.add(label);
		
		JButton btnf = new JButton("保存");
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(gui.table.getSelectedRow()<0) {
					JOptionPane.showMessageDialog(null, "请选中数据行");
					
				}else {
					int row=gui.table.getSelectedRow();
					int sid=(int) gui.table.getValueAt(row, 0);
//					
					String sbusiness=textField.getText();
					
					String sname=textField_1.getText();
					String sphone=textField_2.getText();
					String saddress=textField_3.getText();
					//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					//Date vdate = null;
//					try {
//						//vdate =simpleDateFormat.parse(textField_9.getText());
//					} catch (ParseException e2) {
//						// TODO Auto-generated catch block
//						e2.printStackTrace();
//					}
					//int vid=xm.xm3zj.getVid();
					//String vopera=textField_10.getText();
					
					Xm1st good=new Xm1st(sid,sbusiness,sname,sphone,saddress);
						
					//int row=gui.
//					gui.list.get(row, new Xm3(0, gname, gbid, gprice, gspec, stshu));
					
//					Cgoods_jiujia g=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//					System.out.println(g);
//					gui.list2.add(g);
//					System.out.println(gui.list2.add(g));
							//新增成功，调用父窗口的刷新方法，并关闭当前窗口
					
							try {
								int isok=dao.updatexg(sid,good);
								if(isok>0) {
									gui.updateTable();
								}else {
									JOptionPane.showMessageDialog(null, "修改失败");
								}
								
								Xm1xuigai.this.dispose();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				}
				
				setVisible(false);
			}
		});
		btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		btnf.setBounds(51, 396, 113, 27);
		contentPanel.add(btnf);
		
		JButton btnf_1 = new JButton("退出");
		btnf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnf_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		btnf_1.setBounds(309, 396, 113, 27);
		contentPanel.add(btnf_1);
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setVisible(true);
		
	}
}
