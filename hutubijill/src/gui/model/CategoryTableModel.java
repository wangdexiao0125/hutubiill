package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CategoryTableModel implements TableModel{
	String[]  columnNames = new String[] {"��������","���Ѵ���"};
	List<String> cs = new ArrayList<String>();
	public CategoryTableModel() {
		cs.add("����");
		cs.add("��ͨ");
		cs.add("ס��");
		cs.add("����");
		
	}
	@Override
	public int getRowCount() {
		// TODO �Զ����ɵķ������
		return cs.size();
	}

	@Override
	public int getColumnCount() {
		// TODO �Զ����ɵķ������
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO �Զ����ɵķ������
		return columnNames[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO �Զ����ɵķ������
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO �Զ����ɵķ������
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO �Զ����ɵķ������
		if (columnIndex ==0) {
			return cs.get(rowIndex);
		}
		if (columnIndex==1) {
			return 0;
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO �Զ����ɵķ������
		
	}

}
