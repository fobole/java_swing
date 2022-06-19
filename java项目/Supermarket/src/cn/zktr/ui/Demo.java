package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class Demo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JPasswordField passwordText;
	JCheckBox checkBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Demo dialog = new Demo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Demo() {
		//密码框
		passwordText = new JPasswordField();
		passwordText.setBounds(100, 82, 200, 24);
		getContentPane().add(passwordText);

		//单选
		checkBox = new JCheckBox("显示密码");
		checkBox.addItemListener(new ItemListener() {
		public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED){//被选中
		passwordText.setEchoChar((char)0);
		}else{
		passwordText.setEchoChar('*');
		}
		}
		});
		checkBox.setBounds(300, 81, 135, 27);
		getContentPane().add(checkBox);

		//
		setBounds(600, 300, 450, 450);
		setVisible(true);

		
	}

}
