package gui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.jdesktop.swingx.JXDatePicker;

import entity.Category;
import gui.model.CategoryComboBoxModel;
import listener.RecordListener;
import service.CategoryService;
import util.ColorUtil;
import util.GUIUtil;

public class RecordPanel extends WorkingPanel{
	static {
		GUIUtil.userLNF();
	}
	public static RecordPanel instance = new RecordPanel();
	
	 JLabel lSpend = new JLabel("����(��)");
	 JLabel lCategory = new JLabel("����");
	 JLabel lComment = new JLabel("��ע");
	 JLabel lDate = new JLabel("����");
	 
	 public JTextField tfSpend = new JTextField("0");
	 
	 public CategoryComboBoxModel cbModel  = new CategoryComboBoxModel();
	 public JComboBox<Category> cbCategory = new JComboBox<Category>(cbModel);
	 public JTextField  tfComment = new JTextField("");
	 public JXDatePicker dateprick = new JXDatePicker(new Date());
	 
	 JButton bSubmit = new JButton("��һ��");
	 
	 private RecordPanel() {
		 GUIUtil.setColor(ColorUtil.grayColor, lSpend,lCategory,lComment,lDate);
		 GUIUtil.setColor(ColorUtil.blueColor, bSubmit);
		 JPanel pInput = new JPanel();
		 JPanel pSubmit = new JPanel();
		 pInput.setLayout(new GridLayout(4,2,40,40));
		 
		 pInput.add(lSpend);
		 pInput.add(tfSpend);
		 pInput.add(lCategory);
		 pInput.add(cbCategory);
		 pInput.add(lComment);
		 pInput.add(tfComment);
		 pInput.add(lDate);
		 pInput.add(dateprick);
		 
		 pSubmit.add(bSubmit);
		 this.setLayout(new BorderLayout());
		 this.add(pInput,BorderLayout.NORTH);
		 this.add(pSubmit,BorderLayout.CENTER);
		 
		 addListener();
	 }
	 
	 public static void main(String[] args) {
		GUIUtil.showPanel(RecordPanel.instance);
	}

	public Category getSelectedCategory() {
		return (Category) cbModel.getSelectedItem();
	}

	@Override
	public void updateData() {
		cbModel.cs = new CategoryService().list();
		cbCategory.updateUI();
		resetInput();
		tfSpend.grabFocus();
		
	}
	//�÷���ʱ������󷵻س�ʼ�����Ĭ��ֵ��
	public void resetInput() {
		tfComment.setText("");
		tfSpend.setText("0");
		dateprick.setDate(new  Date());
		if (cbModel.cs.size()!=0) {
			cbCategory.setSelectedIndex(0);
		}
	}

	@Override
	public void addListener() {
		RecordListener l = new RecordListener();
		bSubmit.addActionListener(l);
		
	}
	 
}
