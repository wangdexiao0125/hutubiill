package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataListener;
/*
 * ���������˵�
 */

public class CategoryComboBoxModel implements ComboBoxModel<String>{
	public List<String> cs = new ArrayList<String>();
	//��ʾ������Ĭ��ֵ
	String c;
	
	public CategoryComboBoxModel() {
		cs.add("����");
		cs.add("��ͨ");
		cs.add("ס��");
		cs.add("����");
		c = cs.get(0);
	}

	@Override
	public int getSize() {
		//�������С�����Ǽ��ϴ�С
		return cs.size();
	}

	@Override
	
	public String getElementAt(int index) {
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
			c= (String) anItem;
		
	}

	@Override
	public Object getSelectedItem() {
		// TODO �Զ����ɵķ������
		return c;
	}
}
