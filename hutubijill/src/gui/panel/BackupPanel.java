package gui.panel;

import javax.swing.JButton;
import javax.swing.JPanel;

import util.ColorUtil;
import util.GUIUtil;

public class BackupPanel extends JPanel{
	static {
		GUIUtil.userLNF();
	}
	public static BackupPanel instance = new BackupPanel();
	
	public JButton bSubmit = new JButton("±¸·Ý");
	
	private BackupPanel() {
		GUIUtil.setColor(ColorUtil.grayColor, bSubmit);
		this.add(bSubmit);
	}
	public static void main(String[] args) {
		GUIUtil.showPanel(BackupPanel.instance);
	}
}
