package cn.zktr.ui;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;
 
public class Denglu extends JFrame {
    JTextField jtf;// 用户名
    JPasswordField jpf;// 密码
    static final String INFO_USERNAME = "请输入用户名";
    static final String INFO_USERPSD = "请输入密码";
    JPanel jpMain;// 主面板
    static char defaultChar;// 默认的字符, 如果你喜欢星号, 那么设置为星号也可以
 
    public Denglu() {
    	setIconImage(Toolkit.getDefaultToolkit().getImage(Denglu.class.getResource("/img/logo544.png")));
        jpMain = new JPanel();
        jpMain.setBounds(0, 0, 721, 526);
        JPanel jp1 = new JPanel();
        jp1.setBackground(Color.WHITE);
        jp1.setBounds(121, 137, 475, 90);
        JLabel jl1 = new JLabel();
        jl1.setIcon(new ImageIcon(Denglu_ui2.class.getResource("/img/zz1.png")));
		//红色代码是添加图片默认生成的，直接复制
		ImageIcon icon =new ImageIcon(Denglu_ui2.class.getResource("/img/zz1.png"));
		//重置图片大小
		icon.setImage(icon.getImage().getScaledInstance(45, 40, Image.SCALE_DEFAULT));
		jl1.setIcon(icon);
        jl1.setBounds(44, 30, 52, 50);
        jtf = new JTextField(15);
        jtf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        //先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
        jtf.setBackground(new Color(0,0,0,0));
        jtf.setOpaque(false);
        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
        jtf.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
        jtf.setBounds(98, 30, 322, 50);
        jtf.setText(INFO_USERNAME);// 设置提示文字
        jtf.setForeground(Color.LIGHT_GRAY);// 设置提示文字的颜色
        jtfAddListener();// 给文本框添加焦点事件响应器
        jpMain.setLayout(null);
        jp1.setLayout(null);
        jp1.add(jl1);
        jp1.add(jtf);
        jpMain.add(jp1);
 
        JPanel jp2 = new JPanel();
        jp2.setBackground(Color.WHITE);
        jp2.setBounds(122, 227, 474, 106);
        JLabel jl2 = new JLabel();
        jl2.setIcon(new ImageIcon(Denglu_ui2.class.getResource("/img/zz2.png")));
		//红色代码是添加图片默认生成的，直接复制
		ImageIcon icon2 =new ImageIcon(Denglu_ui2.class.getResource("/img/zz2.png"));
		//重置图片大小
		icon2.setImage(icon2.getImage().getScaledInstance(45, 40, Image.SCALE_DEFAULT));
		jl2.setIcon(icon2);
        jl2.setBounds(46, 28, 48, 37);
        jpf = new JPasswordField(15);
        //先设置背景透明，new Color（r,g,b,透明度），类似HTML的rgba()
        jpf.setBackground(new Color(0,0,0,0));
        jpf.setOpaque(false);
        //重新设置边框，MatteBorder（上边框粗细、右、下、左、颜色）
        jpf.setBorder(new MatteBorder(0,0,2,0,new Color(255,215,0)));
        jpf.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        jpf.setBounds(95, 17, 324, 54);
        defaultChar = jpf.getEchoChar();// 获得默认的密码隐藏字符
        jpf.setEchoChar('\0');// \0 比较特殊, 密码框的文字会明文显示
        jpf.setText(INFO_USERPSD);// 设置密码框的内容
        jpf.setForeground(Color.LIGHT_GRAY);// 设置密码框的文字颜色
        jpfAddListener();// 给密码框添加焦点事件响应器
        getContentPane().setLayout(null);
        jp2.setLayout(null);
        jp2.add(jl2);
        jp2.add(jpf);
        jpMain.add(jp2);
 
        getContentPane().add(jpMain);
 
        JPanel jp3 = new JPanel();
        jp3.setBackground(Color.WHITE);
        jp3.setBounds(122, 332, 475, 72);
        jpMain.add(jp3);
        jp3.setLayout(null);
        JButton jb1 = new JButton("登    陆");
        jb1.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        jb1.setBounds(306, 10, 116, 34);
        jp3.add(jb1);
        
        JButton button = new JButton("忘记密码");
        button.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        button.setBounds(38, 10, 116, 34);
        jp3.add(button);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(Denglu_ui2.class.getResource("/img/logo.jpg")));
        //红色代码是添加图片默认生成的，直接复制
        ImageIcon icon3 = new ImageIcon(Denglu_ui2.class.getResource("/img/logo.jpg"));
        //重置图片大小
        icon3.setImage(icon3.getImage().getScaledInstance(1300, 600, Image.SCALE_DEFAULT));
        label.setIcon(icon3);
        label.setBounds(0, 0, 721, 530);
        jpMain.add(label);
//      //红色代码是添加图片默认生成的，直接复制
//        ImageIcon icon4 = new ImageIcon(Denglu_ui2.class.getResource("/img/1bc359w2e5159e6bd1.gif"));
//        //重置图片大小
//        icon4.setImage(icon4.getImage().getScaledInstance(1000, 300, Image.SCALE_DEFAULT));
 
        setTitle("登录窗口");// 标题
        setResizable(false);
        setSize(727, 555);// 窗口大小
        setLocationRelativeTo(null);// 窗口居中
//        setDefaultCloseOperation(EXIT_ON_CLOSE);// 窗口点击关闭时,退出程序
    }
    //文本框的焦点事件处理
    private void jtfAddListener() {
        jtf.addFocusListener(new FocusListener() {
 
            @Override
            public void focusLost(FocusEvent e) {// 失去焦点的时候
                if (jtf.getText().trim().equals("")) {// 如果没有任何输入 ,就提示用户输入
                    jtf.setText(INFO_USERNAME);
                    jtf.setForeground(Color.LIGHT_GRAY);
                }
            }
 
            @Override
            public void focusGained(FocusEvent e) {// 获得焦点的时候
                if (jtf.getText().trim().equals(INFO_USERNAME)) {// 如果是提示文字 ,就清空提示文字
                    jtf.setText("");
                    jtf.setForeground(Color.BLACK);
                }
            }
        });
    }
 
    //密码框的焦点事件处理
    private void jpfAddListener() {
        jpf.addFocusListener(new FocusListener() {
            @Override
            public void focusLost(FocusEvent e) {// 失去焦点的时候
                String pswd = new String(jpf.getPassword()).trim();
                if (pswd.equals("")) {// 如果没有输入密码. 就用明文 提示用户输入密码
                    jpf.setEchoChar('\0');
                    jpf.setText(INFO_USERPSD);
                    jpf.setForeground(Color.LIGHT_GRAY);
                }
            }
 
            @Override
            public void focusGained(FocusEvent e) {// 获得焦点的时候
                String pswd = new String(jpf.getPassword()).trim();
                if (pswd.equals(INFO_USERPSD)) {// 如果是密码提示文字 ,那么就清空文字, 并设置密文显示
                    jpf.setText("");
                    jpf.setEchoChar(defaultChar);
                    jpf.setForeground(Color.BLACK);
                }
            }
        });
    }
 
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            	Denglu_ui2 frame = new Denglu_ui2();
                frame.setVisible(true);
                frame.jpMain.requestFocus();// 让面板获得焦点,这样两个提示可以同时显示出来
            }
        });
    }
}