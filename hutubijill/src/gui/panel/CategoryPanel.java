package gui.panel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entity.Category;
import gui.model.CategoryTableModel;import javafx.scene.layout.Border;
import listener.CategoryListener;
import service.CategoryService;
import util.ColorUtil;
import util.GUIUtil;

public class CategoryPanel extends WorkingPanel{
	static {
		GUIUtil.userLNF();
	}
	public static CategoryPanel instance = new CategoryPanel();
	
	public JButton bAdd = new JButton("ÐÂÔö");
	public JButton bEdit = new JButton("±à¼­");
	public JButton bDel = new JButton("É¾³ý");
	
	public CategoryTableModel ctm = new CategoryTableModel();
	public JTable t = new JTable(ctm);
	
	private  CategoryPanel() {
		GUIUtil.setColor(ColorUtil.blueColor, bAdd,bEdit,bDel);
		JScrollPane sp = new JScrollPane(t);
		JPanel pSubmit = new JPanel();
		pSubmit.add(bAdd);
		pSubmit.add(bEdit);
		pSubmit.add(bDel);
		this.setLayout(new BorderLayout());
		this.add(sp,BorderLayout.CENTER);
		this.add(pSubmit,BorderLayout.SOUTH);
		addListener();
		
	}
	public Category getSelectedCategory() {
			int index = t.getSelectedRow();
		
	
			return  ctm.cs.get(index);
		
			
	}
	public void updateData() {
		ctm.cs = new CategoryService().list();
		t.updateUI();
		t.getSelectionModel().setSelectionInterval(0, 0);
		if (ctm.cs.size() ==0) {
			bEdit.setEnabled(false);
			bDel.setEnabled(false);
		}else {
			bEdit.setEnabled(true);
			bDel.setEnabled(true);
		}
	}
	public void addListener() {
		CategoryListener l = new CategoryListener();
		bAdd.addActionListener(l);
		bEdit.addActionListener(l);
		bDel.addActionListener(l);
	}
	public static void main(String[] args) {
		GUIUtil.showPanel(CategoryPanel.instance);
	}
	
	
}
