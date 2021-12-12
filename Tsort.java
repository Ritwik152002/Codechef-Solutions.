 import java.util.*;
 import java.lang.*;
  public class Tsort{
	  public static void main( String[] args ){
		  Scanner sc = new Scanner(System.in);
		  int t = sc.nextInt();
		  int[] a = new int[t];
		  
		  for(int i=0; i<t; i++){
			  a[i] = sc.nextInt();
		  }

		  int num=0;

		  for(int i=0; i<a.length; i++){
			  for(int j=i+1; j<a.length; j++){
				  if( a[i]>a[j] ){
					  num = a[i];
					  a[i]= a[j];
					  a[j]= num;
				  }
			  }
			  System.out.println(a[i]);
		  }
	  }
  }



