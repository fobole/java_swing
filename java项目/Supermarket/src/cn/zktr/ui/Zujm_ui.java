package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jvnet.substance.SubstanceLookAndFeel;
import org.jvnet.substance.button.StandardButtonShaper;
import org.jvnet.substance.fonts.DefaultMacFontPolicy;
import org.jvnet.substance.skin.AutumnSkin;
import org.jvnet.substance.skin.CremeSkin;
import org.jvnet.substance.skin.SubstanceSaharaLookAndFeel;
import org.jvnet.substance.theme.SubstanceCremeTheme;
import org.jvnet.substance.theme.SubstanceLightAquaTheme;
import org.jvnet.substance.theme.SubstanceOliveTheme;
import org.jvnet.substance.watermark.SubstanceBubblesWatermark;

import cn.zktr.entity.Cyonghui_denglu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Color;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Zujm_ui extends JFrame {

	private JPanel contentPane;
	CardLayout car=new CardLayout();
	Cyonghui_denglu y;
	JPanel panel_3;
	JLabel label_2;
	JLabel lblZhiwei;
	/**
	 * 主界面
	 */
	//采购
	JButton button;
	//销售
	JButton button_1;
	//仓库
	JButton btnNewButton;
	//系统
	JButton button_2;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try {
					// 设置本属性将改变窗口边框样式定义
					  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
					  UIManager.put("RootPane.setupButtonVisible", false);
					  // 启用皮肤
					  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessLookAndFeel");
					 
//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceOfficeSilver2007LookAndFeel");
					 
//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceSaharaLookAndFeel");
					 
//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceOfficeBlue2007LookAndFeel");
					 
//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessBlackSteelLookAndFeel");

//					UIManager.setLookAndFeel("org.jvnet.substance.skin.SubstanceBusinessLookAndFeel");
//					
//					  UIManager.setLookAndFeel(new SubstanceLookAndFeel());
					Zujm_ui frame = new Zujm_ui();
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//设置皮肤

//				 SubstanceSaharaLookAndFeel.setSkin(new CremeSkin());

//				SubstanceSaharaLookAndFeel.setSkin(new AutumnSkin());

//				SubstanceSaharaLookAndFeel.setCurrentButtonShaper(new StandardButtonShaper());

//				SubstanceSaharaLookAndFeel.setFontPolicy(new DefaultMacFontPolicy());

				//设置水印

//				SubstanceLookAndFeel.setCurrentWatermark(new SubstanceBubblesWatermark());

				//设置主题

//				SubstanceLookAndFeel.setCurrentTheme(new SubstanceCremeTheme());

//				SubstanceLookAndFeel.setCurrentTheme(new SubstanceLightAquaTheme());

//				 SubstanceLookAndFeel.setCurrentTheme(new SubstanceOliveTheme());

				// SubstanceLookAndFeel.setCurrentTheme(new SubstanceJadeForestTheme());

				//设置题头

//				SubstanceLookAndFeel.setCurrentTitlePainter(new Glass3DTitlePainter());
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Zujm_ui() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
//				int isdelete=JOptionPane.showConfirmDialog(null, "是否关闭","系统提示",JOptionPane.YES_NO_OPTION);
////				System.out.println(isdelete);
////				System.out.println(JOptionPane.YES_OPTION);
//				if(isdelete==JOptionPane.YES_OPTION) {
//					//关闭
//					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				}

			}
		});
		setFont(new Font("幼圆", Font.PLAIN, 10));
		setTitle("彳亍形超市管理系统");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Zujm_ui.class.getResource("/img/logo544.png")));
		//不能改变大小
		setResizable(false);
		
		setBounds(100, 100, 1488, 900);
		//居中
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		
		panel.setBounds(0, 0, 1482, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("赖崽的店超市管理系统");
		label.setFont(new Font("华文行楷", Font.PLAIN, 74));
		label.setBounds(320, 31, 835, 89);
		panel.add(label);
		
		JLabel label_1 = new JLabel("用户名：");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		label_1.setBounds(1140, 58, 126, 49);
		panel.add(label_1);
		
		 label_2 = new JLabel("小军");
		//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
		label_2.setBackground(new Color(0,0,0,0));
		label_2.setOpaque(false);
		//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
		label_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		label_2.setBounds(1276, 63, 154, 41);
		panel.add(label_2);
		ImageIcon icon =new ImageIcon(Zujm_ui.class.getResource("/img/fb5667c0b50192534b2f2076f33eadb4.gif"));
		
		
		
		 lblZhiwei = new JLabel("超级管理员");
//		 if(lblZhiwei.getText().endsWith("采购人员")) {
//			 button_1.setEnabled(false);
//		 }
		 lblZhiwei.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		 lblZhiwei.setBounds(1278, 109, 181, 41);
		 panel.add(lblZhiwei);
		
		JLabel label_13 = new JLabel("职   位：");
		label_13.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		label_13.setBounds(1140, 116, 146, 32);
		panel.add(label_13);
		
		JLabel label_3 = new JLabel("");
		label_3.setBounds(0, 0, 1492, 160);
		panel.add(label_3);
		label_3.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png")));
		icon.setImage(icon.getImage().getScaledInstance(220, 140, Image.SCALE_DEFAULT));
		ImageIcon icon111 = new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png"));
		//重置图片大小
		icon111.setImage(icon111.getImage().getScaledInstance(1600, 1000, Image.SCALE_DEFAULT));
		label_3.setIcon(icon111);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(45, 10, 229, 160);
		panel.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/fb5667c0b50192534b2f2076f33eadb4.gif")));
		ImageIcon icon0 = new ImageIcon(Zujm_ui.class.getResource("/img/fb5667c0b50192534b2f2076f33eadb4.gif"));
		//重置图片大小
		icon0.setImage(icon0.getImage().getScaledInstance(220, 160, Image.SCALE_DEFAULT));
		label_8.setIcon(icon0);
		label_8.setBounds(10, 0, 254, 160);
		panel_8.add(label_8);
		ImageIcon icontou =new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png"));
		icontou.setImage(icontou.getImage().getScaledInstance(1280, 1000, Image.SCALE_DEFAULT));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(175, 238, 238));
		panel_1.setBounds(0, 160, 1600, 601);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		button = new JButton("采购管理");
		button.setIcon(new ImageIcon("D:\\桌面\\新建文件夹\\be095fe7cdd1105d39a4bf63b946f8a1.jpeg"));
		
		ImageIcon icon_a1 =new ImageIcon("D:\\桌面\\新建文件夹\\be095fe7cdd1105d39a4bf63b946f8a1.jpeg");
		icon_a1.setImage(icon_a1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		button.setIcon(icon_a1);
		//设置文字在图片下方
//		button.setVerticalTextPosition(JButton.RIGHT);
		button.setHorizontalTextPosition(JButton.RIGHT);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得当前单击的事件源（按钮）
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("采购管理") && lblZhiwei.getText().equals("采购人员")||lblZhiwei.getText().equals("超级管理员")){
					//通知卡片布局显示第一个卡片
					car.show(panel_3, "name_590795233475200");
				}else {
					JOptionPane.showMessageDialog(null, "没有权限访问");
				}
				
			}
		});
		button.setBounds(23, 53, 268, 73);
		panel_1.add(button);
		
		button_1 = new JButton("销售管理");
		button_1.setIcon(new ImageIcon("D:\\桌面\\新建文件夹\\1c1f5564eea7c9d079dc9fcddbdf9cc5.jpeg"));
		ImageIcon icon_a2 =new ImageIcon("D:\\桌面\\新建文件夹\\1c1f5564eea7c9d079dc9fcddbdf9cc5.jpeg");
		icon_a2.setImage(icon_a2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		button_1.setIcon(icon_a2);
		//设置文字在图片下方
//		button.setVerticalTextPosition(JButton.RIGHT);
		button_1.setHorizontalTextPosition(JButton.RIGHT);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得当前单击的事件源（按钮）
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("销售管理") && lblZhiwei.getText().equals("销售人员")||lblZhiwei.getText().equals("超级管理员")){
					//通知卡片布局显示第一个卡片
					car.show(panel_3, "name_590802393036800");
				}else {
					JOptionPane.showMessageDialog(null, "没有权限访问");
				}	
			}
		});
		button_1.setBounds(23, 181, 268, 73);
		panel_1.add(button_1);
		
		btnNewButton = new JButton("仓库管理");
		btnNewButton.setIcon(new ImageIcon("D:\\桌面\\新建文件夹\\b53c0c97b102b45ad57582749f774b09.jpeg"));
		ImageIcon icon_a3 =new ImageIcon("D:\\桌面\\新建文件夹\\b53c0c97b102b45ad57582749f774b09.jpeg");
		icon_a3.setImage(icon_a3.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		btnNewButton.setIcon(icon_a3);
		//设置文字在图片下方
//		button.setVerticalTextPosition(JButton.RIGHT);
		btnNewButton.setHorizontalTextPosition(JButton.RIGHT);
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得当前单击的事件源（按钮）
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("仓库管理") && lblZhiwei.getText().equals("仓库人员")||lblZhiwei.getText().equals("超级管理员")){
					//通知卡片布局显示第一个卡片
					car.show(panel_3, "name_590872289421400");
				}else {
					JOptionPane.showMessageDialog(null, "没有权限访问");
				}
			}
		});
		btnNewButton.setBounds(23, 318, 268, 73);
		panel_1.add(btnNewButton);
		
		button_2 = new JButton("系统管理");
		button_2.setIcon(new ImageIcon("D:\\桌面\\新建文件夹\\21a9e7fad7d3182bf39a514451212d65.jpeg"));
		ImageIcon icon_a4 =new ImageIcon("D:\\桌面\\新建文件夹\\21a9e7fad7d3182bf39a514451212d65.jpeg");
		icon_a4.setImage(icon_a4.getImage().getScaledInstance(55, 55, Image.SCALE_DEFAULT));
		button_2.setIcon(icon_a4);
		//设置文字在图片下方
