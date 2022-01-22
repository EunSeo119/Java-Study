public class MainClassThrow {

	public static void main(String[] args) {
		
		MainClassThrow mainClass004 = new MainClassThrow();
		
		try {
			mainClass004.firstMethod();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void firstMethod() throws Exception {
		secondMethod();
	}
	
	public void secondMethod() throws Exception {
		thirdMethod();
	}
	
	public void thirdMethod() throws Exception {
		System.out.println("10 / 0 = " + ( 10 / 0 ));
	}
	
}
