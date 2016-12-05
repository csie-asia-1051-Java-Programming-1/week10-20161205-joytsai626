package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int data[] = new int[4];

       int a = scn.nextInt();
       int b = scn.nextInt();
       int c = scn.nextInt();
       int d = scn.nextInt();
       
       if(a != b  && b != c && c != d && a != d){
    	   System.out.println("R");
	}else if(a == b&&b == c&&c == d&&d == a){
		   System.out.println("R");
	}else if(a == b){
    	   System.out.println(c+d);
	}else if(b == c){
		System.out.println(a+d);
	}else if(c == d){
		System.out.println(a+b);
	}else if(a == d){
		System.out.println(b+c);
	}else if(a == b && c == d && a>c){
		System.out.println(a+b);
	}else if(a == b && c == d && a<c){
		System.out.println(c+d);
	}else if(a == c && b == d && a>b){
	    System.out.println(a+c);
	}else if(a == c && b == d && a<b){
		System.out.println(b+d);
	}
	}
	}

