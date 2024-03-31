import java.util.*;
class Automorphic{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number  :");
                N=sc.nextInt();
                int temp=N;
		int squ=N*N;
                int count=0;
		int rev=0;
                while(N!=0){
                     count++;
                     N=N/10;
                }
			for(int i=1;i<=count;i++){
				int rem=squ%10;
				rev=(rev*10)+rem;
				squ=squ/10;
			}
                	if(rev==temp){
                        	System.out.println("Number is Automorphic");
                	}
                	else{
                        	System.out.println("Number is not Automorphic");
                	}
        	
	}
}
