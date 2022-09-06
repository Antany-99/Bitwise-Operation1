package Learning1;

public class XOROddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		if(((a&1)!=1)||((a|1)>a)||((a^1)==a+1)){
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
		
	}

}
