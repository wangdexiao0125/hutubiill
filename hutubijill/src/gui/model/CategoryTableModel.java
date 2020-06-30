package gui.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CategoryTableModel implements TableModel{
	String[]  columnNames = new String[] {"分类名称","消费次数"};
	List<String> cs = new ArrayList<String>();
	public CategoryTableModel() {
		cs.add("餐饮");
		cs.add("交通");
		cs.add("住宿");
		cs.add("话费");
		
	}
	@Override
	public int getRowCount() {
		// TODO 自动生成的方法存根
		return cs.size();
	}

	@Override
	public int getColumnCount() {
		// TODO 自动生成的方法存根
		return columnNames.length;
	}

	@Override
	public String getColumnName(int columnIndex) {
		// TODO 自动生成的方法存根
		return columnNames[columnIndex];
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		// TODO 自动生成的方法存根
		return String.class;
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO 自动生成的方法存根
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
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		// TODO 自动生成的方法存根
		
	}

}
