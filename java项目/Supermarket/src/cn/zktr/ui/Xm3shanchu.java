package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.zktr.dao.Xm3zengjiadao;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Xm3shanchu extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	
	Xm3 tui;
	protected Xm3 xm;
	
	/**
	 * Create the dialog.
	 */
	public Xm3shanchu(JFrameInterface jframe) {
		this.tui=(Xm3) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 476, 315);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 470, 286);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("是否删除该会员信息\r\n");
			lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			lblNewLabel.setIcon(new ImageIcon(Xm3shanchu.class.getResource("/img/VULZM8O8%}3$HWC%K1}$NLL.png")));
			lblNewLabel.setBounds(95, 43, 329, 45);
			panel.add(lblNewLabel);
			
			JButton btny = new JButton("是(Y)");
			btny.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btny.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						xm.list1.remove(xm.row);
						try {
							xm.updateTable();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						Xm3shanchu.this.dispose();
					

									
		}});
			btny.setBounds(129, 159, 90, 27);
			panel.add(btny);
			
			JButton btnn = new JButton("否(N)");
			btnn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnn.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btnn.setBounds(265, 159, 90, 27);
			panel.add(btnn);
		}
}
		//子页面关闭才能动主页面
		 
		//不能改变大小
	
	}


