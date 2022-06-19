package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kpdcxjm extends JDialog {

	private final JPanel contentPanel = new JPanel(); 
	private JTextField textField_7;
	
	
	//父窗口
	KXmjm1aKcpd pan;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Kpdcxjm dialog = new Kpdcxjm();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Kpdcxjm(JFrameInterface jframe) {
		this.pan=(KXmjm1aKcpd) jframe.getJFrame();
		setBounds(100, 100, 523, 360);
		//不能改变大小
				setResizable(false);

		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("商品编号：");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 39, 108, 29);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("商品名称：");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setBounds(275, 39, 109, 29);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("库存数量：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 119, 108, 29);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("基本单位：");
		lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 194, 108, 29);
		contentPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("盘点数量：");
		lblNewLabel_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_5.setBounds(275, 194, 109, 29);
		contentPanel.add(lblNewLabel_5);
		
		
		
	
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.setBounds(291, 277, 93, 23);
		contentPanel.add(btnNewButton_1);
		
		textField_7 = new JTextField(1+"");
		textField_7.setFont(new Font("微软雅黑", Font.BOLD, 12));
		textField_7.setBounds(392, 192, 93, 29);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel(pan.cj.getGid()+"");
		lblNewLabel_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_6.setBounds(129, 46, 54, 15);
		contentPanel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel(pan.cj.getStshu()+"");
		lblNewLabel_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_7.setBounds(128, 126, 54, 15);
		contentPanel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel(pan.cj.getGspec()+"");
		lblNewLabel_8.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_8.setBounds(128, 198, 124, 20);
		contentPanel.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//输入字母弹出不合法
				if(textField_7.getText().equals(null) || textField_7.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "输入不合法");
					return;
				}
				char ch = textField_7.getText().charAt(textField_7.getText().length() - 1);
				if(!(ch >='0'&&ch<='9')) {
					JOptionPane.showMessageDialog(null, "输入不合法");
					return;
				}
				int shu=Integer.parseInt(textField_7.getText());
				pan.cj.setStshu(shu);
				pan.list2.add(pan.cj);
				try {
					pan.updateTable2();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Kpdcxjm.this.dispose();
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(75, 277, 93, 23);
		contentPanel.add(btnNewButton);
		
		
		JLabel lblNewLabel_9 = new JLabel(pan.cj.getGname()+"");
		lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_9.setBounds(383, 39, 124, 24);
		contentPanel.add(lblNewLabel_9);
		setModal(true);
		setVisible(true);
		
		
		
	}
}
