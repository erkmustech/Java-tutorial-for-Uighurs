package day20_string_manipulation;

public class Task80 {

	public static void main(String[] args) {
		/*
		 Write a method that accepts 2 strings(str1,str2) and prints the position index of the str2 
		 if str2 is existing in str1.If it doesn’t exist, print “not found”
checkedString(“Your order confirmation number is XYZ”, “confirmation”) ;
		 */
	
		checkedString("Your order confirmation number is XYZ", "confirmation");
	}
	
public static void checkedString(String a,String b) {

		if(a.contains(b)) {
			System.out.println(a.indexOf(b));
		}
		
		if(a.indexOf(b)>0) {
			System.out.println("ok");
		
	   }else {
		System.out.println("not found");
	}
   }

}
