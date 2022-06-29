package week3.day1;

public class Automation implements Language,TestTool {

	public static void main(String[] args) {
		Automation obj= new Automation();
		obj.Java();
		obj.Selenium();
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

}
