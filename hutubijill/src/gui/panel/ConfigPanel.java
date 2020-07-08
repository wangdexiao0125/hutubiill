package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.ConfigListener;
import service.ConfigService;
import util.ColorUtil;
import util.GUIUtil;

/*
 * 设置月消费总额和 mysql 数据库的面板
 */
public class ConfigPanel extends WorkingPanel {
	static {
		GUIUtil.userLNF();
	}
	public static ConfigPanel instance = new ConfigPanel();
	JLabel lBudget = new JLabel("本月预算(￥)");
	public JTextField tfBudget = new JTextField(0);
	
	JLabel lMysql = new JLabel("mysql安装目录");
	public JTextField  tfMysqlPath = new JTextField("");
	
	public JButton bsubmit = new JButton("更新");
	
	public ConfigPanel() {
		GUIUtil.setColor(ColorUtil.grayColor, lBudget,lMysql);
		GUIUtil.setColor(ColorUtil.blueColor, bsubmit);
		
		JPanel pInput = new JPanel();
		JPanel pSubmit  = new JPanel();
		pInput.setLayout(new GridLayout(4,1,40,40));
		pInput.add(lBudget);
		pInput.add(tfBudget);
		pInput.add(lMysql);
		pInput.add(tfMysqlPath);
		pSubmit.add(bsubmit);
		this.setLayout(new BorderLayout());
		this.add(pInput,BorderLayout.NORTH);
		this.add(pSubmit,BorderLayout.CENTER);
		
		addListener();
	}
	
	public  void addListener() {
		ConfigListener cl = new ConfigListener();
		bsubmit.addActionListener(cl);
	}
	public static void main(String[] args) {
		GUIUtil.showPanel(ConfigPanel.instance);
	}

	@Override
	public void updateData() {
		String budget = ConfigService.get(ConfigService.budget);
		String mysqlpath = ConfigService.get(ConfigService.mysqlPath);
		tfBudget.setText(budget);
		tfMysqlPath.setText(mysqlpath);
		tfBudget.grabFocus();
		
	}
}
