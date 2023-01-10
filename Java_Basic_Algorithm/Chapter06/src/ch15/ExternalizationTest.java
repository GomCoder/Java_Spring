package ch15;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person1 implements Externalizable{
	
	String name;
	String job;
	
	public Person1() { 
		
	}
	
	public Person1(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + ", " + job;				
	}

	@Override
	public void writeExternal(ObjectOutput obj) throws IOException {
		// TODO Auto-generated method stub
		obj.writeUTF(name);
		obj.writeUTF(job);
	}

	@Override
	public void readExternal(ObjectInput obj) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = obj.readUTF();
		job = obj.readUTF();
	}	
}


public class ExternalizationTest {

	public static void main(String[] args) {
		
		//��ü ����
		Person1 personLee = new Person1("�̼���", "��ǥ�̻�");
		Person1 personKim = new Person1("������", "���̻�");
		
		//���Ͽ� ���� - ����ȭ
		try(FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personLee);
			oos.writeObject(personKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}
		
		//������ �б� - ����
		try(FileInputStream fos = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fos)){
			
			Person1 pLee = (Person1)ois.readObject();
			Person1 pKim = (Person1)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
			
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}