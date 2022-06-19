package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class KXjm1a2kcpd extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
////			 设置本属性将改变窗口边框样式定义
//			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//			  UIManager.put("RootPane.setupButtonVisible", false);
//			  // 启用皮肤
//			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			KXjm1a2kcpd dialog = new KXjm1a2kcpd();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public KXjm1a2kcpd() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXjm1a2kcpd.class.getResource("/Img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);

		setTitle("盘点单查询");
		setBounds(100, 100, 453, 358);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("查询日期：");
			lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			lblNewLabel.setBounds(51, 23, 117, 24);
			contentPanel.add(lblNewLabel);
		}
		
		JLabel lblNewLabel_1 = new JLabel("至");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(84, 78, 23, 26);
		contentPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("仓库名称：");
		lblNewLabel_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(51, 136, 109, 29);
		contentPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("操作员：");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(70, 186, 82, 29);
		contentPanel.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"20201-05-01"}));
		comboBox.setBounds(205, 18, 173, 34);
		contentPanel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"2021-06-08"}));
		comboBox_1.setBounds(205, 73, 173, 37);
		contentPanel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"主仓库", "酒库", "饮料库"}));
		comboBox_2.setBounds(205, 184, 173, 32);
		contentPanel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"admin"}));
		comboBox_3.setBounds(205, 138, 173, 27);
		contentPanel.add(comboBox_3);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(43, 271, 93, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("退出");
		btnNewButton_1.setFont(new Font("宋体", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(261, 271, 93, 23);
		contentPanel.add(btnNewButton_1);
		setVisible(true);
	}
}
