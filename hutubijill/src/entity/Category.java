package entity;

public class Category {
	public int id;
	public String name;
	public int recordNumber; //临时查找对应消费类型的消费次数
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRecordNumber() {
		return recordNumber;
	}
	public void setRecordNumber(int recordNumber) {
		this.recordNumber = recordNumber;
	}
	@Override
	public String toString() {
		return name;
	}
	
}
