import java.util.*;
public class loopi{

		public static void main(String args[]){
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number how many times you want to print");
		int x=1; 
		int n=sc.nextInt();

		if(n<=0){
		System.out.println("Only Enter Positive value ");
		}else{
		
		while(x<=n){
		System.out.println(" jay " +x);
		x++;
		}
}
}

}