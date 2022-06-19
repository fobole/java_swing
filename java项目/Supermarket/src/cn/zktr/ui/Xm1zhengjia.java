package cn.zktr.ui;

import java.awt.BorderLayout;
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
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Xm1zhengjia extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	Xm1 xm;
	/**
	 * Launch the application.
	 */
	//创建一个父窗口对象
	Xm1dao dao=new Xm1dao();

	/**
	 * Create the dialog.
	 */
	public Xm1zhengjia(JFrameInterface jframe) {
		this.xm=(Xm1) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("增加供货商");
		setBounds(100, 100, 564, 577);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 558, 438);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("供货商名称：");
				lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				lblNewLabel.setBounds(46, 114, 135, 21);
				panel.add(lblNewLabel);
			}
			{
				textField = new JTextField();
				textField.setBackground(new Color(0,0,0,0));
				textField.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField.setBounds(191, 107, 286, 34);
				panel.add(textField);
				textField.setColumns(10);
			}
			{
				JLabel label = new JLabel("联系人：");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(46, 189, 90, 34);
				panel.add(label);
			}
			{
				textField_1 = new JTextField();
				textField_1.setBackground(new Color(0,0,0,0));
				textField_1.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_1.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_1.setBounds(191, 189, 286, 34);
				panel.add(textField_1);
				textField_1.setColumns(10);
			}
			{
				JLabel label = new JLabel("联系电话：");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(46, 268, 108, 34);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setBackground(new Color(0,0,0,0));
				textField_2.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_2.setBounds(191, 268, 286, 34);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JLabel label = new JLabel("联系地址：");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(46, 344, 105, 34);
				panel.add(label);
			}
			{
				textField_3 = new JTextField();
				textField_3.setBackground(new Color(0,0,0,0));
				textField_3.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

				textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_3.setBounds(191, 344, 286, 34);
				panel.add(textField_3);
				textField_3.setColumns(10);
			}
			{
				JLabel label = new JLabel("新增供应商");
				label.setFont(new Font("微软雅黑", Font.BOLD, 30));
				label.setBounds(196, 10, 236, 53);
				panel.add(label);
			}
		}
		{
			JButton btnf = new JButton("保存");
			btnf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String sbusiness=textField.getText();
					
					String sname=textField_1.getText();
					String sphone=textField_2.getText();
					String saddress=textField_3.getText();
					
					//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					//Date vdate = null;
//				try {
//					//vdate =simpleDateFormat.parse(textField_9.getText());
//				} catch (ParseException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
					
					//String vopera=textField_10.getText();
					Xm1st good=new Xm1st(sbusiness,sname,sphone,saddress);
					try {
						int isok=dao.intste1(good);
					if(isok>0){
							//新增成功，调用父窗口的刷新方法，并关闭当前窗口
							xm.updateTable();
						}else{
							
							JOptionPane.showMessageDialog(null, "商品新增失败");
						}
						Xm1zhengjia.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
				
					setVisible(false);
				}
	}
			});
			btnf.setBounds(48, 475, 142, 27);
			contentPanel.add(btnf);
		}
		{
			JButton btnf_1 = new JButton("取消");
			btnf_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnf_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnf_1.setBounds(337, 475, 135, 27);
			contentPanel.add(btnf_1);
		}
		
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		
		setVisible(true);
		
	}
}
