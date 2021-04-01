import java.util.Scanner; //importing the scanner class
class Input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);// creating a scanner object
        System.out.println("Welcome to the Addition Calculator");
        
        System.out.println("Please enter the first number");
        int n1 = sc.nextInt();
        
        System.out.println("Please enter the second number");
        int n2 = sc.nextInt();
        
        int sum = n1+n2;
        
        System.out.println("The sum is =" +sum);
        
        
        
    }
}