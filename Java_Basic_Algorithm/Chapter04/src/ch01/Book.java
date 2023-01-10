package ch01;

public class Book {
	private String title;
	private String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	//toString()을 오버라이딩하여 사용한 경우
	public String toSting() {
		return title + ", " + author;				
	}
}
