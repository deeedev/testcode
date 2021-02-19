public class Calculator {

	public static void main(String[] args) {
		Sum obj = new Sum(5,10);
		Multiply mul = new Multiply(2, 3);
		
		System.out.println(obj.sum());
		System.out.println(mul.multiply());
	}
}
