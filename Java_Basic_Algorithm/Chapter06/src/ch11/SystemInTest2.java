package ch11;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 대를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); //InputStreamReader(보조스트림)을 이용하여 한글 입력에 대한 인코딩 처리
			while((i = irs.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
