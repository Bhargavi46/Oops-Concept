package Oops;

public class Automation extends MultipleLanguage {

	public void selenium()  {
		System.out.println("selenium");
	}
	public void java() {
		System.out.println("java");	
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}
	public static void main(String[] args) {
		Automation obj=new Automation();
		obj.java();
		obj.selenium();
		obj.python();
		obj.ruby();
	}
	

}
