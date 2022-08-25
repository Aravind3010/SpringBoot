package task;
public class Class1 {
public static void main(String[] args) {
		Class2 second=new Class2();
		String data=second.method2();
		wordCount(data);
	}
	public static void wordCount(String data) {
		System.out.println("----WordCount----");
		int countWord=1;

		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)==' ' ) 
			{
				countWord++;
			}
		}
		System.out.println("The total number of words are : "+countWord);
	}
	
	public String demo1() {
		demo1();
		return null;
	}
	public String demo2() {
		return null;
	}
}
