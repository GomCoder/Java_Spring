package ch11;

public class MakeReport {
	StringBuffer buffer = new StringBuffer();
	
	private String line = "======================================\n";
	private String title = "이름\t주소\t\t전화번호	\n";
	
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("James \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYork US \t");
		buffer.append("010-7777-0987\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() { //Client에게 제공되는 메서드
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString();
	}
	
}
