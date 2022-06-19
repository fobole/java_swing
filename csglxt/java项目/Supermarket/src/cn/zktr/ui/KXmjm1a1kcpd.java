package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.dao.KkcpdDao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class KXmjm1a1kcpd extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	KkcpdDao kk=new KkcpdDao();
	
	KXmjm1Kcpd pan;
	
//	public static void main(String[] args) {
//		try {
//			// 设置本属性将改变窗口边框样式定义
//			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//			  UIManager.put("RootPane.setupButtonVisible", false);
//			  // 启用皮肤
//			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			KXmjm1a1kcpd dialog = new KXmjm1a1kcpd();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public KXmjm1a1kcpd(JFrameInterface jframe) {
		this.pan=(KXmjm1Kcpd) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm1a1kcpd.class.getResource("/Img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);

		setTitle("系统提示");
		setBounds(100, 100, 360, 296);
		//居中
		setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(KXmjm1a1kcpd.class.getResource("/Img/QQ截图20210607103330.jpg")));
		lblNewLabel.setBounds(43, 41, 40, 59);
		contentPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("是否要删除该盘点单据");
		lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_1.setBounds(93, 49, 205, 38);
		contentPanel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("是(Y)");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=pan.table_4.getSelectedRow();
				if(row>-1) {
					String lodd=(String) pan.table_4.getValueAt(row, 0);
					try {
						kk.updateNumber(lodd);
						pan.updateTablelcy();
						pan.list2.clear();
						pan.updateTable2();
						KXmjm1a1kcpd.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}
				
			}
		
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton.setBounds(45, 145, 93, 23);
		contentPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("否(N)");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_1.setBounds(193, 145, 93, 23);
		contentPanel.add(btnNewButton_1);
		setVisible(true);
	}
}
