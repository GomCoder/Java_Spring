package ch21;

public class BookArrayTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�¹���1", "������");
		library[1] = new Book("�¹���2", "������");
		library[2] = new Book("�¹���3", "������");
		library[3] = new Book("�¹���4", "������");
		library[4] = new Book("�¹���5", "������");
		
		//1. ���� ����
		//System.arraycopy(library, 0, copylibrary, 0, 5);
		
		//2. ���� ����
		copyLibrary[0] = new Book();
		copyLibrary[1] = new Book();
		copyLibrary[2] = new Book();
		copyLibrary[3] = new Book();
		copyLibrary[4] = new Book();
		
//		System.out.println("======copy library=====");
//		for(int i = 0; i < copyLibrary.length; i++) {
//			System.out.println(copyLibrary[i]);
//			copyLibrary[i].showBookInfo();
//		}
		
		for(int i = 0; i < library.length; i++) {
			copyLibrary[i].setTitle(library[i].getTitle());
			copyLibrary[i].setAuthor(library[i].getAuthor());
		}
		
		
		library[0].setTitle("����");
		library[0].setAuthor("�ڿϼ�");
		
		System.out.println("========library=======");
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
		System.out.println("======copy library=====");
		for(int i = 0; i < copyLibrary.length; i++) {
			System.out.println(copyLibrary[i]);
			copyLibrary[i].showBookInfo();
		}
		
		
	}

}
