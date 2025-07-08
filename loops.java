public class loops{

		public static void main(String args[])
		{

			System.out.println("Printing Jay Shree Ram 10 Times ");
			int x=1;
			while( x<=10){
			System.out.println("Jay  "+x);
			x++;

		}
			System.out.println();
			System.out.println("Printing jay using do while loop");
			int y=10;
			System.out.println();
			do{
			
			System.out.println("Jay  "+y);
			y--;
			}while(y>0);
			
			System.out.println();

			System.out.println("Printing jay 10 Times using for loops");

			for(int i=1; i<=10; i++){
			System.out.println("jay " +i);
			}

			System.out.println();
			System.out.println("Table of 3 using for loops");
			
			for(int i=3; i<=30; i+=3){
			System.out.println(i);
			}
			System.out.println();

			System.out.println("Printing alphabets");
			for(char ch='A'; ch<='Z'; ch++ ){
				
			System.out.println(" Alphabet "+"=" + ch);

			}
			System.out.println();

			System.out.println("Printing alphabet using do while loop");
			char c='A';
			int a=1;
			do{
				System.out.println("Alphabet "+ a+ "=" +c);
				a++;
				c++;
			}while(c<='Z');
			
			System.out.println();
			System.out.println("printing alphabet using for loops");
			int ab=1;	
			for(char h='A'; h<='Z'; h++){
			

			
			System.out.println("Alphabet "+ab +" =" +h);
			ab++;

			}
	
			System.out.println();
			System.out.println("Printing the Alphabet using while loop");
			char chh='A';
			int z=0;
			while(chh<='Z'){
			z++;
			System.out.println("Alphabet "+ z+ "="+chh);
			chh++;

			}
				
		}	


			
}