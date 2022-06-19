package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.biz.CaigouBiz;
import cn.zktr.dao.Caigou_shenheztai_dao;
import cn.zktr.entity.C_danju_xiangqin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Caigou_shenhe_ui2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	Caigou_tui_ui sdan;

	
	Caigou_shenheztai_dao d=new Caigou_shenheztai_dao();
	
	CaigouBiz cbiz=new CaigouBiz();
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Caigou_shenhe_ui dialog = new Caigou_shenhe_ui();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public Caigou_shenhe_ui2(JFrameInterface j) {
		this.sdan=(Caigou_tui_ui) j.getJFrame();
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);
		setBounds(100, 100, 603, 439);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 597, 410);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("单据审核");
		label.setFont(new Font("微软雅黑", Font.BOLD, 35));
		label.setBounds(208, 70, 169, 52);
		panel.add(label);
		
		JLabel lblCj = new JLabel();
		lblCj.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		lblCj.setForeground(Color.RED);
		lblCj.setBounds(154, 56, 129, 22);
		panel.add(lblCj);
		
		JButton button = new JButton("审核通过");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sdan.table_1_1.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=sdan.table_1_1.getSelectedRow();
					String podd=(String) sdan.table_1_1.getValueAt(row, 0);
					try {
						d.updatezt(podd);
						cbiz.insertzttui(sdan.list2);
						sdan.list2.clear();
						sdan.updateTable();
						sdan.updateTable2();
						Caigou_shenhe_ui2.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setBounds(82, 200, 142, 52);
		panel.add(button);
		
		JButton button_1 = new JButton("取   消");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_1.setBounds(338, 200, 142, 52);
		panel.add(button_1);
		setVisible(true);
	}
}
