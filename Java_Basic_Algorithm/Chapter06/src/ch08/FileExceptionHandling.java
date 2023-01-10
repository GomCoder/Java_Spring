package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.txt"); //������Ʈ ������ ������ ������ ��
			System.out.println("File is exist");
		} catch(FileNotFoundException e) {
			System.out.println(e);
		} finally {
			if(fis != null ) {
				try {
					fis.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("�׻� ���� �˴ϴ�.");
		}
		System.out.println("���⵵ ����˴ϴ�.");		
	}
}
