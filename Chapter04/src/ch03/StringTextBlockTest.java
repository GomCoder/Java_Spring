package ch03;

public class StringTextBlockTest {

	public static void main(String[] args) {
		String textBlocks = """
					Hello, 
					hi, 
					how r u""";
		
		System.out.println(textBlocks);		
		System.out.println(getBlockOIfHtml());
	}
	
	public static String getBlockOIfHtml() {
		return """
				<html>
					<body>
						<span>example test</span>
					</body>
				</html>
				""";
	}

}
