package day12_branching_statement;

public class Lable_statement {
	public static void main(String[] args) {
		//label statement is used to cancel whole code differently . 
		// you can download the latest version of the code by terminal=(git pull origin master)
		int i=0;
		outer: 
			do {
				i=8;
				inner:
				while(true) {
					System.out.println(i--);
					if(i==4) {
						break outer;
					}
				}
					
	     	}while(true);
			
		
		
	}

}
