package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import entity.Category;
import service.CategoryService;
/*
 * 分类下拉菜单
 */

public class CategoryComboBoxModel implements ComboBoxModel<Category>{
	public List<Category> cs = new CategoryService().list();
	//表示下拉框默认值
	public Category c;
	
	public CategoryComboBoxModel() {
		if (!cs.isEmpty()) {
			c = cs.get(0);			
		}
	}

	@Override
	public int getSize() {
		//下拉框大小，就是集合大小
		return cs.size();
	}

	@Override
	
	public Category getElementAt(int index) {
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
			c= (Category) anItem;
		
	}

	@Override
	public Object getSelectedItem() {
		if (!cs.isEmpty()) {
			return c;			
		}
		return null;
	}
}
