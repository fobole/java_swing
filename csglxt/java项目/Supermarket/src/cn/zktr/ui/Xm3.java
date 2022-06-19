package cn.zktr.ui;
//会员管理

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import cn.zktr.dao.Xm3hyDao;
import cn.zktr.dao.Xm3zengjiadao;
import cn.zktr.entity.Xm3users;
import cn.zktr.entity.xm3hyzhengjia;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Xm3 extends JDialog {

	
	protected static final Object row = null;
	private JPanel contentPane;
	private JTextField textField;
	CardLayout card=new CardLayout();
	JPanel panel;
	JPanel panel_1;
	JPanel panel_2;
	JPanel panel_3;
	JPanel panel_4;
	 JTable table;
	
	
	List<Xm3users> list=new ArrayList<Xm3users>();
	Xm3hyDao gdao=new Xm3hyDao();
	JScrollPane scrollPane;
	private JTable table_1;

	List<Xm3users> list1=new ArrayList<Xm3users>();
	Xm3hyDao gdao2=new Xm3hyDao();
	Xm3users xm3zj;
	
	
	//删除dao
	Xm3zengjiadao sdao=new Xm3zengjiadao();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// 设置本属性将改变窗口边框样式定义
					  BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
					  UIManager.put("RootPane.setupButtonVisible", false);
					  // 启用皮肤
					  BeautyEyeLNFHelper.launchBeautyEyeLNF();
					Xm3 frame = new Xm3();
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
	public Xm3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Xm3zengjia.class.getResource("/img/logo544.png")));
		setTitle("会员管理");
		
		setBounds(100, 100, 1098, 863);
		//居中
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		 panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton button = new JButton("会员信息管理");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton but=(JButton) e.getSource();
				if(but.getText().equals("会员信息管理")) {
				card.show(panel_1,"name_380662316186500");
			}
			}
		});
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setBounds(14, 13, 155, 37);
		panel.add(button);
		
		 panel_1 = new JPanel();
		panel_1.setBounds(0, 50, 1082, 774);
		panel.add(panel_1);
		panel_1.setLayout(card);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, "name_380662316186500");
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.inactiveCaptionBorder);
		panel_5.setBounds(10, 20, 1072, 91);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				//先判断是否选中行
