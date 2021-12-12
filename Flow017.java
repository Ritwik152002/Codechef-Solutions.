 import java.util.*;
 import java.lang.*;
   public class Flow017{
	   public static void main( String[] args ){
		   Scanner sc = new Scanner(System.in);
		   int t = sc.nextInt();
		   while(t-->0){
			   int A = sc.nextInt();
			   int B = sc.nextInt();
			   int C = sc.nextInt();

			   if( A>B && A>C ){
				   System.out.println( Math.max(B,C) );
			   }
			   else if( B>A && B>C ){
				   System.out.println( Math.max(A,C) );
			   }
			   else if( C>A && C>B ){
				   System.out.println( Math.max(A,B) );
			   }
		   }
	   }
   }

