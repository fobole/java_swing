package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.JFormattedTextField;
import java.awt.CardLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cn.zktr.dao.Xm2zengjiadao;
import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.dao.shangpindao;
import cn.zktr.entity.Xm1st;
import cn.zktr.entity.Xm2spcx;
import cn.zktr.entity.Xm2st;
import cn.zktr.entity.xm3hyzhengjia;

import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
public class Xm2xuigai extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_7;
	JPanel panel_2;
	Xm2 xm;
	/**
	 * Launch the application.
	 */
	Xm2zengjiadao dao1=new Xm2zengjiadao();
	shangpindao spdao=new shangpindao();
	private JTextField textField_3;
	
	//类别
	JComboBox comboBox;
	
	//供应商
	JComboBox comboBox_1;
	
	/**
	 * Create the dialog.
	 */
	public Xm2xuigai(JFrameInterface JDialog) {
		this.xm=(Xm2) JDialog.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("增加商品");
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 565, 632);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, -24, 539, 530);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("商品基本信息");
		label.setFont(new Font("微软雅黑", Font.BOLD, 30));
		label.setBounds(161, 36, 237, 40);
		panel.add(label);
		
		JLabel label_1 = new JLabel("所属类别:");
		label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_1.setBounds(54, 173, 108, 34);
		panel.add(label_1);
		
		JLabel label_3 = new JLabel("商品名称:");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_3.setBounds(54, 112, 116, 34);
		panel.add(label_3);
		
		textField_2 = new JTextField(xm.xm2sp.getGname());
		textField_2.setBackground(new Color(0,0,0,0));
		textField_2.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

		textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField_2.setBounds(162, 112, 310, 34);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label_5 = new JLabel("规格型号:");
		label_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_5.setBounds(54, 248, 98, 26);
		panel.add(label_5);
		
		textField_4 = new JTextField(xm.xm2sp.getGspec());
		textField_4.setBackground(new Color(0,0,0,0));
		textField_4.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_4.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

		textField_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		textField_4.setBounds(162, 244, 310, 34);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("预设售价:");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel.setBounds(54, 393, 93, 33);
		panel.add(lblNewLabel);
		
		textField_7 = new JTextField(xm.xm2sp.getGprice()+"");
		textField_7.setBackground(new Color(0,0,0,0));
		textField_7.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_7.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

		textField_7.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_7.setBounds(162, 393, 310, 33);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel label_12 = new JLabel("供 应 商:");
		label_12.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_12.setBounds(54, 466, 93, 34);
		panel.add(label_12);
		
		JLabel label_4 = new JLabel("进     价：");
		label_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_4.setBounds(54, 326, 108, 33);
		panel.add(label_4);
		
		textField_3 = new JTextField(xm.xm2sp.getGbid()+"");
		textField_3.setBackground(new Color(0,0,0,0));
		textField_3.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));

		textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField_3.setBounds(162, 325, 310, 33);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		 comboBox = new JComboBox();
		 try {
			 List<Xm2spcx> list=spdao.selecttype();
				//循环集合，将值依次赋予给下拉框
				for (Xm2spcx c : list) {
//					System.out.println(c);
					comboBox.addItem(c);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		comboBox.setBounds(161, 173, 311, 36);
		panel.add(comboBox);
		
		 comboBox_1 = new JComboBox();
		 try {
			 List<Xm1st> list=spdao.selectgys();
				//循环集合，将值依次赋予给下拉框
				for (Xm1st c : list) {
//					System.out.println(c);
					comboBox_1.addItem(c);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		comboBox_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		comboBox_1.setBounds(161, 466, 311, 34);
		panel.add(comboBox_1);
		
		JButton btnf = new JButton("确定");
		btnf.setFont(new Font("微软雅黑", Font.BOLD, 22));
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
					//int  vid=Integer.parseInt(textField.getText());
					String gname=textField_2.getText();
					double gbid=Double.parseDouble(textField_3.getText());
					double gprice=Double.parseDouble(textField_7.getText());
					String gspec=textField_4.getText();//电话
					Xm2spcx c=(Xm2spcx) comboBox.getSelectedItem();
					int cid=c.getCid();
					Xm1st s=(Xm1st) comboBox_1.getSelectedItem();
					int sid=s.getSid();
//					int sztai=Integer.parseInt(textField_9.getText());
					String gopera=xm.label.getText();
					Date gdate=new Date();
					//long shijian = Date.parse(gdate);
					//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
					//Date vdate = null;
//				try {
//					//vdate =simpleDateFormat.parse(textField_9.getText());
//				} catch (ParseException e2) {
//					// TODO Auto-generated catch block
//					e2.printStackTrace();
//				}
					
					//String vopera=textField_10.getText();
					Xm2st good=new Xm2st( gname, gbid, gprice, gspec, cid, sid, 0, gopera,gdate);
					try {
						int isok=dao1.updatexg(good.getGid(),good);
						if(isok>0){
							//新增成功，调用父窗口的刷新方法，并关闭当前窗口
							xm.updateTable();
						}else{
							JOptionPane.showMessageDialog(null, "商品新增失败");
						}
						Xm2xuigai.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					}		
			
				setVisible(false);
			}}
		);
		btnf.setBounds(61, 538, 98, 33);
		contentPanel.add(btnf);
		
		JButton btnf_1 = new JButton("退出");
		btnf_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnf_1.setBounds(385, 539, 98, 33);
		contentPanel.add(btnf_1);
		//子页面关闭才能动主页面
				setModal(true);
				//不能改变大小
				setResizable(false);
				setVisible(true);
	}
}
