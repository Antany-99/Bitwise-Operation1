package Learning1;

public class XORSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15,b=20;
		System.out.println("Before Swapping: a = "+a+" "+"b = "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping: a = "+a+" "+"b = "+b);
	}

}
