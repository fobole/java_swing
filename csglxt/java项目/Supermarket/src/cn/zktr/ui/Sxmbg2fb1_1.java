package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import cn.zktr.dao.S_danju;
import cn.zktr.entity.S_danju_xiangqin;
import cn.zktr.entity.S_jintuihuo_danju;
import cn.zktr.entity.Sgoods_jiujia;

public class Sxmbg2fb1_1 extends JDialog{
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_2;
	private JTextField textField_3;
	private JTable table_1;
	JScrollPane scrollPane;
	JScrollPane scrollPane_1;
	List<S_jintuihuo_danju> list=new ArrayList<S_jintuihuo_danju>();
	S_danju xtdao=new S_danju();
	
	List<S_danju_xiangqin> list2=new ArrayList<S_danju_xiangqin>();
	S_danju ddao=new S_danju();
	Sxmbg2 xiao;
	/**
	 * Launch the application.
	 */
	
	
	
//	public static void main(String[] args) {
//		try {
//			Sxmbg3 dialog = new Sxmbg3();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
	public Sxmbg2fb1_1(JFrameInterface j) {
		this.xiao=(Sxmbg2) j.getJFrame();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sxmbg3.class.getResource("/img/logo544.png")));
		setTitle("销售单据查询");
		setBounds(100, 100, 1129, 796);
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 10, 1093, 58);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Sxmbg2fb2 fb2=new Sxmbg2fb2();
					}
				});
				button.setIcon(new ImageIcon(Sxmbg3.class.getResource("/img/sel.png")));
				button.setBounds(72, 0, 56, 55);
				panel.add(button);
			}
			{
				JButton button = new JButton("");
				button.setIcon(new ImageIcon(Sxmbg3.class.getResource("/img/seldet.png")));
				button.setBounds(176, 0, 56, 55);
				panel.add(button);
			}
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						for (int i = 0; i < list2.size(); i++) {
							xiao.lxiao.add(new Sgoods_jiujia(list2.get(i).getGid(), list2.get(i).getGname(), list2.get(i).getGprice(), list2.get(i).getGprice(),list2.get(i).getGspec(),list2.get(i).getSdshu()));
						}
						 try {
							xiao.updateTable2();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						Sxmbg2fb1_1.this.dispose();
					}
				});
				button.setIcon(new ImageIcon(Sxmbg3.class.getResource("/img/delall.png")));
				button.setBounds(282, 0, 56, 55);
				panel.add(button);
			}
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						
							setVisible(false);
						
					}
				});
				
				button.setIcon(new ImageIcon(Sxmbg3.class.getResource("/img/exit.png")));
				button.setBounds(386, 0, 56, 55);
				panel.add(button);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 84, 1093, 53);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("按客服/单据号查询：");
				label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				label.setBounds(56, 5, 200, 37);
				panel.add(label);
			}
			{
				textField_2 = new JTextField();
				textField_2.setFont(new Font("微软雅黑", Font.PLAIN, 20));
				textField_2.setBackground(new Color(0,0,0,0));
				textField_2.setOpaque(false);
				//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
				textField_2.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
				textField_2.setBounds(266, 12, 189, 24);
				panel.add(textField_2);
				textField_2.setColumns(10);
			}
			{
				JButton btnf = new JButton("查询(F2)");
				btnf.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						//刷新表格
						try {
							updateTable();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
				btnf.setFont(new Font("微软雅黑", Font.BOLD, 19));
				btnf.setBounds(508, 10, 117, 34);
				panel.add(btnf);
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 147, 1093, 229);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				scrollPane = new JScrollPane();
				scrollPane.setBounds(10, 10, 1073, 209);
				panel.add(scrollPane);
				{
					
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
							public void mouseClicked(MouseEvent a) {
								//获得当前选中行的下标
								int row=table_2.getSelectedRow();
								//System.out.println(row);
								//通过行获取该行中的列
								String saodd=(String) table_2.getValueAt(row, 0);
								textField_3.setText(saodd);
								try {
									 list2=ddao.selectByAllz(saodd);
//									System.out.println(list2);
									updateTable2();
								} catch (Exception a1) {
									// TODO Auto-generated catch block
									a1.printStackTrace();
								}
							}
						});
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					table_2.setFont(new Font("微软雅黑", Font.BOLD,17));
					JTableHeader head23 = table_2.getTableHeader(); // 创建表格标题对象
			        head23.setPreferredSize(new Dimension(head23.getWidth(), 35));// 设置表头大小
			        head23.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
			        ((DefaultTableCellRenderer) table_2.getTableHeader().getDefaultRenderer())
			        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
			        DefaultTableCellRenderer render2 = new DefaultTableCellRenderer();
			        render2.setHorizontalAlignment(SwingConstants.CENTER);
			        table_2.setDefaultRenderer(Object.class, render2);
			        //线条颜色
