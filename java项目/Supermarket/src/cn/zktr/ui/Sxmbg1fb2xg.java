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

import cn.zktr.dao.Sgoods_dao;
import cn.zktr.entity.Sgoods_jiujia;

public class Sxmbg1fb2xg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_10;
	Sxmbg1fb1 gui;
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
	public Sxmbg1fb2xg(JFrameInterface jframe) {
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
		label_9.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_9.setBounds(126, 44, 74, 17);
		panel.add(label_9);
		
		JLabel label_3 = new JLabel("规格型号：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_3.setBounds(40, 87, 101, 21);
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
		label_4.setBounds(338, 90, 84, 15);
		panel.add(label_4);
		
		JLabel label_13 = new JLabel("数     量：");
		label_13.setBounds(337, 136, 91, 18);
		panel.add(label_13);
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		textField_10 = new JTextField(gui.cj.getStshu());
		textField_10.setBounds(412, 132, 66, 30);
		panel.add(textField_10);
		textField_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField_10.setColumns(10);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(124, 137, 54, 15);
		panel.add(label_5);
		
		JLabel label_10 = new JLabel(gui.cj.getGbid()+"");
		label_10.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_10.setBounds(424, 45, 54, 15);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel(gui.cj.getGspec());
		label_11.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_11.setBounds(126, 87, 54, 21);
		panel.add(label_11);
		
		JLabel label_6 = new JLabel(gui.cj.getGprice()+"");
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_6.setBounds(424, 92, 54, 15);
		panel.add(label_6);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				int gid=Integer.parseInt(label_3.getText());
				String gname=label_9.getText();
				String gspec=label_11.getText();
				double gbid=Double.parseDouble(label_10.getText());
				double gprice=Double.parseDouble(label_6.getText());
				if(textField_10.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "数量未填");
					return;
				}
				int	stshu=Integer.parseInt(textField_10.getText());
			
				
//				//获得当前选中行的下标
				int row=gui.table.getSelectedRow();
				gui.list2.set(row, new Sgoods_jiujia(0, gname, gbid, gprice, gspec, stshu));
				
//				Cgoods_jiujia g=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//				System.out.println(g);
//				gui.list2.add(g);
//				System.out.println(gui.list2.add(g));
						//新增成功，调用父窗口的刷新方法，并关闭当前窗口
						try {
							gui.updateTable2();
							Sxmbg1fb2xg.this.dispose();
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
