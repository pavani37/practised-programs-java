import java.util.Scanner;
public class studentscore{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter project score, external score, internal score");
        int project=sc.nextInt();
        int external=sc.nextInt();
        int internal=sc.nextInt();
        int total=0;
        if(project>=50 && external>=50 && internal>=50){
            total=(project*70)/100+(external*20)/100+(internal*10)/100;
            System.out.println("Total score: "+total);
            if(total>=90){
                System.out.println("A grade");
                
            }
            else if(total>=75){
                System.out.println("B grade");
                
            }
              else{
                System.out.println("C grade");
                
            }
            
        }
        else{
            if(project<50){
                System.out.println("You got failed in project and score is: "+project);
            }
            if(external<50){
                System.out.println("You got failed in External and score is: "+external);
            }
            if(internal<50){
                System.out.println("You got failed in internal and score is: "+internal);
            }
            
        }
    }
}