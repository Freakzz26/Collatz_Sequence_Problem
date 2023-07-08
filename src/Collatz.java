import java.util.Scanner;
public class Collatz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int temp=num;
        System.out.print(temp+" ");
        while (temp!= 1)
        {
            if (temp%2==0) {
                temp = temp / 2;
            }
            else {
                temp=(3*temp)+ 1;
            }
            System.out.print(temp +" ");
        }
        System.out.print(num);
    }
    }
