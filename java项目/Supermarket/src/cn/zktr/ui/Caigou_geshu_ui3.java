package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.entity.Cgoods_jiujia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Caigou_geshu_ui3 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	private JTable table;
	
	
	//创建一个父窗口对象
	Caiguo_cai_ui gui;
	/**
	 *修改数量界面
	 */
//	public static void main(String[] args) {
//		try {
//			Caigou_gaishu_ui dialog = new Caigou_gaishu_ui();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Caigou_geshu_ui3(JFrameInterface jframe) {
		//将传回的父窗口进行接收
				this.gui=(Caiguo_cai_ui) jframe.getJFrame();
				setTitle("商品信息");
				setIconImage(Toolkit.getDefaultToolkit().getImage(Caigou_geshu_ui2.class.getResource("/img/logo544.png")));
//				try {
//					UIManager.setLookAndFeel(new SubstanceLookAndFeel());
//				} catch (UnsupportedLookAndFeelException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
				//子页面关闭才能动主页面
								setModal(true);
								//不能改变大小
								setResizable(false);

				


				setBounds(100, 100, 643, 426);
				//居中
				setLocationRelativeTo(null);
				getContentPane().setLayout(new BorderLayout());
				contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
				getContentPane().add(contentPanel, BorderLayout.CENTER);
				contentPanel.setLayout(null);
				
				JPanel panel = new JPanel();
				panel.setBounds(0, 0, 671, 397);
				contentPanel.add(panel);
				panel.setLayout(null);
				
				JLabel label = new JLabel("商品信息");
				label.setFont(new Font("微软雅黑", Font.BOLD, 23));
				label.setBounds(266, 0, 104, 36);
				panel.add(label);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(10, 40, 616, 347);
				panel.add(panel_1);
				panel_1.setLayout(null);
				
				JLabel label_1 = new JLabel("商品编号：");
				label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_1.setBounds(53, 21, 110, 27);
				panel_1.add(label_1);
				
				JLabel label_2 = new JLabel("商品名称：");
				label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_2.setBounds(331, 21, 103, 27);
				panel_1.add(label_2);
				
				JLabel label_3 = new JLabel(gui.cj.getGid()+"");
				label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_3.setForeground(new Color(0, 255, 0));
				label_3.setBounds(190, 21, 131, 26);
				panel_1.add(label_3);
				
				JLabel label_5 = new JLabel("基本单位：");
				label_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_5.setBounds(331, 159, 103, 27);
				panel_1.add(label_5);
				
				JLabel label_4 = new JLabel(gui.cj.getGspec());
				label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_4.setBounds(439, 159, 118, 27);
				panel_1.add(label_4);
				
				JLabel label_6 = new JLabel("当前库存：");
				label_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_6.setBounds(53, 159, 110, 27);
				panel_1.add(label_6);
				
				JLabel label_9 = new JLabel(gui.cj.getGname());
				label_9.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_9.setBounds(442, 21, 124, 26);
				panel_1.add(label_9);
				
				JLabel label_12 = new JLabel(gui.cj.getXpshu()+"");
				label_12.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_12.setBounds(190, 159, 54, 27);
				panel_1.add(label_12);
				
				JPanel panel_2 = new JPanel();
				panel_2.setBounds(0, 223, 616, 60);
				panel_1.add(panel_2);
				panel_2.setLayout(null);
				
				JLabel label_15 = new JLabel("数   量：");
				label_15.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_15.setBounds(201, 18, 80, 31);
				panel_2.add(label_15);
				
				textField_1 = new JTextField(gui.cj.getStshu()+"");
				textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_1.setBounds(309, 17, 101, 31);
				panel_2.add(textField_1);
				textField_1.setColumns(10);
				
				JButton button_1 = new JButton("取消");
				button_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						Caigou_geshu_ui3.this.dispose();
					}
				});
				button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				button_1.setBounds(51, 305, 197, 32);
				panel_1.add(button_1);
				
				JLabel label_7 = new JLabel("进价：");
				label_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
				label_7.setBounds(53, 82, 110, 31);
				panel_1.add(label_7);
				
				JLabel label_10 = new JLabel(gui.cj.getGbid()+"");
				label_10.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label_10.setBounds(186, 82, 118, 31);
				panel_1.add(label_10);
				
				JLabel lblNewLabel = new JLabel("售  价：");
				lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel.setBounds(331, 82, 103, 26);
				panel_1.add(lblNewLabel);
				
				JLabel lblNewLabel_1 = new JLabel(gui.cj.getGprice()+"");
				lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				lblNewLabel_1.setBounds(445, 82, 100, 31);
				panel_1.add(lblNewLabel_1);
				
				JButton button = new JButton("确定");
				button.setBounds(348, 305, 197, 32);
				panel_1.add(button);
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						int gid=Integer.parseInt(label_3.getText());
						String gname=label_9.getText();
						String gspec=label_4.getText();
						double gbid=Double.parseDouble(label_10.getText());
						double gprice=Double.parseDouble(lblNewLabel_1.getText());
						if(textField_1.getText().equals(null) || textField_1.getText().equals("")) {
							JOptionPane.showMessageDialog(null, "输入不合法");
							return;
						}
						char ch = textField_1.getText().charAt(textField_1.getText().length() - 1);
						if(!(ch >='0'&&ch<='9')) {
							JOptionPane.showMessageDialog(null, "输入不合法");
							return;
						}
						
						int	stshu=Integer.parseInt(textField_1.getText());
						//获得当前选中行的下标
						int row=gui.table.getSelectedRow();
						gui.listcai.set(row, new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu));
						
//						Cgoods_jiujia g=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//						System.out.println(g);
//						gui.list2.add(g);
//						System.out.println(gui.list2.add(g));
								//新增成功，调用父窗口的刷新方法，并关闭当前窗口
								try {
									gui.updateTablecai();
									Caigou_geshu_ui3.this.dispose();
								} catch (Exception e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
					}
				});
				button.setFont(new Font("微软雅黑", Font.BOLD, 20));
				
				JScrollPane scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 396, 641, 56);
				contentPanel.add(scrollPane);
				
				table = new JTable();
				scrollPane.setViewportView(table);
				setVisible(true);
	}
}