//		button.setVerticalTextPosition(JButton.RIGHT);
		button_2.setHorizontalTextPosition(JButton.RIGHT);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//获得当前单击的事件源（按钮）
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("系统管理") && lblZhiwei.getText().equals("系统人员")||lblZhiwei.getText().equals("超级管理员")){
					//通知卡片布局显示第一个卡片
					car.show(panel_3, "name_590875581860100");
				}else {
					JOptionPane.showMessageDialog(null, "没有权限访问");
				}
				
			}
		});
		button_2.setBounds(23, 458, 268, 73);
		panel_1.add(button_2);
		
		 panel_3 = new JPanel();
		panel_3.setBounds(320, 0, 1280, 605);
		panel_1.add(panel_3);
		panel_3.setLayout(car);
		
		JPanel panel_9 = new JPanel();
		panel_3.add(panel_9, "name_829971219221800");
		panel_9.setBackground(Color.WHITE);
		panel_9.setLayout(null);
		ImageIcon icon144 =new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png"));
		icon144.setImage(icon144.getImage().getScaledInstance(1400, 900, Image.SCALE_DEFAULT));
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(0, 0, 1176, 605);
		panel_9.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel label_16 = new JLabel("系统使用注意事项");
		label_16.setForeground(Color.BLACK);
		label_16.setFont(new Font("华文行楷", Font.BOLD, 50));
		label_16.setBounds(330, 10, 537, 67);
		panel_10.add(label_16);
		
		JLabel label_14 = new JLabel("1.账号只能本人使用，不得借于他人");
		label_14.setFont(new Font("宋体", Font.BOLD, 30));
		label_14.setBounds(74, 103, 1049, 67);
		panel_10.add(label_14);
		
		JLabel label_14_1 = new JLabel("2.不干扰或混乱网络服务，不得非法操作");
		label_14_1.setFont(new Font("宋体", Font.BOLD, 30));
		label_14_1.setBounds(74, 212, 1092, 67);
		panel_10.add(label_14_1);
		
		JLabel label_14_2 = new JLabel("3.用户使用系统过程中如果存在冒领或者恶意提交行为");
		label_14_2.setFont(new Font("宋体", Font.BOLD, 30));
		label_14_2.setBounds(74, 338, 1049, 67);
		panel_10.add(label_14_2);
		
		JLabel label_14_3 = new JLabel("4.一旦您使用了本系统的服务，就表明您已经完全接受了本用户协议");
		label_14_3.setFont(new Font("宋体", Font.BOLD, 30));
		label_14_3.setBounds(74, 457, 1102, 67);
		panel_10.add(label_14_3);
		
		JPanel panel_4 = new JPanel();
		
