import java.util.*;
class EvenCount{
        public static void main(String[] args){
        int N;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number upto which you want to find even no count :");
        N=sc.nextInt();
        int eCount=0;
        int i=1;
        while(i<=N){
                if(i%2==0){
                        eCount++;
                }

               i++;
        }
         System.out.println("Even Number count between"+1+" to "+N+":"+eCount);

        }
}
