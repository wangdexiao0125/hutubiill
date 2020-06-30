package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
/*
 * 分类下拉菜单
 */

public class CategoryComboBoxModel implements ComboBoxModel<String>{
	public List<String> cs = new ArrayList<String>();
	//表示下拉框默认值
	String c;
	
	public CategoryComboBoxModel() {
		cs.add("餐饮");
		cs.add("交通");
		cs.add("住宿");
		cs.add("话费");
		c = cs.get(0);
	}

	@Override
	public int getSize() {
		//下拉框大小，就是集合大小
		return cs.size();
	}

	@Override
	
	public String getElementAt(int index) {
		// 指定位置的数据
		return cs.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		//当界面选中了一下拉框的信息，就会调用这个方法
			c= (String) anItem;
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO 自动生成的方法存根
		return c;
	}
}
