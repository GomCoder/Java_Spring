package ch11;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� �븦 ���� [Enter]�� ��������.");
		
		int i;
		
		try {
			InputStreamReader irs = new InputStreamReader(System.in); //InputStreamReader(������Ʈ��)�� �̿��Ͽ� �ѱ� �Է¿� ���� ���ڵ� ó��
			while((i = irs.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
