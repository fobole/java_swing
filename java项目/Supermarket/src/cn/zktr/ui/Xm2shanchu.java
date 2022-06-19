package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Xm2shanchu extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the dialog.
	 */
	public Xm2shanchu() {
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
			
			JLabel lblNewLabel = new JLabel("是否删除该供货商信息\r\n");
			lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			lblNewLabel.setIcon(new ImageIcon(Xm1shanchu.class.getResource("/img/VULZM8O8%}3$HWC%K1}$NLL.png")));
			lblNewLabel.setBounds(95, 43, 329, 45);
			panel.add(lblNewLabel);
			
			JButton btny = new JButton("是(Y)");
			btny.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			btny.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
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
		
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setVisible(true);
	}

}
