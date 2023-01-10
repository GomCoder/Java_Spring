 package ch12;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {

		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			
			while((i = fis.read(bs)) != -1) {
				/*
				for(byte b : bs) {
					System.out.println((char)b);
				}
				*/
				//읽은 배열을 출력함
				for(int k = 0; k < i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i  + "바이트 읽음");
				
			}
			/*
			 * 읽어들이는 바이트 길이를 설정할 수 있음
			while((i = fis.read(bs, 1, 9)) != -1) {
				for(int k = 0; k < i; k++) {
					System.out.pritln((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
			*/
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}
