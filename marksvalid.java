import java.util.Scanner;
public class marksvalid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks");
        int marks=sc.nextInt();
        if(marks>=0 && marks<=100){
            System.out.println("Valid marks");
        }
        else{
            System.out.println("Invalid marks");
        }
    }
}