package gui.panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.scene.shape.CircleBuilder;
import util.CircleProgressBar;
import util.ColorUtil;
import util.GUIUtil;

public class SpendPanel extends JPanel{
	static {
		GUIUtil.userLNF();
	}
	public static SpendPanel instance = new SpendPanel();
	
	public JLabel lMonthSpend = new JLabel("本月消费");
	public JLabel lTodaySpend = new JLabel("今日消费");
	public JLabel lAvgSpendPerDay = new JLabel("日均消费");
	public JLabel lMonthleft = new JLabel("本月剩余");
	public JLabel lDayAvgAvailable = new JLabel("日均可用");
	public JLabel lMonthLeftDay = new JLabel("距离月末");
	
	public JLabel vMonthSpend = new JLabel("￥2300");
	public JLabel vTodaySpend = new JLabel("￥200");
	public JLabel vAvgSpendPerDay = new JLabel("￥100");
	public JLabel vMonthleft = new JLabel("￥1000");
	public JLabel vDayAvgAvailable = new JLabel("￥50");
	public JLabel vMonthLeftDay = new JLabel("15天");
	//环形图标
	CircleProgressBar bar;
	
	public SpendPanel() {
		this.setLayout(new BorderLayout());
		bar = new CircleProgressBar();
		bar.setBackgroundColor(ColorUtil.blueColor);
		GUIUtil.setColor(ColorUtil.grayColor, lMonthSpend,lTodaySpend,lAvgSpendPerDay,lMonthleft,lDayAvgAvailable,lMonthLeftDay
				,vAvgSpendPerDay,vMonthleft,vDayAvgAvailable,vMonthLeftDay);
		
		GUIUtil.setColor(ColorUtil.blueColor,vMonthSpend,vTodaySpend);
		vMonthSpend.setFont(new Font("微软雅黑", Font.BOLD, 23));
		vTodaySpend.setFont(new Font("微软雅黑", Font.BOLD, 23));
		this.add(center(),BorderLayout.CENTER);
		this.add(south(),BorderLayout.SOUTH);

	}
	private JPanel center() {
		JPanel p = new JPanel();
		p.setLayout(new BorderLayout());
		p.add(west(),BorderLayout.WEST);
		p.add(getbar(),BorderLayout.CENTER);
		return p;
	}
	private JPanel getbar() {
		return bar;
	}
	private Component west() {
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(4, 1));
		p.add(lMonthSpend);
		p.add(vMonthSpend);
		p.add(lTodaySpend);
		p.add(vTodaySpend);
		return p;
	}
	private JPanel south() {
		JPanel p  = new JPanel();
		p.setLayout(new GridLayout(2,4));
		p.add(lAvgSpendPerDay);
		p.add(lMonthleft);
		p.add(lDayAvgAvailable);
		p.add(lMonthLeftDay);
		p.add(vAvgSpendPerDay);
		p.add(vMonthleft);
		p.add(vDayAvgAvailable);
		p.add(vMonthLeftDay);
		return p;
		
	}
	
	public static void main(String[] args) {
		GUIUtil.showPanel(SpendPanel.instance);
	}
	
	
}