//		panel_4.setOpaque(false); 
//    	ImageIcon img = new ImageIcon
//    			("/img/timg (2).gif"); 
//    	JLabel background = new JLabel(img);
//    	panel_4.add(background, new Integer(Integer.MIN_VALUE)); 
//    	background.setBounds(100, 100, img.getIconWidth(), img.getIconHeight()); 
		panel_4.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_4, "name_590795233475200");
		panel_4.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("采购进货");
		btnNewButton_1.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/C11AB36A9124812E0576D414F9802537.png")));
		ImageIcon icon_6 =new ImageIcon(Zujm_ui.class.getResource("/img/C11AB36A9124812E0576D414F9802537.png"));
		icon_6.setImage(icon_6.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		btnNewButton_1.setIcon(icon_6);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caiguo_cai_ui c1=new Caiguo_cai_ui(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		btnNewButton_1.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_1.setBounds(141, 164, 307, 65);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("单据查询");
		btnNewButton_2.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/C0486B64A71AEE274D7EEF7E22D3EADB.png")));
		ImageIcon icon_8 =new ImageIcon(Zujm_ui.class.getResource("/img/C0486B64A71AEE274D7EEF7E22D3EADB.png"));
		icon_8.setImage(icon_8.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		btnNewButton_2.setIcon(icon_8);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caigou_dan_ui c2=new Caigou_dan_ui();
			}
		});
		btnNewButton_2.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_2.setBounds(737, 164, 307, 65);
		panel_4.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("采购退货");
		btnNewButton_3.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/025EDA0DEB96DADADAB44685882FB40B.png")));
		ImageIcon icon_7 =new ImageIcon(Zujm_ui.class.getResource("/img/025EDA0DEB96DADADAB44685882FB40B.png"));
		icon_7.setImage(icon_7.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		btnNewButton_3.setIcon(icon_7);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caigou_tui_ui c3=new Caigou_tui_ui(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnNewButton_3.setBounds(141, 385, 307, 65);
		panel_4.add(btnNewButton_3);
		
		JButton button_5 = new JButton("当前库存查询");
		button_5.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png")));
		ImageIcon icon_9 =new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png"));
		icon_9.setImage(icon_9.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_5.setIcon(icon_9);
		button_5.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caigou_kucun_ui kc=new Caigou_kucun_ui();
			}
		});
		button_5.setBounds(737, 385, 307, 65);
		panel_4.add(button_5);
		
		JLabel label_4 = new JLabel("采购管理");
		label_4.setFont(new Font("华文楷体", Font.BOLD, 50));
		label_4.setBounds(468, 50, 226, 45);
		panel_4.add(label_4);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png")));
		ImageIcon icon112 =new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png"));
		icon112.setImage(icon112.getImage().getScaledInstance(1400, 900, Image.SCALE_DEFAULT));
		label_11.setIcon(icon112);
		label_11.setBounds(0, 0, 1172, 614);
		panel_4.add(label_11);
		ImageIcon icon1 =new ImageIcon("/img/src=http___pic.51yuansu.com_pic2_cover_00_45_29_5814dd9b9ed6b_610.jpg&refer=http___pic.51yuansu.png");
		icon1.setImage(icon1.getImage().getScaledInstance(185, 160, Image.SCALE_DEFAULT));
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_3.add(panel_5, "name_590802393036800");
		panel_5.setLayout(null);
		
		JButton button_6 = new JButton("商品销售");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sxmbg1 a=new Sxmbg1(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_6.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/D966B04CAF908B0FC7B2C758BF0DDBE0.png")));
		ImageIcon icon10 =new ImageIcon(Zujm_ui.class.getResource("/img/D966B04CAF908B0FC7B2C758BF0DDBE0.png"));
		icon10.setImage(icon10.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_6.setIcon(icon10);
		button_6.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_6.setBounds(141, 163, 291, 68);
		panel_5.add(button_6);
		
		JButton button_7 = new JButton("销售单据查询");
		button_7.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/6B0C45C961141CB91CB7A709E693DFDD.png")));
		ImageIcon icon13 =new ImageIcon(Zujm_ui.class.getResource("/img/6B0C45C961141CB91CB7A709E693DFDD.png"));
		icon13.setImage(icon13.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_7.setIcon(icon13);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sxmbg3 c=new Sxmbg3();
			}
		});
		button_7.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_7.setBounds(726, 163, 293, 68);
		panel_5.add(button_7);
		
		JButton button_8 = new JButton("顾客退货");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sxmbg2 b=new Sxmbg2(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_8.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/025EDA0DEB96DADADAB44685882FB40B.png")));
		ImageIcon icon11 =new ImageIcon(Zujm_ui.class.getResource("/img/025EDA0DEB96DADADAB44685882FB40B.png"));
		icon11.setImage(icon11.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_8.setIcon(icon11);
		button_8.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_8.setBounds(141, 421, 291, 65);
		panel_5.add(button_8);
		
		JButton button_9 = new JButton("当前库存查询");
		button_9.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png")));
		ImageIcon icon14 =new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png"));
		icon14.setImage(icon14.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_9.setIcon(icon14);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Caigou_kucun_ui c=new Caigou_kucun_ui();
			}
		});
		button_9.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_9.setBounds(726, 419, 291, 68);
		panel_5.add(button_9);
		
		JButton btnPos = new JButton("POS 销售");
		btnPos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sxmbg4 d=new Sxmbg4(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				}); 
			}
		});
		btnPos.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/9a05da1ac0ad638178e942811b02709c.jpeg")));
		ImageIcon icon12 =new ImageIcon(Zujm_ui.class.getResource("/img/9a05da1ac0ad638178e942811b02709c.jpeg"));
		icon12.setImage(icon12.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		btnPos.setIcon(icon12);
		btnPos.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		btnPos.setBounds(430, 291, 291, 68);
		panel_5.add(btnPos);
		
		JLabel label_7 = new JLabel("销售管理");
		label_7.setFont(new Font("华文楷体", Font.BOLD, 50));
		label_7.setBounds(464, 39, 291, 68);
		panel_5.add(label_7);
		
		JLabel label_10 = new JLabel("");
		
		
		label_10.setBounds(283, 163, 207, 186);
		panel_5.add(label_10);
		
		JLabel label_11_1 = new JLabel("");
		label_11_1.setIcon(icon112);
		label_11_1.setBounds(0, 0, 1172, 614);
		panel_5.add(label_11_1);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_3.add(panel_6, "name_590872289421400");
		panel_6.setLayout(null);
		
		JButton button_10 = new JButton("报损报溢");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				KXmjm2bsby k=new KXmjm2bsby(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_10.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/88AD742FA6BDCEBC174E5CB7AEE947CB.png")));
		ImageIcon icon15 =new ImageIcon(Zujm_ui.class.getResource("/img/88AD742FA6BDCEBC174E5CB7AEE947CB.png"));
		icon15.setImage(icon15.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_10.setIcon(icon15);
		button_10.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_10.setBounds(140, 156, 301, 65);
		panel_6.add(button_10);
		
		JButton button_11 = new JButton("库存报警");
		button_11.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/089EAB65CBBC36301216A4472C4B6CCE.png")));
		ImageIcon icon18 =new ImageIcon(Zujm_ui.class.getResource("/img/089EAB65CBBC36301216A4472C4B6CCE.png"));
		icon18.setImage(icon18.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_11.setIcon(icon18);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KXmjm3kcbj k=new KXmjm3kcbj();
			}
		});
		button_11.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_11.setBounds(140, 375, 301, 65);
		panel_6.add(button_11);
		
		JButton button_12 = new JButton("库存盘点");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KXmjm1Kcpd k=new KXmjm1Kcpd(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_12.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/4D2782FAF0A17582A4FF5B0FC907CB21.png")));
		ImageIcon icon16 =new ImageIcon(Zujm_ui.class.getResource("/img/4D2782FAF0A17582A4FF5B0FC907CB21.png"));
		icon16.setImage(icon16.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_12.setIcon(icon16);
		button_12.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_12.setBounds(726, 156, 301, 65);
		panel_6.add(button_12);
		
		JButton button_13 = new JButton("当前库存查询");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Caigou_kucun_ui c=new Caigou_kucun_ui();
			}
		});
		button_13.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png")));
		ImageIcon icon17 =new ImageIcon(Zujm_ui.class.getResource("/img/20079E99974421DA8BBB7B5DBDBDF689.png"));
		icon17.setImage(icon17.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_13.setIcon(icon17);
		button_13.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_13.setBounds(726, 375, 301, 65);
		panel_6.add(button_13);
		
		JLabel label_6 = new JLabel("仓库管理");
		label_6.setFont(new Font("华文楷体", Font.BOLD, 50));
		label_6.setBounds(465, 57, 255, 52);
		panel_6.add(label_6);
		
		JLabel label_11_2 = new JLabel("");
		label_11_2.setIcon(icon112);
		label_11_2.setBounds(0, 0, 1172, 614);
		panel_6.add(label_11_2);
		ImageIcon icon3 =new ImageIcon("D:\\桌面\\新建文件夹\\31453317032c12239ecade23f30f47ef.jpeg");
		icon3.setImage(icon3.getImage().getScaledInstance(185, 160, Image.SCALE_DEFAULT));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_3.add(panel_7, "name_590875581860100");
		panel_7.setLayout(null);
		
		JButton button_14 = new JButton("商品管理");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xm2 a=new Xm2(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_14.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/B9D166030BB378B2A4CD576F549A42B4.png")));
		ImageIcon icon20 =new ImageIcon(Zujm_ui.class.getResource("/img/B9D166030BB378B2A4CD576F549A42B4.png"));
		icon20.setImage(icon20.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_14.setIcon(icon20);
		button_14.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_14.setBounds(140, 162, 302, 65);
		panel_7.add(button_14);
		
		JButton button_15 = new JButton("供货商管理");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xm1 x=new Xm1();
			}
		});
		button_15.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/5860EBAD69950C095944768447499D92.png")));
		ImageIcon icon21 =new ImageIcon(Zujm_ui.class.getResource("/img/5860EBAD69950C095944768447499D92.png"));
		icon21.setImage(icon21.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_15.setIcon(icon21);
		button_15.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_15.setBounds(684, 162, 302, 65);
		panel_7.add(button_15);
		
		JButton button_16 = new JButton("会员管理");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Xm3 x=new Xm3();
			}
		});
		button_16.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/F886620ECF44B8C8557A1011A7D4C6C4.png")));
		ImageIcon icon22 =new ImageIcon(Zujm_ui.class.getResource("/img/F886620ECF44B8C8557A1011A7D4C6C4.png"));
		icon22.setImage(icon22.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_16.setIcon(icon22);
		button_16.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_16.setBounds(140, 379, 302, 65);
		panel_7.add(button_16);
		
		JButton button_17 = new JButton("员工管理");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Xm4 x=new Xm4(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_17.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/45AD9DE562F048176A6C7A793D310535.png")));
		ImageIcon icon23 =new ImageIcon(Zujm_ui.class.getResource("/img/45AD9DE562F048176A6C7A793D310535.png"));
		icon23.setImage(icon23.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
		button_17.setIcon(icon23);
		button_17.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_17.setBounds(694, 379, 302, 65);
		panel_7.add(button_17);
		
		JLabel label_5 = new JLabel("系统管理");
		label_5.setFont(new Font("华文楷体", Font.BOLD, 50));
		label_5.setBounds(448, 54, 212, 52);
		panel_7.add(label_5);
		
		JLabel label_11_3 = new JLabel("");
		label_11_3.setIcon(icon112);
		label_11_3.setBounds(0, 0, 1172, 614);
		panel_7.add(label_11_3);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png")));
		label_9.setBounds(0, 0, 326, 601);
		panel_1.add(label_9);
		ImageIcon icon4 =new ImageIcon("D:\\桌面\\新建文件夹\\31453317032c12239ecade23f30f47ef.jpeg");
		icon4.setImage(icon4.getImage().getScaledInstance(185, 160, Image.SCALE_DEFAULT));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(175, 238, 238));
		panel_2.setBounds(0, 761, 1482, 110);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button_3 = new JButton("切换账号");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Zujm_ui.this.dispose();
				Denglu_ui2 d=new Denglu_ui2();
			}
		});
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		button_3.setBounds(209, 26, 174, 50);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("修改密码");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				C_xiugai_mima c=new C_xiugai_mima(new JFrameInterface2() {
					
					@Override
					public JFrame getJFrame() {
						// TODO Auto-generated method stub
						return Zujm_ui.this;
					}
				});
			}
		});
		button_4.setBounds(1099, 26, 172, 50);
		panel_2.add(button_4);
		button_4.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png")));
		ImageIcon icon113 =new ImageIcon(Zujm_ui.class.getResource("/img/9DA97451BA39696382A8B681FC01612B.png"));
		icon113.setImage(icon113.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT));
		label_12.setIcon(icon113);
		label_12.setBounds(0, 0, 1494, 124);
		panel_2.add(label_12);
		
		setVisible(true);
	}
	public Zujm_ui(Denglu_jiekou usersInterface){
		//调用无参构造
		this();
		//将接口中的用户拿出来
		this.y=usersInterface.getDenglu();
		label_2.setText(y.getEname());
		lblZhiwei.setText(y.getEposition());
	}
}
