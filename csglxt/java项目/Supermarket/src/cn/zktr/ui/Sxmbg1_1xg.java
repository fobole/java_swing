package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cn.zktr.entity.Sgoods_jiujia;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sxmbg1_1xg extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
    Sxmbg1 gui;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Sxmbg1_1xg dialog = new Sxmbg1_1xg();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

    
	/**
	 * Create the dialog.
	 */
	public Sxmbg1_1xg(JFrameInterface jframe) {
		this.gui=(Sxmbg1) jframe.getJFrame();
		setBounds(100, 100, 466, 430);
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel label = new JLabel("商品名称：");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label.setBounds(61, 34, 92, 28);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel(gui.cj.getGname());
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_1.setBounds(143, 34, 74, 28);
		contentPanel.add(label_1);
		
		JLabel label_2 = new JLabel("售      价：");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_2.setBounds(61, 80, 92, 28);
		contentPanel.add(label_2);
		
		JLabel label_3 = new JLabel(gui.cj.getGprice()+"");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_3.setBounds(143, 80, 92, 28);
		contentPanel.add(label_3);
		
		JLabel label_4 = new JLabel("单      位：");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_4.setBounds(61, 130, 92, 28);
		contentPanel.add(label_4);
		
		JLabel label_5 = new JLabel(gui.cj.getGspec());
		label_5.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_5.setBounds(143, 130, 74, 28);
		contentPanel.add(label_5);
		
		JLabel label_6 = new JLabel("数      量：");
		label_6.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_6.setBounds(61, 179, 92, 28);
		contentPanel.add(label_6);
		
		textField = new JTextField(gui.cj.getStshu());
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		textField.setBounds(143, 184, 92, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		JLabel label_7 = new JLabel("总  金 额：");
		label_7.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		label_7.setBounds(61, 233, 92, 15);
		contentPanel.add(label_7);
		
		JLabel label_8 = new JLabel(gui.cj.getZsj()+"");
		label_8.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		label_8.setBounds(145, 234, 54, 15);
		contentPanel.add(label_8);
		
		JButton button = new JButton("确定");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gname=label_1.getText();
				double gprice=Double.parseDouble(label_3.getText());
				String gspec=label_5.getText();
				double zsj=Double.parseDouble(label_8.getText());
				if(textField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "数量未填");
					return;
				}
				int	stshu=Integer.parseInt(textField.getText());
			
				
//				//获得当前选中行的下标
				int row=gui.table.getSelectedRow();
				gui.lxiao.set(row, new Sgoods_jiujia(gname, gprice, gspec, stshu,zsj));
				
//				Cgoods_jiujia g=new Cgoods_jiujia(gid, gname, gbid, gprice, gspec, stshu);
//				System.out.println(g);
//				gui.list2.add(g);
//				System.out.println(gui.list2.add(g));
						//新增成功，调用父窗口的刷新方法，并关闭当前窗口
						try {
							gui.updateTable2();
							Sxmbg1_1xg.this.dispose();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 17));
		button.setBounds(94, 317, 105, 41);
		contentPanel.add(button);
		
		JButton button_1 = new JButton("取消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 17));
		button_1.setBounds(237, 317, 105, 41);
		contentPanel.add(button_1);
		
		

		setModal(true);
		setVisible(true);
		
	}
}
