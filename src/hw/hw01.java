package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        //方式一:若是三個項目分 數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗
        if(a>=60 && b>=60 && c>=60){
        	System.out.println("P");
        //若三個項目中有其中一 個項目分數未滿 60 分，但三個項目分數總合超過 220 分
        }else if(a<60 && b>=60 && c>=60){
           
        }
	}

}
