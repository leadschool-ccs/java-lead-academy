import java.util.Scanner;
class Condition{
    public static void main(String args[]){
        int Marks;
        
        System.out.println("Please enter your percentage ");
        Scanner sc = new Scanner(System.in);
        Marks = sc.nextInt();
        
        if(Marks >80){
            System.out.println("Congratulations you got A+ grade");
        }
        
        else if(Marks >70 && Marks <=80){
            System.out.println("A grade");
        }        
        
        else if(Marks > 50 && Marks <=70){
            System.out.println("B grade");
        
        }
        else{
            System.out.println("Sorry, Fail");
        }
    }
}