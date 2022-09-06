package Learning1;
import java.util.ArrayList;
public class XORDup {

	public static void main(String[] args) {
		int a[]= {1,2,4,2,6,5,1,7,5};
		int n=a.length;
	       Ascending(a,n);
	        ArrayList<Integer> b=new ArrayList<>();
	        for(int i=0;i<n;i++)
	        { 
	            if(i==n-1) {
	            	if((a[i]^a[i-1])!=0) {
	            		b.add(a[i]);}
	            }
	            else if((a[i]^a[i+1])!=0) {
	            	b.add(a[i]);}
	        }
	        System.out.print(b);
	}
	public static void Ascending(int a[],int n) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;}
			}
		}
	}

}
