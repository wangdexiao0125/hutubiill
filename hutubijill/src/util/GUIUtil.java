package util;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UnsupportedLookAndFeelException;

import sun.net.www.content.image.jpeg;



public class GUIUtil {
	private static String imageFolder="D:\\img\\img";
//	static {
//		imageFolder =System.getProperty("user.dir")+"\\img";
//	}
	
	
	/*
	 * 检查输入框内容是否为空 
	 */
	public static boolean checkEmpty(JTextField tf,String input) {
		String text = tf.getText().trim();
		if (text.length() ==0) {
			JOptionPane.showMessageDialog(null, input+"不能为空");
			tf.grabFocus();
			return false;
		}
		return true;
	}
	
	/*
	 * 检查输入内容是否是数字
	 */
	public static boolean checkNumber(JTextField tf,String input) {
		if (!checkEmpty(tf, input)) {
			return false;  //如果为空，进入返回false;
		}
		String text = tf.getText().trim();
		try {
			Integer.parseInt(text);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "搞整数兄弟");
			tf.grabFocus();
			return false;
		}
	}
	
	/*
	 * 检查一个输入框的内容是否是零
	 * 
	 */
	public static boolean checkZero(JTextField tf,String input) {
		if (!checkEmpty(tf, input)) {
			return false;
		}
		String text = tf.getText().trim();
		if (Integer.parseInt(text)==0) {
			JOptionPane.showMessageDialog(null, "别搞零兄弟");
			return false;
		}
		return true;
	}
	
	/*
	 * 给多个组件设置前景色
	 */
	public static void setColor(Color color,Component...cs) {
		for (Component c : cs) {
			c.setForeground(color);
		} 
	}
	
	/*
	 * 给按钮设置图标和文本以及提示字
	 * 
	 */
	public static void setImageIcon(JButton b,String filename,String tip) {
		 ImageIcon i = new ImageIcon(new File(imageFolder, filename).getAbsolutePath());
		 b.setIcon(i);
		 b.setPreferredSize(new Dimension(61, 81));
		 b.setToolTipText(tip);
		 b.setVerticalTextPosition(JButton.BOTTOM);  //设置标签的文本相对其图像百的水平度位置
		 b.setHorizontalTextPosition(JButton.CENTER); //设置标签的文本相对其图像的垂直位置
		 b.setText(tip);
	}
	
	/*
	 * 使用皮肤
	 */
	public static void userLNF() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
	}
	
	/*
	 * 测试用来看面板样式
	 */
	public static void showPanel(JPanel p,double strech) {
		GUIUtil.userLNF();
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setLocationRelativeTo(null);
		CenterPanel cp = new CenterPanel(strech);
		f.setContentPane(cp);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		cp.show(p);
	}
	public static void showPanel(JPanel p) {
		showPanel(p, 0.85);
	}
	
	public static void main(String[] args) {
		System.out.println(new File(imageFolder, "backup.png").getAbsolutePath());
	}
}
