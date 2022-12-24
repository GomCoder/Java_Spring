package ch14;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdStreamTest {

	public static void main(String[] args) {
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
									FileOutputStream fos = new FileOutputStream("copy.zip");
									BufferedInputStream bis = new BufferedInputStream(fis);
									BufferedOutputStream bos = new BufferedOutputStream(fos)){
			millisecond = System.currentTimeMillis();
			
			int i;
			
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는 데 " + millisecond + " milliseconds 소요되었습니다.");
	}

	
	/* 소켓 프로그램에서의 보조 스트림 사용 
	 * Socket socket = New Socket();
	 * BufferedReader br = New BufferedReader(New InputStreamReader(socket.getInputStream());
	 * br.readLine(); 한 줄씩 읽기
	 */
	
	
}
