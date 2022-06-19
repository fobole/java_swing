package cn.zktr.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import cn.zktr.biz.CaigouBiz;
import cn.zktr.dao.Caigou_shenheztai_dao;
import cn.zktr.entity.C_jintuihuo_danju;
import cn.zktr.entity.Caigou_gongyingshang;
import cn.zktr.entity.Cgoods_caigou;
import cn.zktr.entity.Cgoods_jiujia;
import cn.zktr.entity.Cyonghui_denglu;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Caigou_shenhezhuantai_ui2 extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	
	//采购添加dao
	Caigou_shenheztai_dao sh=new Caigou_shenheztai_dao();
	
	
	int coid;
	
	//biz
		CaigouBiz cbiz=new CaigouBiz();
	
	/**
	 * 审核窗口
	 */
//	public static void main(String[] args) {
//		try {
//			Caigou_shenhezhuantai_ui dialog = new Caigou_shenhezhuantai_ui();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	//父窗口
	Caigou_tui_ui shen;
	/**
	 * Create the dialog.
	 */
	public Caigou_shenhezhuantai_ui2(JFrameInterface jframe) {
		this.shen=(Caigou_tui_ui) jframe.getJFrame();
		
		//子页面关闭才能动主页面
				setModal(true);
				//不能改变大小
				setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Caigou_shenhezhuantai_ui.class.getResource("/img/logo544.png")));
		setBounds(100, 100, 579, 433);
		//居中
				setLocationRelativeTo(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 563, 394);
			contentPanel.add(panel);
			panel.setLayout(null);
			
			JLabel label = new JLabel("审核状态");
			label.setFont(new Font("微软雅黑", Font.BOLD, 40));
			label.setBounds(188, 26, 210, 48);
			panel.add(label);
			
			JRadioButton radioButton = new JRadioButton("已审核状态");
			radioButton.setFont(new Font("微软雅黑", Font.BOLD, 25));
			radioButton.setBounds(86, 112, 159, 35);
			radioButton.setSelected(true);
			panel.add(radioButton);
			
			JRadioButton radioButton_1 = new JRadioButton("未审核状态");
			radioButton_1.setFont(new Font("微软雅黑", Font.BOLD, 25));
			radioButton_1.setBounds(324, 112, 233, 35);
			panel.add(radioButton_1);
			
			//由于单选框只能选择一个，所以需要分组,且一个组中只能选一个
			ButtonGroup group = new ButtonGroup();
			group.add(radioButton);
			group.add(radioButton_1);
			
			
			JButton button = new JButton("确定");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String podd=shen.lblx.getText();
					Caigou_gongyingshang g=(Caigou_gongyingshang) shen.comboBox_1.getSelectedItem();
					int sid=g.getSid();
					Date pdate=new Date();
					double pcope=Double.parseDouble(shen.lblNewLabel_2.getText());
					double ppaid=Double.parseDouble(shen.textField_4_1.getText());
					String pagent=(String) shen.comboBox_2.getSelectedItem();
					if(radioButton.isSelected()){
//						System.out.println("审核");
						//采购退货主表
						Cgoods_caigou cai=new Cgoods_caigou(podd, sid, pdate,0,pcope, ppaid, pagent);
						//库存出入库表（come）
						Cgoods_caigou come=new Cgoods_caigou(podd, 1, pdate, pagent,0, pdate);
						
						
						//2.从表需要list集合中的数据，可以直接将glist传入过去
						try {
							//由于有很多业务，这里必须经过biz业务类处理
							cbiz.inserttuihuo(shen.listcai, cai,come);
							
							
							
							
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
								shen.listcai.clear();
								SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
								shen.lblx.setText("CJ"+sdf.format(new Date()));
								shen.lblNewLabel_2.setText("0");
								shen.textField_4_1.setText("");
								 try {
									shen.updateTablecai();
									
									//刷新表格
									//新增成功，调用父窗口的刷新方法，并关闭当前窗口
									JOptionPane.showMessageDialog(null, "退货商品成功");
									Caigou_shenhezhuantai_ui2.this.dispose();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							
					}else if(radioButton_1.isSelected()){
//						System.out.println("未审核"); 
						//采购退货主表
						Cgoods_caigou cai=new Cgoods_caigou(podd, sid, pdate,1,pcope, ppaid, pagent);
						//库存出入库表（come）
						Cgoods_caigou come=new Cgoods_caigou(podd, 1, pdate, pagent,0, pdate);
						
						//2.从表需要list集合中的数据，可以直接将glist传入过去
						try {
							//由于有很多业务，这里必须经过biz业务类处理
							
							cbiz.inserttuiwei(shen.listcai, cai,come);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
								shen.listcai.clear();
								SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddhhmmss");
								shen.lblx.setText("CJ"+sdf.format(new Date()));
								shen.lblNewLabel_2.setText("0");
								shen.textField_4_1.setText("");
								 try {
									shen.updateTablecai();
									shen.updateTable();
									shen.updateTable2();
									//刷新表格
									//新增成功，调用父窗口的刷新方法，并关闭当前窗口
									JOptionPane.showMessageDialog(null, "退货商品，未审核");
									Caigou_shenhezhuantai_ui2.this.dispose();
								} catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
						
					}
				}
			});
			button.setFont(new Font("微软雅黑", Font.PLAIN, 25));
			button.setBounds(87, 300, 118, 35);
			panel.add(button);
			
			JButton button_1 = new JButton("取消");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Caigou_shenhezhuantai_ui2.this.dispose();
				}
			});
			button_1.setFont(new Font("微软雅黑", Font.PLAIN, 25));
			button_1.setBounds(322, 300, 118, 35);
			panel.add(button_1);
			
			JLabel label_1 = new JLabel("1、已审核状态单据保存后:不允许再修改:");
			label_1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
			label_1.setBounds(87, 176, 379, 30);
			panel.add(label_1);
			
			JLabel label_2 = new JLabel("2、未审核状态的单据不影响库存里和账务，允许修改。");
			label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
			label_2.setBounds(86, 229, 492, 30);
			panel.add(label_2);
			setVisible(true);
		}
	}
}
