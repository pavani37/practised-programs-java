import java.util.Scanner;
public class genbill{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter units");
        int units=sc.nextInt();
        double bill=0;
        if(units<=50){
            bill=units*0.50;
        }
        else if(units<=150){
            bill=(50*0.50)+(units-50)*0.75;
        }
        else if(units<=250){
            bill=(50*0.50)+(100*0.75)+(units-150)*1.25;
        }
        else{
            bill=(50*0.50)+(100*0.75)+(100*1.25)+(units-250)*2.25;
        }
        double gst=(bill*18)/100;
        System.out.println("Bill: "+bill);
        System.out.println("GST: "+gst);
        bill=bill+gst;
        System.out.println("Final Bill: "+bill);
    }
}