//				
//					//获得当前选中行的下标
//					int row=table.getSelectedRow();
//					//通过行获取该行中的列
//					int vid=(int) table.getValueAt(row, 0);
//					String vname=(String) table.getValueAt(row, 1);
//					String vphone=(String) table.getValueAt(row, 2);
//					String vpwd=(String) table.getValueAt(row, 3);
//					String vgrade=(String)table.getValueAt(row, 4);
//                	//String vopera=(String)table.getValueAt(row, 6);
//                	xm3zj=new xm3hyzhengjia(vid, vname, vphone, vpwd, vgrade);
//                	
                	Xm3zengjia a=new Xm3zengjia(new JFrameInterface() {
    					
    					@Override
    					public JDialog getJFrame() {
    						// TODO Auto-generated method stub
    						return Xm3.this;
    					}
    				});
					
				
			}
		});
		button_3.setIcon(new ImageIcon(Xm3.class.getResource("/img/增加.png")));
		button_3.setBounds(72, 10, 62, 68);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//先判断是否选中行
				if(table.getSelectedRow()<0){
					JOptionPane.showMessageDialog(null, "请先选中数据行");
				}else{
					//获得当前选中行的下标
					int row=table.getSelectedRow();
					//通过行获取该行中的列
					
                	//int vopera=(int)table.getValueAt(row, 5);
					//将属性封装到个公共的商品对象中
					for (int i = 0; i < list.size(); i++) {
						if(row==i) {
							xm3zj=list.get(i);
						}
					} 
					Xm3xuigai1 a=new Xm3xuigai1(new JFrameInterface() {
						@Override
						public JDialog getJFrame() {
							// TODO Auto-generated method stub
							return Xm3.this;
						}
					});
					}
				
			}
			}
		);
		button_4.setIcon(new ImageIcon(Xm3.class.getResource("/img/修改.png")));
		button_4.setBounds(232, 10, 62, 68);
		panel_5.add(button_4);
		
		JButton button_5 = new JButton("改为不可用");
		button_5.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_5.setIcon(null);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				if(row>-1) {
					int vid=(int) table.getValueAt(row, 0);
					try {
						sdao.updatexgs(vid);
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}
		}
		});

			
			
		
		button_5.setBounds(389, 26, 136, 41);
		panel_5.add(button_5);
		
		JButton button_1 = new JButton("改为可用");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row=table.getSelectedRow();
				if(row>-1) {
					int vid=(int) table.getValueAt(row, 0);
					try {
						sdao.updatexgs2(vid);
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					JOptionPane.showMessageDialog(null, "请选择数据");
				}
			}
		});
		button_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_1.setBounds(607, 26, 136, 41);
		panel_5.add(button_1);
		
		JLabel label = new JLabel("会员信息:");
		label.setFont(new Font("微软雅黑", Font.BOLD, 22));
		label.setBounds(29, 125, 95, 27);
		panel_2.add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		textField.setBounds(153, 125, 234, 27);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnf = new JButton("查询");
		btnf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//刷新表格
				try {
					updateTable();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btnf.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnf.setBounds(439, 121, 143, 31);
		panel_2.add(btnf);
		
		JButton button_7 = new JButton("积分清零");
		button_7.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button_7.setBounds(927, 121, 129, 31);
		panel_2.add(button_7);
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 162, 1072, 558);
		panel_2.add(scrollPane);
		
		table = new JTable();
		try {
			
			table = new JTable(getModel(findDb())){
				
				@Override
				public boolean isCellEditable(int row, int column) {
					// TODO Auto-generated method stub
					return false;
				}
			};
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JTableHeader head2 = table.getTableHeader(); // 创建表格标题对象
        head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
        render2.setHorizontalAlignment(SwingConstants.CENTER);
        table.setDefaultRenderer(Object.class, render2);
        //线条颜色
//      table_1_1.setGridColor(Color.red);
        //设置行高
        table.setRowHeight(30);
		scrollPane.setViewportView(table);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.activeCaption);
		panel_6.setBounds(0, 730, 1082, 34);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("记录数:6");
//		lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 20));
//		lblNewLabel.setBounds(35, 0, 143, 31);
//		panel_6.add(lblNewLabel);
//		
//		JLabel label_1 = new JLabel("168.00");
//		label_1.setForeground(Color.RED);
//		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
//		label_1.setBounds(294, 0, 72, 31);
//		panel_6.add(label_1);
//		
//		JLabel label_2 = new JLabel("111111.00");
//		label_2.setForeground(Color.RED);
//		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
//		label_2.setBounds(390, 0, 125, 31);
//		panel_6.add(label_2);
//		
//		JLabel label_3 = new JLabel("1351.20");
//		label_3.setForeground(Color.RED);
//		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
//		label_3.setBounds(525, -1, 285, 32);
//		panel_6.add(label_3);
//		
		table_1 = new JTable();
try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		//不能改变大小
		setResizable(false);
		setVisible(true);
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel(List<Xm3users> list) throws Exception{
		//创建表头
		Object[] head={"会员编号","会员名","手机号码","会员密码","等级","会员状态",};
		DefaultTableModel tm=null;
//		list=gdao.selectByAll();
//		System.out.println(list);
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Xm3users g=list.get(i);
				body[i][j++]=g.getVid();
				body[i][j++]=g.getVname();
				body[i][j++]=g.getVphone();
				body[i][j++]=g.getVpwd().equals("0")?"*":"********";
				body[i][j++]=g.getVgrade();
				body[i][j++]=g.getVstate()==0?"可用":"不可用";
			
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public List<Xm3users> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			list=gdao.selectByAll();
		}else{
			list=gdao.selectByAll(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
		}
	public DefaultTableModel getModel1() throws Exception{
		//创建表头
		Object[] head={"销售单号","销售日期","消费金额","储值卡","现金","银行卡","操作人","积分"};
		DefaultTableModel tm=null;
		list1=gdao2.selectByAll();

		if(list1.size()>0){
			//表主体
			Object[][] body=new Object[list1.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Xm3users g=list1.get(i);
				
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
}
