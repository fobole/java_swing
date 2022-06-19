package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.biz.Kcpd1biz;
import cn.zktr.dao.KkcpdDao;
import cn.zktr.dao.KkcpdDao2;
import cn.zktr.dao.KkcpdDao3;
import cn.zktr.entity.Kkcpd1;
import cn.zktr.entity.Kkcpd2;
import cn.zktr.entity.Kkcpd3;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KXmjm1aKcpd extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;
	private JTable table_2;
	 JTable table_1;
	private JTable table_1_1;
	List<Kkcpd3> list=new ArrayList<Kkcpd3>();
	KkcpdDao2 gdao=new KkcpdDao2();
	JScrollPane scrollPane;
	JScrollPane scrollPane_1;
	List<Kkcpd3> list2=new ArrayList<Kkcpd3>();
	KkcpdDao3 gdao1=new KkcpdDao3();
	JTextField textField_2;

	Kkcpd3 cj;
	//父窗口
		KXmjm1Kcpd pan;
		
		
		JLabel lblNewLabel_2;
		JComboBox comboBox;
		
		
		Kcpd1biz pbiz=new Kcpd1biz();
		
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			// 设置本属性将改变窗口边框样式定义
//			  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
//			  UIManager.put("RootPane.setupButtonVisible", false);
//			  // 启用皮肤
//			  BeautyEyeLNFHelper.launchBeautyEyeLNF();
//			KXmjm1aKcpd dialog = new KXmjm1aKcpd();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public KXmjm1aKcpd(JFrameInterface jframe) {
		this.pan=(KXmjm1Kcpd) jframe.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm1aKcpd.class.getResource("/Img/logo544.png")));
		//子页面关闭才能动主页面
		setModal(true);
		//不能改变大小
		setResizable(false);

		setForeground(new Color(176, 196, 222));
		
		setTitle("录入盘点信息");
		setBounds(100, 100, 1197, 800);
		//居中
		setLocationRelativeTo(null);

		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1181, 129);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel lblNewLabel = new JLabel("盘点信息");
				lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel.setBounds(10, 0, 80, 21);
				panel.add(lblNewLabel);
			}
			{
				JLabel lblNewLabel_1 = new JLabel("盘点单号：");
				lblNewLabel_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_1.setBounds(53, 27, 100, 19);
				panel.add(lblNewLabel_1);
			}
			{
				lblNewLabel_2 = new JLabel("pd"+new Date().getTime());
				lblNewLabel_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_2.setForeground(new Color(255, 0, 0));
				lblNewLabel_2.setBounds(146, 25, 195, 23);
				panel.add(lblNewLabel_2);
			}
			{
				JLabel lblNewLabel_3 = new JLabel("选择盘点仓库：");
				lblNewLabel_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_3.setBounds(351, 25, 140, 19);
				panel.add(lblNewLabel_3);
			}
			{
				comboBox = new JComboBox();
				comboBox.setFont(new Font("宋体", Font.PLAIN, 20));
				comboBox.setBounds(518, 23, 100, 21);
				panel.add(comboBox);
			}
			{
				JLabel lblNewLabel_4 = new JLabel("盘点日期：");
				lblNewLabel_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_4.setBounds(651, 22, 126, 21);
				panel.add(lblNewLabel_4);
			}
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("宋体", Font.BOLD, 20));
			Chooser ser3 = Chooser.getInstance();
	       
	        textField_2.setBounds(765, 23, 126, 23);
	        textField_2.setText("2013-10-11");
	        ser3.register(textField_2);
			textField_2.setBounds(765, 22, 126, 24);
			panel.add(textField_2);
			textField_2.setColumns(10);
			{
				JLabel lblNewLabel_5 = new JLabel("操作员：");
				lblNewLabel_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_5.setBounds(928, 23, 88, 19);
				panel.add(lblNewLabel_5);
			}
			
			comboBox = new JComboBox();
			
			comboBox.setFont(new Font("微软雅黑", Font.BOLD, 20));
			//comboBox.setModel(new DefaultComboBoxModel(new String[] {"小赖", "小伟", "小兰", "小涵"}));
			comboBox.addItem(pan.lblNewLabel_8.getText());
			comboBox.setBounds(1011, 23, 100, 23);
			panel.add(comboBox);
			{
				JLabel lblNewLabel_7 = new JLabel("备注：");
				
				lblNewLabel_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
				lblNewLabel_7.setBounds(10, 64, 64, 20);
				panel.add(lblNewLabel_7);
			}
			
			textField = new JTextField();
			textField.setBackground(Color.WHITE);
			textField.setBounds(60, 63, 858, 21);
			//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			textField.setBorder(new MatteBorder(0,0,1,0,new Color(0,0,0)));
			panel.add(textField);
			textField.setColumns(10);
			panel.add(textField);
			textField.setColumns(10);
			{
				JLabel lblNewLabel_8 = new JLabel("提示:盘点前请选择仓库，盘点中不能更换仓库和日期。在没有修正库存之前请勿有采购进货、销售等能改变库存数量的操作，不然会造成库存数里不准。\n");
				lblNewLabel_8.setFont(new Font("宋体", Font.BOLD, 16));
				lblNewLabel_8.setForeground(new Color(255, 0, 0));
				lblNewLabel_8.setBounds(10, 94, 1161, 35);
				panel.add(lblNewLabel_8);
			}
			 Chooser ser = Chooser.getInstance();
		        javax.swing.JTextField text = new JTextField();
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 129, 550, 632);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBounds(0, 0, 540, 109);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel lblNewLabel_9 = new JLabel("库存商品");
					lblNewLabel_9.setFont(new Font("微软雅黑", Font.BOLD, 20));
					lblNewLabel_9.setBounds(0, 0, 85, 26);
					panel_1.add(lblNewLabel_9);
				}
				{
					JLabel lblNewLabel_10 = new JLabel("商品编号：");
					lblNewLabel_10.setFont(new Font("微软雅黑", Font.BOLD, 20));
					lblNewLabel_10.setBounds(10, 46, 106, 19);
					panel_1.add(lblNewLabel_10);
				}
				{
					textField_1 = new JTextField();
					textField_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
					textField_1.setBounds(110, 44, 116, 21);
					panel_1.add(textField_1);
					textField_1.setColumns(10);
				}
				{
					JButton btnNewButton = new JButton("确定");
					btnNewButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							
							try {
								updateTable();
								
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 20));
					btnNewButton.setBounds(236, 42, 93, 23);
					panel_1.add(btnNewButton);
				}
				
				JButton btnNewButton_1 = new JButton("商品清单");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnNewButton_1.setBackground(new Color(255, 255, 255));
				btnNewButton_1.setBounds(0, 75, 116, 34);
				panel_1.add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("商品列表");
				btnNewButton_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				btnNewButton_2.setBounds(110, 75, 121, 34);
				panel_1.add(btnNewButton_2);
			}
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(0, 119, 550, 503);
			panel.add(scrollPane);
			
			
			try {
				
				table_2 = new JTable(getModel(findDb())){
					
					@Override
					public boolean isCellEditable(int row, int column) {
						// TODO Auto-generated method stub
						return false;
					}
				};
				table_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
				table_2.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						if (e.getClickCount() == 2) {
							//先判断是否选中行
								if(table_2.getSelectedRow()<0){
									JOptionPane.showMessageDialog(null, "请先选中数据行");
								}else{
									//获得当前选中行的下标
									int row=table_2.getSelectedRow();
									//通过行获取该行中的列
									int gid=(int) table_2.getValueAt(row, 0);
									String gname=(String) table_2.getValueAt(row, 1);
									int gbid=(int) table_2.getValueAt(row, 2);
									double gprice=(double) table_2.getValueAt(row, 3);
									String gspec=(String) table_2.getValueAt(row, 4);
									int stshu=(int) table_2.getValueAt(row, 5);
									//将属性封装到个公共的商品对象中
									cj=new Kkcpd3(gid,stshu,gname,gprice,gspec,gbid);
									
									//打开新增窗口,将当前父窗口传到子窗口中
									Kpdcxjm n=new Kpdcxjm(new JFrameInterface() {
										
										@Override
										public JDialog getJFrame() {
											// TODO Auto-generated method stub
											return KXmjm1aKcpd.this;
										}
									});
								}
						 }
						
					}
				});
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JTableHeader head = table_2.getTableHeader(); // 创建表格标题对象
	        head.setPreferredSize(new Dimension(head.getWidth(), 40));// 设置表头大小
	        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
	        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
	        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
	        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
	        render.setHorizontalAlignment(SwingConstants.CENTER);
	        table_2.setDefaultRenderer(Object.class, render);
	        table_2.setRowHeight(35);
	        //线条颜色
