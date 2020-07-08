package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;

import entity.Category;
import service.CategoryService;
/*
 * ���������˵�
 */

public class CategoryComboBoxModel implements ComboBoxModel<Category>{
	public List<Category> cs = new CategoryService().list();
	//��ʾ������Ĭ��ֵ
	public Category c;
	
	public CategoryComboBoxModel() {
		if (!cs.isEmpty()) {
			c = cs.get(0);			
		}
	}

	@Override
	public int getSize() {
		//�������С�����Ǽ��ϴ�С
		return cs.size();
	}

	@Override
	
	public Category getElementAt(int index) {
		// ָ��λ�õ�����
		return cs.get(index);
	}

	@Override
	public void addListDataListener(ListDataListener l) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void removeListDataListener(ListDataListener l) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void setSelectedItem(Object anItem) {
		//������ѡ����һ���������Ϣ���ͻ�����������
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
