package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Zjm_ui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Zjm_ui frame = new Zjm_ui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Zjm_ui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1600, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 1574, 168);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("彳 亍 行 超 市 管 理 系 统");
		label.setBounds(316, 35, 932, 89);
		label.setFont(new Font("华文行楷", Font.PLAIN, 80));
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 167, 295, 590);
		panel.add(panel_2);
		
		JButton button = new JButton("采购管理");
		button.setBounds(33, 50, 232, 70);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		panel_2.setLayout(null);
		button.setHorizontalTextPosition(SwingConstants.RIGHT);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		panel_2.add(button);
		
		JButton button_1 = new JButton("销售管理");
		button_1.setBounds(33, 195, 232, 70);
		button_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		panel_2.add(button_1);
		
		JButton btnNewButton = new JButton("仓库管理");
		btnNewButton.setBounds(33, 347, 232, 80);
		btnNewButton.setHorizontalTextPosition(SwingConstants.RIGHT);
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		panel_2.add(btnNewButton);
		
		JButton button_2 = new JButton("系统管理");
		button_2.setBounds(33, 479, 232, 85);
		button_2.setHorizontalTextPosition(SwingConstants.RIGHT);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		panel_2.add(button_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(305, 167, 1275, 590);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 756, 1574, 95);
		panel.add(panel_4);
	}
}
