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
	 * �������������Ƿ�Ϊ�� 
	 */
	public static boolean checkEmpty(JTextField tf,String input) {
		String text = tf.getText().trim();
		if (text.length() ==0) {
			JOptionPane.showMessageDialog(null, input+"����Ϊ��");
			tf.grabFocus();
			return false;
		}
		return true;
	}
	
	/*
	 * ������������Ƿ�������
	 */
	public static boolean checkNumber(JTextField tf,String input) {
		if (!checkEmpty(tf, input)) {
			return false;  //���Ϊ�գ����뷵��false;
		}
		String text = tf.getText().trim();
		try {
			Integer.parseInt(text);
			return true;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "�������ֵ�");
			tf.grabFocus();
			return false;
		}
	}
	
	/*
	 * ���һ�������������Ƿ�����
	 * 
	 */
	public static boolean checkZero(JTextField tf,String input) {
		if (!checkEmpty(tf, input)) {
			return false;
		}
		String text = tf.getText().trim();
		if (Integer.parseInt(text)==0) {
			JOptionPane.showMessageDialog(null, "������ֵ�");
			return false;
		}
		return true;
	}
	
	/*
	 * ������������ǰ��ɫ
	 */
	public static void setColor(Color color,Component...cs) {
		for (Component c : cs) {
			c.setForeground(color);
		} 
	}
	
	/*
	 * ����ť����ͼ����ı��Լ���ʾ��
	 * 
	 */
	public static void setImageIcon(JButton b,String filename,String tip) {
		 ImageIcon i = new ImageIcon(new File(imageFolder, filename).getAbsolutePath());
		 b.setIcon(i);
		 b.setPreferredSize(new Dimension(61, 81));
		 b.setToolTipText(tip);
		 b.setVerticalTextPosition(JButton.BOTTOM);  //���ñ�ǩ���ı������ͼ��ٵ�ˮƽ��λ��
		 b.setHorizontalTextPosition(JButton.CENTER); //���ñ�ǩ���ı������ͼ��Ĵ�ֱλ��
		 b.setText(tip);
	}
	
	/*
	 * ʹ��Ƥ��
	 */
	public static void userLNF() {
		try {
			javax.swing.UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} 
	}
	
	/*
	 * ���������������ʽ
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
