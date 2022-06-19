package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import cn.zktr.dao.Sgoods_dao;

import cn.zktr.entity.Sgoods_jiujia;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sxmbg1fb2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_10;
	Sxmbg1fb1 gui;
	Sxmbg1fb1 a;
	//创建dao层对象
//		TypeDao tdao=new TypeDao();
		//创建商品dao层对象
		Sgoods_dao gdao=new Sgoods_dao();
		//创建一个父窗口对象
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Sxmbg1fb2 dialog = new Sxmbg1fb2();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Sxmbg1fb2(JFrameInterface jframe) {
	this.gui=(Sxmbg1fb1) jframe.getJFrame();
		setTitle("商品信息(商品销售)");
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
		label_2.setBounds(40, 41, 101, 18);
		panel.add(label_2);
		
		JLabel label_9 = new JLabel(gui.cj.getGname());
		label_9.setBounds(126, 44, 74, 17);
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel.add(label_9);
		
		JLabel label_3 = new JLabel("规格型号：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_3.setBounds(40, 86, 101, 21);
		panel.add(label_3);
		
		JLabel label_7 = new JLabel("当前库存：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_7.setBounds(40, 132, 101, 21);
		panel.add(label_7);
		
		JLabel label_1 = new JLabel("进     价：");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_1.setBounds(338, 37, 90, 23);
		panel.add(label_1);
		
		JLabel label_4 = new JLabel("售     价：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_4.setBounds(338, 89, 84, 15);
		panel.add(label_4);
		
		JLabel label_13 = new JLabel("数     量：");
		label_13.setBounds(337, 136, 91, 18);
		panel.add(label_13);
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField_10 = new JTextField(gui.cj.getStshu());
		textField_10.setBounds(424, 132, 66, 30);
		panel.add(textField_10);
		textField_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField_10.setColumns(10);
		
		JLabel label_5 = new JLabel(gui.cj.getStshu()+"");
		label_5.setBounds(124, 137, 54, 15);
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel.add(label_5);
		
		JLabel label_10 = new JLabel(gui.cj.getGbid()+"");
		label_10.setBounds(424, 41, 54, 15);
		label_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel.add(label_10);
		
		JLabel label_11 = new JLabel(gui.cj.getGspec());
		label_11.setBounds(126, 88, 54, 21);
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel.add(label_11);
		
		JLabel lblNewLabel = new JLabel(gui.cj.getGprice()+"");
		lblNewLabel.setBounds(424, 91, 54, 15);
		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel.add(lblNewLabel);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				int gid=Integer.parseInt(label_3.getText());
				String gname=label_9.getText();
				String gspec=label_11.getText();
				double gbid=Double.parseDouble(label_10.getText());
				double gprice=Double.parseDouble(lblNewLabel.getText());
				if(textField_10.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "数量未填");
					return;
				}
				int	stshu=Integer.parseInt(textField_10.getText());
				int gid=gui.cj.getGid();
				
				
				Sgoods_jiujia g=new Sgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//				 Sgoods s=a.g;
//				 g.setStshu(stshu);
				for (Sgoods_jiujia s : gui.list2) {
					if(s.getGid()==gid) {
						s.setStshu(s.getStshu()+stshu);
						try {
							gui.updateTable2();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Sxmbg1fb2.this.dispose();
						return;
					}
				}
				
				gui.list2.add(g);
				
//				System.out.println(gui.list2.add(g));
						//新增成功，调用父窗口的刷新方法，并关闭当前窗口
						try {
//							if(stshu<Integer.parseInt(textField_10.getText())) {
//								JOptionPane.showInternalMessageDialog(null, "库存不足");
//							}else {
							gui.updateTable2();
							Sxmbg1fb2.this.dispose();
//							}
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
