import java.util.*;
class Palindrome{
        public static void main(String[] args){
        	int N;
        	Scanner sc=new Scanner(System.in);
        	System.out.print("Enter the number of which you want to reverse :");
        	N=sc.nextInt();
		int temp=N;
        	int rev=0;
        	while(N!=0){
                	int rem=N%10;
                	rev=(rev*10)+rem;
                	N=N/10;
        	}
		if(rev==temp){
        		System.out.println("Number is palindrome");
		}
		else{
			System.out.println("Number is not palindrome");
		}
        }
}
