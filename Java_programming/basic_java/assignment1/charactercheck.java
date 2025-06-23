package assignment1;

public class charactercheck {
	
	public static void main(String []args) {
		char ch = 'b';
//		printf("Enter the character:");
//	    scanf("%c",&ch);
	    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E'|| ch =='I' || ch =='O' || ch == 'U')
	        System.out.printf("Given charater is vowel\n");
	    else
	    	System.out.printf("It is consonent\n");
	        
//	     if(ch>=97 && ch<=122){
//	           ch = ch - 32;
//	           System.out.printf("%c It is converted into uppercase",ch);
//	        }
//	     else if(ch>=65 && ch<=90) {
//	           ch = ch + 32;
//	           System.out.printf("%c It is converted into lowercase",ch);
//	        }
//	     else if(ch>='0' && ch<='9'){
//    	 System.out.printf("It is a digit");
//	        }
//	     else
//	    	 System.out.printf("It is a special symbol. ");
	}

}
