package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.dao.C_TypeDao;
import cn.zktr.dao.Caigou_shenheztai_dao;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.C_kucun_biandong;
import cn.zktr.entity.Caigou_gongyingshang;
import cn.zktr.entity.Cgoods_jiujia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JComboBox;

public class Caigou_xinzen_ui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField;

//	List<C_kucun_biandong> list=new ArrayList<C_kucun_biandong>();
//	C_TypeDao tdao=new C_TypeDao();
	private JTextField textField_1;

	//类型dao
	C_TypeDao type=new C_TypeDao();
	
	Caigou_shenheztai_dao ghao=new Caigou_shenheztai_dao();
	
	//供应商
	JComboBox comboBox;
	//类型
	JComboBox comboBox_1;
	//创建一个父窗口对象
		Caiguo_cai_ui gui;
		private JTextField textField_3;
		private JTextField textField_4;
		private JTextField textField_5;
	/**
	 * 新商品添加界面
	 */
	public Caigou_xinzen_ui(JFrameInterface jframe) {
		//将传回的父窗口进行接收
		this.gui= (Caiguo_cai_ui) jframe.getJFrame();
		setTitle("商品基本信息");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Caigou_xinzen_ui.class.getResource("/img/logo544.png")));
//		try {
//			UIManager.setLookAndFeel(new SubstanceLookAndFeel());
//		} catch (UnsupportedLookAndFeelException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		//子页面关闭才能动主页面
						setModal(true);
						//不能改变大小
						setResizable(false);
		


		setBounds(100, 100, 714, 528);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 700, 489);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("商品基本信息");
				label.setFont(new Font("华文楷体", Font.BOLD, 50));
				label.setBounds(165, 10, 327, 46);
				panel.add(label);
			}
			{
				JLabel label = new JLabel("商品名称：");
				label.setFont(new Font("微软雅黑", Font.BOLD, 25));
				label.setBounds(31, 95, 135, 27);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setFont(new Font("微软雅黑", Font.BOLD, 22));
				textField_2.setBounds(165, 89, 146, 37);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			
			{
				JLabel label = new JLabel("预设进价：");
				label.setFont(new Font("微软雅黑", Font.BOLD, 25));
				label.setBounds(31, 166, 135, 30);
				panel.add(label);
			}
			{
				textField_8 = new JTextField();
				textField_8.setFont(new Font("微软雅黑", Font.BOLD, 22));
				textField_8.setBounds(167, 162, 144, 37);
				panel.add(textField_8);
				textField_8.setColumns(10);
			}
			
			textField = new JTextField();
			textField.setFont(new Font("微软雅黑", Font.BOLD, 22));
			textField.setBounds(490, 88, 146, 39);
			panel.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("微软雅黑", Font.BOLD, 23));
			textField_1.setBounds(322, 363, 146, 33);
			panel.add(textField_1);
			textField_1.setColumns(10);
			
			JLabel label = new JLabel("规    格：");
			label.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label.setBounds(364, 91, 115, 34);
			panel.add(label);
			
			
			
			JLabel label_1 = new JLabel("数     量：");
			label_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label_1.setBounds(167, 355, 118, 38);
			panel.add(label_1);
			
			JLabel lblNewLabel = new JLabel("售   价：");
			lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 25));
			lblNewLabel.setBounds(364, 163, 128, 36);
			panel.add(lblNewLabel);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("微软雅黑", Font.BOLD, 22));
			textField_3.setBounds(490, 163, 146, 36);
			panel.add(textField_3);
			textField_3.setColumns(10);
			
			 comboBox = new JComboBox();
			 comboBox.setFont(new Font("微软雅黑", Font.BOLD, 25));
			comboBox.addItem(gui.comboBox_1.getSelectedItem());
			comboBox.setBounds(165, 298, 146, 38);
			panel.add(comboBox);
			
			 comboBox_1 = new JComboBox();
			 comboBox_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
			try {
				List<C_kucun_biandong> list=type.selectAll();
				//循环集合，将值依次赋予给下拉框
				
				for (C_kucun_biandong c : list) {
					comboBox_1.addItem(c);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			comboBox_1.setBounds(490, 298, 146, 38);
			panel.add(comboBox_1);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("微软雅黑", Font.BOLD, 22));
			textField_4.setBounds(167, 229, 144, 37);
			panel.add(textField_4);
			textField_4.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setFont(new Font("微软雅黑", Font.BOLD, 22));
			textField_5.setBounds(490, 229, 146, 37);
			panel.add(textField_5);
			textField_5.setColumns(10);
			
			JButton button_1 = new JButton("取消");
			button_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button_1.setBounds(107, 420, 103, 33);
			panel.add(button_1);
			
			JLabel lblNewLabel_1 = new JLabel("供 应 商：");
			lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
			lblNewLabel_1.setBounds(31, 298, 115, 33);
			panel.add(lblNewLabel_1);
			
			JLabel label_2 = new JLabel("类   型：");
			label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label_2.setBounds(364, 297, 128, 34);
			panel.add(label_2);
			
			
			
			JButton button = new JButton("确  定");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String gname=textField_2.getText();
					if(textField_8.getText().equals(null) || textField_1.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "输入不合法");
						return;
					}
					char ch = textField_8.getText().charAt(textField_8.getText().length() - 1);
					if(!(ch >='0'&&ch<='9')) {
						JOptionPane.showMessageDialog(null, "输入不合法");
						return;
					}
					double gbid=Double.parseDouble(textField_8.getText());
					if(textField_3.getText().equals(null) || textField_3.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "输入不合法");
						return;
					}
					char ch1 = textField_3.getText().charAt(textField_3.getText().length() - 1);
					if(!(ch1 >='0'&&ch1<='9')) {
						JOptionPane.showMessageDialog(null, "输入不合法");
						return;
					}
					double gprice=Double.parseDouble(textField_3.getText());
					String gspec=textField.getText();
					int stshu=Integer.parseInt(textField_1.getText());
					//获取下拉框选中的值
					Caigou_gongyingshang g=(Caigou_gongyingshang) comboBox.getSelectedItem();
					int sid=g.getSid();
					C_kucun_biandong g1=(C_kucun_biandong) comboBox_1.getSelectedItem();
					int cid=g1.getCid();
					String gopera=(String) gui.comboBox_2.getSelectedItem();
					Date pdate=new Date();
					//商品编号
					Cgoods_jiujia c=new Cgoods_jiujia(0,gname, gbid, gprice, gspec,cid,sid, stshu);
					try {
						ghao.insertGoods(gopera, pdate, c);
						List<Cgoods_jiujia> gd=ghao.selectgid(c);
						int gid=gd.get(0).getGid();
						//库存表
						ghao.insertstock(new C_jintuihuo_danju(gid, 0, 1000, 100, gopera, new Date()));
						c.setGid(gid);
					}catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					gui.listcai.add(c);
					try {
						gui.updateTablecai();
						Caigou_xinzen_ui.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			
			button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			button.setBounds(415, 420, 103, 33);
			panel.add(button);
			
			JLabel label_3 = new JLabel("最低库存：");
			label_3.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label_3.setBounds(31, 232, 135, 33);
			panel.add(label_3);
			
			JLabel label_3_1 = new JLabel("最大库存：");
			label_3_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
			label_3_1.setBounds(364, 232, 135, 33);
			panel.add(label_3_1);
			setVisible(true);
		}
	}
}
