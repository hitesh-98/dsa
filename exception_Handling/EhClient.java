package exception_Handling;

public class EhClient {

	public static void main(String[] args) {
		ExceptionHandling eh = new ExceptionHandling("Hitesh", 19);
		
		System.out.println(eh.name);
		
		method2(eh);
		
		System.out.println(eh.name);

	}
	
	public static void method2(ExceptionHandling eh) {
		
		eh.name = "hbjb";
	//	eh = new ExceptionHandling("Prashant", 20);
		System.out.println(eh.name);
	}

}
