package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

import org.jvnet.substance.SubstanceLookAndFeel;

import cn.zktr.dao.C_danju_dao;
import cn.zktr.dao.Cgoods_dao;
import cn.zktr.entity.C_danju_xiangqin;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.Caigou_gongyingshang;
import cn.zktr.entity.Cgoods_jiujia;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class Caigou_zhengdantui_ui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTable table;
	private JTable table_2;
	private JTable table_1;
	private JTextField textField_1;
	private JTextField textField_2;
	List<C_jintuihuo_danju> list=new ArrayList<C_jintuihuo_danju>();
	C_danju_dao ddao=new C_danju_dao();
	JScrollPane scrollPane;
	List<C_danju_xiangqin> list2=new ArrayList<C_danju_xiangqin>();
	JScrollPane scrollPane_1;
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	
	Caigou_tui_ui tui;
	/**
	 * 采购单据
	 */
//	public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//            	Caigou_zhengdantui_ui frame = new Caigou_zhengdantui_ui();
//                frame.setVisible(true);
//               
//            }
//        });
//    }
	
	/**
	 * Create the dialog.
	 */
	public Caigou_zhengdantui_ui(JFrameInterface j) {
		this.tui=(Caigou_tui_ui) j.getJFrame();
//		try {
//			UIManager.setLookAndFeel(new SubstanceLookAndFeel());
//		} catch (UnsupportedLookAndFeelException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		setIconImage(Toolkit.getDefaultToolkit().getImage(Caigou_dan_ui.class.getResource("/img/logo544.png")));
		//子页面关闭才能动主页面
				setModal(true);
		setFont(new Font("微软雅黑", Font.PLAIN, 15));
		setTitle("采购单据查询");
		//不能改变大小
				setResizable(false);
		setBounds(100, 100, 1119, 664);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1103, 634);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Caigou_dan_ui.class.getResource("/img/sel.png")));
		btnNewButton.setBounds(51, 10, 57, 65);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Caigou_dan_ui.class.getResource("/img/seldet.png")));
		btnNewButton_1.setBounds(158, 10, 57, 65);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list2.size()==0) {
					JOptionPane.showMessageDialog(null, "退回数据不能为空");
					return;
				}
				if(tui.listcai.size()>0) {	
					for (C_danju_xiangqin c : list2) {
						tui.listcai.add(new Cgoods_jiujia(c.getGid(), c.getGname(), c.getGbid(), c.getGprice(), c.getGspec(),c.getXpshu(),c.getXpodd()));
//						System.out.println(c.getXpodd());
					}
					try {
						tui.updateTablecai();
						
						Caigou_zhengdantui_ui.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					for (C_danju_xiangqin c : list2) {
						tui.listcai.add(new Cgoods_jiujia(c.getGid(), c.getGname(), c.getGbid(), c.getGprice(), c.getGspec(),c.getXpshu(),c.getXpodd()));
//						System.out.println(c.getXpodd());
					}
					try {
						tui.updateTablecai();
						Caigou_zhengdantui_ui.this.dispose();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Caigou_dan_ui.class.getResource("/img/delall.png")));
		btnNewButton_2.setBounds(269, 10, 57, 65);
		panel.add(btnNewButton_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 76, 1093, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("查询日期");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label.setBounds(16, 15, 73, 26);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("至");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		label_1.setBounds(225, 17, 33, 22);
		panel_1.add(label_1);
		
		JLabel label_2 = new JLabel("按供应商/单据号查询：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 25));
		label_2.setBounds(449, 13, 301, 35);
		panel_1.add(label_2);
		
		JButton btnNewButton_3 = new JButton("查询");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		btnNewButton_3.setBounds(894, 16, 110, 32);
		panel_1.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 25));
		textField.setBounds(714, 14, 152, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
		Chooser ser = Chooser.getInstance();
		javax.swing.JTextField textField_1 = new JTextField();
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		textField_1.setBounds(99, 14, 116, 25);
		
		textField_1.setColumns(10);
		textField_1.setText("2020-6-11");
        ser.register(textField_1);
        panel_1.add(textField_1);
        
        Chooser ser2 = Chooser.getInstance();
        javax.swing.JTextField textField_2 = new JTextField();
        textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
        textField_2.setBounds(260, 15, 116, 26);
        textField_2.setColumns(10);
		textField_2.setText("2020-6-11");
		ser2.register(textField_2);
        panel_1.add(textField_2);
        textField_2.setColumns(10);
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 144, 1083, 192);
		
		panel.add(scrollPane);
		
		
		try {
			
			table_2 = new JTable(getModel(findDb())){
				
				@Override
				public boolean isCellEditable(int row, int column) {
					// TODO Auto-generated method stub
					return false;
				}
			};
			table_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//获得当前选中行的下标
					int row=table_2.getSelectedRow();
					//通过行获取该行中的列
					String podd=(String) table_2.getValueAt(row, 0);
					try {
						list2=ddao.selectByAll2(podd);
						updateTablexq();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			
				}
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		table_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JTableHeader head = table_2.getTableHeader(); // 创建表格标题对象
        head.setPreferredSize(new Dimension(head.getWidth(), 35));// 设置表头大小
        head.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render1 = new DefaultTableCellRenderer();
        render1.setHorizontalAlignment(SwingConstants.CENTER);
        table_2.setDefaultRenderer(Object.class, render1);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table_2.setRowHeight(35);
        table_2.getColumnModel().getColumn(0).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(0).setMaxWidth(300) ;
		table_2.getColumnModel().getColumn(2).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(2).setMaxWidth(300) ;
		scrollPane.setViewportView(table_2);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 376, 1083, 237);
		panel.add(scrollPane_1);
		
		table_1 = new JTable();
try {
			
			table_1 = new JTable(getModel2()){
				
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
		table_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		JTableHeader head1 = table_1.getTableHeader(); // 创建表格标题对象
        head1.setPreferredSize(new Dimension(head1.getWidth(), 35));// 设置表头大小
        head1.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        table_1.setDefaultRenderer(Object.class, render);
        //线条颜色
//        table_1.setGridColor(Color.red);
        //设置行高
        table_1.setRowHeight(30);
		scrollPane_1.setViewportView(table_1);
		
		 
		
		JLabel label_3 = new JLabel("单据的详细信息：");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_3.setBounds(20, 334, 169, 45);
		panel.add(label_3);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Caigou_dan_ui.class.getResource("/img/exit.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button.setBounds(373, 10, 64, 65);
		panel.add(button);
		setVisible(true);
		setModal(true);
	}
	public DefaultTableModel getModel(List<C_jintuihuo_danju> list) throws Exception{
		//创建表头
		Object[] head={"单号","供应商","进货时间","应付金额","实付金额","经办人"};
		DefaultTableModel tm=null;
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
//			System.out.println(list);
			for (int i = 0; i < body.length; i++) {
				C_jintuihuo_danju g=list.get(i);
				body[i][j++]=g.getPodd();
				body[i][j++]=g.getSbusiness();
				body[i][j++]=sdf.format(g.getPdate());
				body[i][j++]=g.getPcope();
				body[i][j++]=g.getPpaid();
				body[i][j++]=g.getPagent();
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
	public List<C_jintuihuo_danju> findDb() throws Exception{
		Caigou_gongyingshang g=(Caigou_gongyingshang) tui.comboBox_1.getSelectedItem();
		String gys=g.getSbusiness();
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			
			list=ddao.zhengtui(gys);
			
		}else{
			list=ddao.zhengtui(gys,textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	
	public void updateTable() throws Exception{
		//重新建模
		table_2.setModel(getModel(findDb()));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(0).setMaxWidth(300) ;
		table_2.getColumnModel().getColumn(2).setPreferredWidth(250);
		table_2.getColumnModel().getColumn(2).setMaxWidth(300) ;
		//创建将表格加入滚动面板中
		scrollPane.setViewportView(table_2);
		//通知面板立即生效
		scrollPane.validate();
		}
	//第二个表格
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","单位","单价","数量","总金额"};
		DefaultTableModel tm=null;
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				C_danju_xiangqin g=list2.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getGbid();
				body[i][j++]=g.getXpshu();
				body[i][j++]=g.getGbid()*g.getXpshu();
				
				j=0;
			}
			tm=new DefaultTableModel(body, head);
			
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public void updateTablexq() throws Exception{
		//重新建模
		table_1.setModel(getModel2());
		//创建将表格加入滚动面板中
		scrollPane_1.setViewportView(table_1);
		//通知面板立即生效
		scrollPane_1.validate();
		}
	/**
	 * 
	 * @param table
	 *            表格
	 * @param columnIndex
	 *            要设置的列下标
	 * @param c
	 *            颜色
	 */
	public static void setTableHeaderColor(JTable table, int columnIndex, Color c) {
	    TableColumn column = table.getTableHeader().getColumnModel().getColumn(columnIndex);
	    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
	        /** serialVersionUID */
	        private static final long serialVersionUID = 43279841267L;

	        @Override
	        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
	                boolean hasFocus, int row, int column) {

	            setHorizontalAlignment(JLabel.CENTER);
	            ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
	                    .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 表头内容居中

	            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	        }
	    };
	    cellRenderer.setBackground(c);
	    column.setHeaderRenderer(cellRenderer);
	}
}
