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
import cn.zktr.entity.Cgoods_jiujia;

import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;

public class Caigou_dan_ui extends JDialog {

	private final JPanel contentPanel = new JPanel();
	 JTextField textField;
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
	
	//按条件查单据
	JComboBox comboBox;
	/**
	 * 采购单据
	 */
	public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	Caigou_dan_ui frame = new Caigou_dan_ui();
                frame.setVisible(true);
               
            }
        });
    }

	/**
	 * Create the dialog.
	 */
	public Caigou_dan_ui() {
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
		setTitle("单据查询");
		//不能改变大小
				setResizable(false);
		setBounds(100, 100, 1214, 674);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 255));
		panel.setBounds(0, 0, 1208, 645);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 51, 1175, 58);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("按供应商/单据号查询：");
		label_2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_2.setBounds(219, 10, 228, 38);
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
		btnNewButton_3.setBounds(643, 13, 107, 33);
		panel_1.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.BOLD, 18));
		textField.setBounds(457, 15, 159, 31);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("退出");
		button.setBounds(1073, 14, 92, 31);
		panel_1.add(button);
		button.setFont(new Font("微软雅黑", Font.BOLD, 20));
		button.setIcon(null);
		
		JLabel lblcjct = new JLabel("（CJ-采购进货单，CT-采购退货单）");
		lblcjct.setForeground(Color.RED);
		lblcjct.setFont(new Font("微软雅黑", Font.BOLD, 18));
		lblcjct.setBounds(762, 11, 318, 38);
		panel_1.add(lblcjct);
		
		 comboBox = new JComboBox();
		comboBox.setFont(new Font("微软雅黑", Font.BOLD, 22));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"采购单据", "退货单据"}));
		comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
            	if (e.getStateChange() == ItemEvent.SELECTED) {
            		try {
						updateTable();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                }
            }
        });
		comboBox.setBounds(10, 16, 140, 33);
		panel_1.add(comboBox);
		
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		Chooser ser = Chooser.getInstance();
        
        Chooser ser2 = Chooser.getInstance();
		
		 scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 1175, 207);
		
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
//					System.out.println(podd);
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
		scrollPane_1.setBounds(10, 376, 1175, 249);
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
        table_1.setRowHeight(35);
		scrollPane_1.setViewportView(table_1);
		
		 
		
		JLabel label_3 = new JLabel("单据的详细信息：");
		label_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
		label_3.setBounds(20, 336, 169, 30);
		panel.add(label_3);
		
		JLabel lblNewLabel = new JLabel("单    据");
		lblNewLabel.setFont(new Font("微软雅黑", Font.BOLD, 30));
		lblNewLabel.setBounds(450, -4, 200, 50);
		panel.add(lblNewLabel);
		setVisible(true);
		setModal(true);
	}
	public DefaultTableModel getModel(List<C_jintuihuo_danju> list) throws Exception{
		//创建表头
		Object[] head={"单号","供应商","时间","应付金额","实付金额","经办人"};
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
		//1.如果第一次来，输入框中无值，则查询所有
		
		// 选择的下拉框选项
		if(comboBox.getSelectedItem().equals("采购单据")){
			if(textField.getText().equals(null) || textField.getText().equals("")){
				list=ddao.selectByAll(0);
			}else{
				list=ddao.selectByAll(0,textField.getText());
			
			}
		}else if(comboBox.getSelectedItem().equals("退货单据")){
			if(textField.getText().equals(null) || textField.getText().equals("")){
				list=ddao.selectByAll(1);
			}else{
				list=ddao.selectByAll(1,textField.getText());
			
			}
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
	
	
//	public void FitTableColumns(JTable myTable){
//		  JTableHeader header = myTable.getTableHeader();
//		     int rowCount = myTable.getRowCount();
//		     Enumeration columns = myTable.getColumnModel().getColumns();
//		     while(columns.hasMoreElements()){
//		         TableColumn column = (TableColumn)columns.nextElement();
//		         int col = header.getColumnModel().getColumnIndex(column.getIdentifier());
//		         int width = (int)myTable.getTableHeader().getDefaultRenderer()
//		                 .getTableCellRendererComponent(myTable, column.getIdentifier()
//		                         , false, false, -1, col).getPreferredSize().getWidth();
//		         for(int row = 0; row<rowCount; row++){
//		             int preferedWidth = (int)myTable.getCellRenderer(row, col).getTableCellRendererComponent(myTable,
//		               myTable.getValueAt(row, col), false, false, row, col).getPreferredSize().getWidth();
//		             width = Math.max(width, preferedWidth);
//		         }
//		         header.setResizingColumn(column); // 此行很重要
//		         column.setWidth(width+myTable.getIntercellSpacing().width);
//		     }
//	}
	/**
	 * 
	 * @param table
	 *            表格
	 * @param columnIndex
	 *            要设置的列下标
	 * @param c
	 *            颜色
	 */
//	public static void setTableHeaderColor(JTable table, int columnIndex, Color c) {
//	    TableColumn column = table.getTableHeader().getColumnModel().getColumn(columnIndex);
//	    DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
//	        /** serialVersionUID */
//	        private static final long serialVersionUID = 43279841267L;
//
//	        @Override
//	        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
//	                boolean hasFocus, int row, int column) {
//
//	            setHorizontalAlignment(JLabel.CENTER);
//	            ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
//	                    .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 表头内容居中
//
//	            return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//	        }
//	    };
//	    cellRenderer.setBackground(c);
//	    column.setHeaderRenderer(cellRenderer);
//	}
}
