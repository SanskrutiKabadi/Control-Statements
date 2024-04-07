import java.util.*;
class SquareEven{
        public static void main(String[] args){
                int N;
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number upto which you want to find even num square root :");
                N=sc.nextInt();
                int i=1;
                System.out.println("Square roots of even Number  between"+1+" to "+N+":");
                while(i<=N){
                        if(i%2==0){
                                System.out.println(i*i);
                        }

                        i++;
                 }


        }
}
