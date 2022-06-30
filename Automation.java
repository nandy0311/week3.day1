package week3.day1;

public class Automation extends MultipleLanguage implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj= new Automation();
		obj.Java();
		obj.Selenium();
		obj.ruby();
	//	Language obj1= new Automation();
	
	}

	@Override
	public void Java() {
		System.out.println("Java is a lanaguage- overriden from Language interface");
		
	}

	@Override
	public void Selenium() {
		System.out.println("Selenium is a tool-overriden from testing tool interface");
	}

	@Override
	public void python() {
		System.out.println("Python is a language -overriden from Multiple Language parent class");
		
	}

}
