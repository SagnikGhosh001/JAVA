package exceptionHandeling;

public class finallyBlock {

	public static void main(String[] args) {
		try {
			int a = 25 / 0;
			System.out.println(a);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("hello");
		}
	}

}
