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
			f.setTitle("һ����Ϳ��");
			f.setDefaultCloseOperation(3);
			
			//���߰�ť��
			JToolBar tb = new JToolBar();
			JButton bSpend = new JButton("����һ��");
			JButton bRecord = new JButton("��һ��");
			JButton bCategory = new JButton("���ѷ���");
			JButton bReport = new JButton("�����ѱ���");
			JButton bConfig = new JButton("����");
			JButton BBackup = new JButton("����");
			JButton bRecover = new JButton("�ָ�");
			
			tb.add(bSpend);
			tb.add(bRecord);
			tb.add(bCategory);
			tb.add(bReport);
			tb.add(bSpend);
			tb.add(bConfig);
			tb.add(BBackup);
			tb.add(bRecover);
			
			//����λ�÷ֲ�
			f.setLayout(new BorderLayout());
			f.add(tb,BorderLayout.NORTH);
			f.add(new JPanel(),BorderLayout.CENTER);
			f.setVisible(true);
		}
		
}
