package util;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
/*
 * 居中容器
 */
import javax.swing.JPanel;

import gui.panel.WorkingPanel;

public class CenterPanel extends JPanel{
	private double rate; //拉伸比列
	private JComponent c; //要显示的组件
	private boolean strech; //是否拉伸
	
	public CenterPanel(double rate, boolean strech) {
		super();
		this.rate = rate;
		this.strech = strech;
		this.setLayout(null);
	}

	public CenterPanel(double rate) {
		this(rate, true);
	}
	
	public void repaint() {
		if (null!=c) {
			Dimension containerSize = this.getSize();
			Dimension compoentSize = c.getPreferredSize();
			
			if (strech) {
				c.setSize((int)(containerSize.width* rate),(int)(containerSize.height*rate));
			}else {
				c.setSize(compoentSize);
			}
			c.setLocation(containerSize.width/2 -c.getWidth() /2, containerSize.height/2
					-c.getHeight() /2);
		}
		super.repaint();
	}
	
	public void show(JComponent p) {
		this.c = p;
		Component[] cs = getComponents();
		for (Component c : cs) {
			remove(c);
		}
		if (p instanceof WorkingPanel) {
			((WorkingPanel) p).updateData();
		}
		add(p);
		this.updateUI();
	}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(200,200);
		f.setLocationRelativeTo(null);
		CenterPanel cp = new CenterPanel(0.5,true);
		f.setContentPane(cp);
		f.setDefaultCloseOperation(3);
		f.setVisible(true);
		JButton b = new JButton("abc");
		cp.show(b);
		
	}
}
