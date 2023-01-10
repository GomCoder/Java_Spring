package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("a.txt"); //프로젝트 폴더에 파일을 생성할 것
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
			System.out.println("항상 수행 됩니다.");
		}
		System.out.println("여기도 수행됩니다.");		
	}
}
