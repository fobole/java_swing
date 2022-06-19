package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import cn.zktr.dao.KkcbjDao1;

import cn.zktr.entity.Kkcbj1;
import cn.zktr.entity.Kkcpd3;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class KXmjm3kcbj extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTable table;
	 JTextField textField;
	List<Kkcbj1> list=new ArrayList<Kkcbj1>();
	KkcbjDao1 gdao=new KkcbjDao1();
	JScrollPane scrollPane;

	/**
	 * 库存报警
	 */
	public static void main(String[] args) {
		try {
			KXmjm3kcbj dialog = new KXmjm3kcbj();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public KXmjm3kcbj() {
		setTitle("库存报警");
		setIconImage(Toolkit.getDefaultToolkit().getImage(KXmjm3kcbj.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 1203, 797);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 1187, 758);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(10, 10, 1167, 97);
			panel.add(panel_1);
			panel_1.setLayout(null);
			
			JPanel panel_2 = new JPanel();
			panel_2.setBounds(0, 20, 1167, 64);
			panel_1.add(panel_2);
			panel_2.setLayout(null);
			
			textField = new JTextField();
			textField.setFont(new Font("微软雅黑", Font.BOLD, 20));
			textField.setBounds(304, 18, 152, 29);
			panel_2.add(textField);
			textField.setColumns(10);
			
			JLabel label_1 = new JLabel("查询单号：");
			label_1.setFont(new Font("微软雅黑", Font.BOLD, 20));
			label_1.setBounds(179, 20, 118, 27);
			panel_2.add(label_1);
			
			JButton button_3 = new JButton("查询");
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//刷新表格
					try {
						updateTable2();
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
				}
			});
			button_3.setFont(new Font("微软雅黑", Font.BOLD, 20));
			button_3.setBounds(566, 13, 93, 35);
			panel_2.add(button_3);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setBounds(784, 26, 54, 15);
			panel_2.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("注意：红色小于库存，蓝色大于库存，黑色为正常。");
			lblNewLabel_1.setForeground(Color.RED);
			lblNewLabel_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			lblNewLabel_1.setBounds(687, 22, 470, 23);
			panel_2.add(lblNewLabel_1);
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 128, 1167, 620);
			panel.add(scrollPane);
			
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
	        head2.setPreferredSize(new Dimension(head2.getWidth(), 40));// 设置表头大小
	        head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
	        ((DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer())
	        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
	        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
	        render2.setHorizontalAlignment(SwingConstants.CENTER);
	        table.setDefaultRenderer(Object.class, render2);
	        //线条颜色
//	      table_1_1.setGridColor(Color.red);
	        //设置行高
	        table.setRowHeight(30);
	        makeFace(table);
			scrollPane.setViewportView(table);
			//子页面关闭才能动主页面
							setModal(true);
							//不能改变大小
							setResizable(false);

			//居中
							setLocationRelativeTo(null);


			setVisible(true);
		}
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel(List<Kkcbj1> list) throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","单位","库存","最低库存","最高库存"};
		DefaultTableModel tm=null;
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				Kkcbj1 g=list.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getStshu();
				body[i][j++]=g.getStmin();
				body[i][j++]=g.getStmax();
				
				j=0;
			}
			tm=new DefaultTableModel(body, head);
//			makeFace(table);
		}else{
			tm=new DefaultTableModel(null, head);
		}
		return tm;
	}
	public 	List<Kkcbj1> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField.getText().equals(null) || textField.getText().equals("")){
			list=gdao.selectByAll();
			
		}else{
			list=gdao.selectByAll(textField.getText());
		}
		//2.如果下拉框中有值，则带条件查询
		return list;
	}
	public void updateTable2() throws Exception{
		//重新建模
		table.setModel(getModel(findDb()));
		//创建将表格加入滚动面板中
		makeFace(table);
		scrollPane.setViewportView(table);
		//通知面板立即生效
		scrollPane.validate();
		}
	
	public static void makeFace(JTable table) {  
		try {
			
	    	
		    DefaultTableCellRenderer tcr = new DefaultTableCellRenderer() {  
		    	
		    	public Component getTableCellRendererComponent(JTable table,  
		           Object value, boolean isSelected, boolean hasFocus,  
		           int row, int column) {  
		    		
		    		
		    	   //获得每个对象的剩余数量的值、最高库存和最低库存
		    		String num = table.getValueAt(row, 3).toString();
			    	String max = table.getValueAt(row,5).toString();
			        String min = table.getValueAt(row,4).toString();
			          
		           //判断	
		    	    if(Double.parseDouble(num) < Double.parseDouble(min)){
		        	   setForeground(Color.red);
		           }else if(Double.parseDouble(num) > Double.parseDouble(max)){
		        	   setForeground(Color.blue);
		           }else{
		        	   setForeground(Color.black);
		           }
		    	  
		    	    
				   //将设置好的行模型返回
		           return super.getTableCellRendererComponent(table, value,  
		                            isSelected, hasFocus, row, column);  
		         }  
		     };  
		     tcr.setHorizontalAlignment(SwingConstants.CENTER);
		    table.setDefaultRenderer(Object.class, tcr);
		     //逐行设置table模型
		     for (int i = 0; i < table.getColumnCount(); i++) {  
		        table.getColumn(table.getColumnName(i)).setCellRenderer(tcr);  
		     } 
		     
		  } catch (Exception ex) {  
		            ex.printStackTrace();  
		}  
	}
}
