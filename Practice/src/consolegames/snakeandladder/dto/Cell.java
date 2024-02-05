package consolegames.snakeandladder.dto;

public class Cell {
 private String cellName;
 private int head;
 private int tail;
public String getCellName() {
	return cellName;
}
public void setCellName(String cellName) {
	this.cellName = cellName;
}
public int getHead() {
	return head;
}
public void setHead(int head) {
	this.head = head;
}
public int getTail() {
	return tail;
}
public void setTail(int tail) {
	this.tail = tail;
}
}
