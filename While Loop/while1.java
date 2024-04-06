import java.util.*;
class  While1{
        public static void main(String[] args){
        	int N;
        	Scanner sc=new Scanner(System.in);
        	System.out.print("Enter the number  :");
        	N=sc.nextInt();
        	if(N%2==0){
			int i=N;
			while(i>0){
             
                     	System.out.println(i);
		     	i--;
                	}
            	}
		else{
        		int i=N;
                	while(i>0){

                     		System.out.println(i);
                     		i=i-2;      
          
        		}
		}
        }	
}
