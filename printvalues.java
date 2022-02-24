import java.util.Scanner;
public class printvalues{
    public static void main(String args[]){
        int a=0;
        float b=0;
        double c=0.0;
        String str=null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter int value");
        a=sc.nextInt();
        System.out.println("Enter float value");
        b=sc.nextFloat();
        System.out.println("Enter Double value");
        c=sc.nextDouble();
             System.out.println("Int value is : "+a);
             System.out.println("float value is : "+b);
             System.out.println("double value is : "+c);
             System.out.println("Enter String value");
               str=sc.next();
             System.out.println();
             System.out.println("String value is :"+str);
    }
}