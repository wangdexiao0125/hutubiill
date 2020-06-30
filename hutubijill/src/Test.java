import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingWorker;

import util.CenterPanel;
import util.CircleProgressBar;
import util.ColorUtil;
import util.GUIUtil;


public class Test {
	public static void main(String[] args) {
		GUIUtil.userLNF();
		//面板
		JPanel p = new JPanel();
		//进度条组件
		CircleProgressBar cpb = new CircleProgressBar();
		cpb.setBackgroundColor(ColorUtil.backgroundColor);
		cpb.setProgress(0);
		//按钮
		JButton b = new JButton("点击");
		//添加组件
		p.setLayout(new BorderLayout());
		p.add(cpb,BorderLayout.CENTER);
		p.add(b,BorderLayout.SOUTH);
		//显示面板看看
		GUIUtil.showPanel(p);
		
		//给按钮增加监听
		b.addActionListener(new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SwingWorker() {
					@Override
					protected Object doInBackground() throws Exception {
						for (int i = 0; i < 100; i++) {
							cpb.setProgress(i+1);
							cpb.setForegroundColor(ColorUtil.getByPercentage(i+1));
							try {
								
								Thread.sleep(100);
							} catch (Exception e2) {
								e2.printStackTrace();
							}
							
						}
						return null;
					}
				}.execute();;
				
			}
		});
		
		
	}
}	
