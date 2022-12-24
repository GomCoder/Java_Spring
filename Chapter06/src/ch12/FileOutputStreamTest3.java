package ch12;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("output3.txt", true);
		
		try(fos){ //java9���� �����Ǵ� ���
			
			byte[] bs = new byte[26];
			byte data = 65; //A�� �ƽ�Ű�ڵ尪
			
			for(int i = 0; i < bs.length; i++) { //A-Z���� �迭�� �ֱ�
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10); //�迭�� Ư�� ��ġ���� ���� ������ ���̸�ŭ ����
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");		
	}	
}
