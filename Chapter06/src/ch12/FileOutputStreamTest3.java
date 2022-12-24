package ch12;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos){ //java9부터 제공되는 기능
			
			byte[] bs = new byte[26];
			byte data = 65; //A의 아스키코드값
			
			for(int i = 0; i < bs.length; i++) { //A-Z까지 배열에 넣기
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); //배열의 특정 위치에서 부터 정해진 길이만큼 쓰기
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");		
	}	
}
