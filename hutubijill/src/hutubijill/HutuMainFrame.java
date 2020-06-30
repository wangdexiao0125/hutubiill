package hutubijill;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class HutuMainFrame {
		public static void main(String[] args) {
			JFrame f = new JFrame();
			f.setBounds(100, 100, 500, 450);
			f.setTitle("一本糊涂账");
			f.setDefaultCloseOperation(3);
			
			//工具按钮栏
			JToolBar tb = new JToolBar();
			JButton bSpend = new JButton("消费一览");
			JButton bRecord = new JButton("记一笔");
			JButton bCategory = new JButton("消费分类");
			JButton bReport = new JButton("月消费报表");
			JButton bConfig = new JButton("设置");
			JButton BBackup = new JButton("备份");
			JButton bRecover = new JButton("恢复");
			
			tb.add(bSpend);
			tb.add(bRecord);
			tb.add(bCategory);
			tb.add(bReport);
			tb.add(bSpend);
			tb.add(bConfig);
			tb.add(BBackup);
			tb.add(bRecover);
			
			//设置位置分布
			f.setLayout(new BorderLayout());
			f.add(tb,BorderLayout.NORTH);
			f.add(new JPanel(),BorderLayout.CENTER);
			f.setVisible(true);
		}
		
}
