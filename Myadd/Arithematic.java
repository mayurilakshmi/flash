import java.util.Scanner;

public class Arithematic {
		public  static  int  sum(int a, int b) {
			return a+b;
			}
		
		public static   int  subt(int a, int b) {
				return a-b;
		}
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter a :");
			int a = sc.nextInt();
			System.out.println("Please enter b :");
			int b = sc.nextInt();
			
			System.out.println(Arithematic.sum(a,b));
			int result = Arithematic.subt(a,b);
			System.out.println(result);

	}

}
