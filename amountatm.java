import java.util.Scanner;
public class amountatm{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int amount=sc.nextInt();
        int a=0,b=0,c=0;
        if(amount%100==0){
            
            if(amount>=500){
                a=amount/500;
                amount=amount-(a*500);
                System.out.println("500 rupees notes are: "+a);
            }
                       if(amount>=200){
                b=amount/200;
                amount=amount-(b*200);
                System.out.println("200 rupees notes are: "+b);
            } 
            if(amount>=100){
                c=amount/100;
                amount=amount-(c*100);
                System.out.println("100 rupees notes are: "+c);
            } 
            
        }
        else{
            System.out.println("Please enter multiples of 100 only");
        }
    }
}