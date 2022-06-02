package week3.day2;

public class Automation extends MultipleLanguage{
	
	public static void main(String[] args) {
		Automation auto=new Automation();
		auto.ruby();
		auto.Selenium();
		auto.java();
		auto.python();
	}

	public void Selenium() {
		System.out.println("Selenium");
		
	}

	public void java() {
		System.out.println("Java");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

	

}
