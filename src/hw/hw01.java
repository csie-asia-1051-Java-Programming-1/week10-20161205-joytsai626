package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入3項成績:");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        //若是三個項目分 數皆為 60 分以上 ( 包含 60 分 ) 即為通過測驗
        if(a>=60 && b>=60 && c>=60){
        	System.out.println("P");
        //若三個項目中有其中一 個項目分數未滿 60 分，但三個項目分數總合超過 220 分，也可算通過測驗
        }else if(a+b+c>=220){
        	System.out.println("P");  
        //若三 個項目中有其中一個項目分數未滿 60 分，而三個項目分數總合也沒能超過 220 分，可獲得補考機會
        //若是三個項目中有兩個項目不及格，但另一個項目成績高於 80 分 ( 包含 80 分 ) ，也可獲得補考的機會
        }else if(a>=60||b>=60||c>=60){
		   if(Math.max(Math.max(a, b), c) >= 80){
		System.out.println("M");
		//其餘皆判定為無法通過測驗
			}else{
		System.out.println("F");
	}
	}
}
}