import java.util.*;
class SqrtNumbers{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number  :");
                N=sc.nextInt();
                int i=1;
                System.out.println("Square roots of number between"+1+" to "+N+":");
                while((i*i)<=N){
			System.out.println(i);
          		i++;
                 }


	}
}
