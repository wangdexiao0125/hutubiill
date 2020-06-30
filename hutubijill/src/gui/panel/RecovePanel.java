package gui.panel;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.ColorUtil;
import util.GUIUtil;

public class RecovePanel extends JPanel{
	static {
		GUIUtil.userLNF();
	}
	public static RecovePanel instance = new RecovePanel();
	
	public JButton bSubmit = new JButton("»Ö¸´");
	
	private RecovePanel() {
		GUIUtil.setColor(ColorUtil.grayColor, bSubmit);
		this.add(bSubmit);
	}
	public static void main(String[] args) {
		GUIUtil.showPanel(RecovePanel.instance);
	}
}