//	        table_1.setGridColor(Color.red);
			scrollPane.setViewportView(table_2);
		}
		
		JPanel panel = new JPanel();
		panel.setBounds(570, 129, 611, 632);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 =  new JPanel();
		panel_1.setBounds(0, 0, 601, 101);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("已盘商品");
		lblNewLabel_11.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_11.setBounds(0, 0, 101, 28);
		panel_1.add(lblNewLabel_11);
		
		JButton btnNewButton_3 = new JButton("修改");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table_1.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table_1.getSelectedRow();
					//通过行获取该行中的列
					//打开新增窗口,将当前父窗口传到子窗口中
					Kpdxgjm1 add=new Kpdxgjm1(new JFrameInterface() {
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return KXmjm1aKcpd.this;
						}
					});
			}
				
			}
		});
		btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_3.setBounds(69, 41, 93, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("删除");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table_1.getSelectedRow();
				if(row>-1) {
					list2.remove(row);
					try {
						updateTable2();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}
				
			}
		});
		
		btnNewButton_4.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_4.setBounds(206, 41, 93, 23);
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("退出");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_5.setBounds(344, 41, 93, 23);
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("确定");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//收集主表和从表上需要的数据
				//1.主表需要单号，供应商编号，应付，实付
				String dh=lblNewLabel_2.getText();
				Date rq=new Date();
				String name=(String) comboBox.getSelectedItem();
				String czy=(String) comboBox.getSelectedItem();
				int tiao=list2.size();
				//盘点数量
				int lshu=0;
				for (Kkcpd3 k : list2) {
					
					lshu+=k.getStshu();
				}
			
				try {
					pbiz.inventory(list2, dh, rq, name, czy,tiao,lshu);
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				
				try {
					
					pan.updateTablelcy();
					pan.updateTable2();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				KXmjm1aKcpd.this.dispose();
			}
		});
		
		
		
		btnNewButton_6.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_6.setBounds(478, 41, 93, 26);
		panel_1.add(btnNewButton_6);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 106, 591, 516);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		
		JTableHeader head = table_1.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 40));// 设置表头大小
        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        render.setHorizontalAlignment(SwingConstants.CENTER);
        table_1.setDefaultRenderer(Object.class, render);
        table_1.setRowHeight(35);
        //线条颜色
//        table_1.setGridColor(Color.red);
		scrollPane_1.setViewportView(table_1);
		setVisible(true);
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	//第一个表格
	
	public DefaultTableModel getModel(List<Kkcpd3> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","进价","售价","单位","库存"};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
		System.out.println(list);
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcpd3 g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	/**
	 * 通用查询
	 * @return
	 * @throws Exception 
	 */
	public List<Kkcpd3> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_1.getText().equals(null) || textField_1.getText().equals("")){
			list=gdao.selectByAll();
		}else{
			list=gdao.selectByAll(textField_1.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_2.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table_2);
		//通知面板立即生效
		scrollPane.validate();
		}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	//第二个表格
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","进价","售价","单位","库存"};
		DefaultTableModel tm=null;
		
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcpd3 g=list2.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getGprice();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTable2() throws Exception{
		//重新建模
		table_1.setModel(getModel2());
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_1);
		//通知面板立即生效
		scrollPane_1.validate();
		}
}