//			        table_2.setGridColor(Color.red);
			        //设置行高
			        table_2.setRowHeight(30);
					scrollPane.setViewportView(table_2);
				}
			}
		}
		{
			JPanel panel = new JPanel();
			panel.setBounds(10, 386, 1093, 305);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
				panel_1.setBounds(10, 10, 1073, 62);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					JLabel label = new JLabel("单据的详细信息：");
					label.setFont(new Font("微软雅黑", Font.PLAIN, 20));
					label.setBounds(14, 13, 166, 28);
					panel_1.add(label);
				}
				{
					textField_3 = new JTextField();
					//先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
					textField_3.setBackground(new Color(0,0,0,0));
					textField_3.setOpaque(false);
					//重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
			        textField_3.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
					textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 20));
					textField_3.setBounds(169, 11, 264, 30);
					panel_1.add(textField_3);
					textField_3.setColumns(10);
				}
			}
			{
				scrollPane_1 = new JScrollPane();
				scrollPane_1.setBounds(10, 93, 1073, 206);
				panel.add(scrollPane_1);
				{
					try {
						table_1 = new JTable(getModel2());
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					table_1.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							try {
								updateTable2();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
					table_1.setFont(new Font("微软雅黑", Font.BOLD,17));
					JTableHeader head2 = table_1.getTableHeader(); // 创建表格标题对象
					head2.setPreferredSize(new Dimension(head2.getWidth(), 35));// 设置表头大小
					head2.setFont(new Font("微软雅黑", Font.BOLD, 20));// 设置表格字体
			        ((DefaultTableCellRenderer) table_1.getTableHeader().getDefaultRenderer())
			        .setHorizontalAlignment(DefaultTableCellRenderer.CENTER);// 列头内容居中
			        DefaultTableCellRenderer render23 = new DefaultTableCellRenderer();
			        render23.setHorizontalAlignment(SwingConstants.CENTER);
			        table_1.setDefaultRenderer(Object.class, render23);
			        //线条颜色
//			        table_1.setGridColor(Color.red);
			        //设置行高
			        table_1.setRowHeight(30);
					scrollPane_1.setViewportView(table_1);
				}
			}
		}
		{
			JLabel lblNewLabel = new JLabel("说明：单据表查询销售单信息，汇总表，明细表查询的总金额不包括优惠金额");
			lblNewLabel.setForeground(new Color(100, 149, 237));
			lblNewLabel.setFont(new Font("微软雅黑", Font.PLAIN, 15));
			lblNewLabel.setBounds(20, 701, 533, 18);
			contentPanel.add(lblNewLabel);
		}
		setLocationRelativeTo(null);
		setModal(true);
		setVisible(true);
	}
	/**
	 * 建模
	 * @return
	 * @throws Exception 
	 */
	public DefaultTableModel getModel(List<S_jintuihuo_danju> list) throws Exception{
		
		//创建表头
		Object[] head={"单号","日期","客户名称","应付金额","实付金额","经办人"};
		DefaultTableModel tm=null;
	   
		if(list.size()>0){
			//表主体
			Object[][] body=new Object[list.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				S_jintuihuo_danju g=list.get(i);
				body[i][j++]=g.getSaodd();
				body[i][j++]=g.getGdate();
			    body[i][j++]=g.getVname();
                body[i][j++]=g.getSacope();
				body[i][j++]=g.getSapaid();
      			body[i][j++]=g.getSaagent();
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
	public List<S_jintuihuo_danju> findDb() throws Exception{
		//1.如果第一次来，输入框中无值，则查询所有
		if(textField_2.getText().equals(null) || textField_2.getText().equals("")){
			list=xtdao.selecttui();
		}else{
			list=xtdao.selecttui(textField_2.getText());
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
	public DefaultTableModel getModel2() throws Exception{
		//创建表头
		Object[] head={"商品编号","商品名称","规格","数量","总金额"};
		DefaultTableModel tm=null;
//		System.out.println("PPPP"+list2);
//	    list=xtdao.selectByAll();
		if(list2.size()>0){
			//表主体
			Object[][] body=new Object[list2.size()][head.length];
			int j=0;
			for (int i = 0; i < body.length; i++) {
				S_danju_xiangqin g=list2.get(i);
				body[i][j++]=g.getGid();
				body[i][j++]=g.getGname();
				body[i][j++]=g.getGspec();
				body[i][j++]=g.getSdshu();
				body[i][j++]=g.getGprice()*g.getSdshu();
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
