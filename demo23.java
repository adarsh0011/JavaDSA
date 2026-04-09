public class demo23 {
	public static void main(String[] args) {
		int num1;
		int num2;
		
		while (num1 >= 2) {
			if (num1 > num2) {
				num1 = num1 / 2;
			} else {
				System.out.println(num1);
				break;
			}
		}
	}
}
