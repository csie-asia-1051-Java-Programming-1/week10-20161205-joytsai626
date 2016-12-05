package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       int data[] = new int[4];
       for(int i=0;i<4;i++){
			data[i]=scn.nextInt();
	}Arrays.sort(data);
	if(data[0]==data[1]){
		System.out.print(data[2]+data[3]);
	}else if(data[1]==data[2]){
		System.out.print(data[0]+data[3]);
	}else if(data[2]==data[3]){
		System.out.print(data[0]+data[1]);
		//012 013 014 023 024 123 124 234  
	}else{
		System.out.print("R");
	}
	}
	}