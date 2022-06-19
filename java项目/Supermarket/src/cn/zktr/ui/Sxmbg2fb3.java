package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import cn.zktr.entity.Sgoods_jiujia;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Sxmbg2fb3 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_10;
	Sxmbg2fb1 gui;
	
	JLabel label_5;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Sxmbg2fb3 dialog = new Sxmbg2fb3();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Sxmbg2fb3(JFrameInterface jframe) {
		this.gui=(Sxmbg2fb1) jframe.getJFrame();
		setTitle("商品信息(商品退货)");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg1fb2.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 609, 379);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 554, 199);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("商品信息");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label.setBounds(10, 0, 89, 25);
		panel.add(label);
		
		JLabel label_2 = new JLabel("商品名称：");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_2.setBounds(60, 52, 101, 18);
		panel.add(label_2);
		
		JLabel label_9 = new JLabel(gui.cj.getGname());
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_9.setBounds(171, 56, 74, 17);
		panel.add(label_9);
		
		JLabel label_3 = new JLabel("规格型号：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_3.setBounds(60, 101, 101, 21);
		panel.add(label_3);
		
		JLabel label_7 = new JLabel("销售总数：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_7.setBounds(60, 149, 101, 21);
		panel.add(label_7);
		
		JLabel label_1 = new JLabel("进     价：");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_1.setBounds(338, 50, 90, 23);
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("售     价：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_4.setBounds(338, 104, 84, 15);
		panel.add(label_4);
		
		JLabel label_13 = new JLabel("数     量：");
		label_13.setBounds(338, 150, 91, 18);
		panel.add(label_13);
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField_10 = new JTextField(gui.cj.getSdshu());
		textField_10.setBounds(427, 149, 66, 30);
		panel.add(textField_10);
		textField_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField_10.setColumns(10);
		
		 label_5 = new JLabel(gui.cj.getStshu()+"");
		 label_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_5.setBounds(171, 154, 54, 15);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel(gui.cj.getSdshu()+"");
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_6.setBounds(424, 106, 54, 15);
		panel.add(label_6);
		
		JLabel label_10 = new JLabel(gui.cj.getGbid()+"");
		label_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_10.setBounds(427, 56, 54, 15);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel(gui.cj.getGspec());
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_11.setBounds(171, 103, 54, 21);
		panel.add(label_11);
		
		JLabel lblNewLabel = new JLabel(gui.cj.getGprice()+"");
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblNewLabel.setBounds(434, 106, 69, 15);
		panel.add(lblNewLabel);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
////				int gid=Integer.parseInt(label_3.getText());
//				String gname=label_9.getText();
//				String gspec=label_11.getText();
//				double gbid=Double.parseDouble(label_10.getText());
//				double gprice=Double.parseDouble(lblNewLabel.getText());
				if(textField_10.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "数量未填");
					return;
				}
				
				int	stshu=Integer.parseInt(textField_10.getText());
				gui.cj.setStshu(stshu);
				for (Sgoods_jiujia s : gui.list2) {
					if(s.getGid()==gui.cj.getGid()) {
						s.setStshu(s.getStshu()+stshu);
						try {
							gui.updateTable2();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Sxmbg2fb3.this.dispose();
						return;
					}
				}
				
				gui.list2.add(gui.cj);
//				System.out.println(gui.list2.add(g));
						//新增成功，调用父窗口的刷新方法，并关闭当前窗口
						try {
							gui.updateTable2();
							Sxmbg2fb3.this.dispose();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 18));
		button.setBounds(131, 259, 106, 33);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("退出");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 18));
		button_1.setBounds(313, 260, 106, 31);
		contentPanel.add(button_1);
		
		setModal(true);
		setVisible(true);
		
		
	}
}
