import java.util.*;
class SqrtEven{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number  :");
                N=sc.nextInt();
                int i=1;
                System.out.println("Square roots of even numbers between "+1+" to "+N+":");
                while((i*i)<=N){
			if((i*i)%2==0){
                        	System.out.println(i);
			}
                        i++;
                 }


        }
}
