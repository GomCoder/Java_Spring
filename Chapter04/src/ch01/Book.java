package ch01;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//toString()�� �������̵��Ͽ� ����� ���
	public String toSting() {
		return title + ", " + author;				
	}
}