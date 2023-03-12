package exception_Handling;

public class ExceptionHandling {

//	public void method() {
//		try {
//			method2();
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("A");
//		}
//		
//		catch(StackOverflowError e) {
//			System.out.println("C");
//		}
//		
//		catch(Exception e) {
//			System.out.println("D");
//		}
//	}
//	
//	public void method2() throws Exception {
//		try {
//			int n = 0;
//			n = n/0;
//		}
//		
//		catch(ArithmeticException e){
//			System.out.println("B");
//			throw e;
//		}
//		
//		throw new Exception();
//	}
	
	String name;
	int age;
	
	public ExceptionHandling(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
