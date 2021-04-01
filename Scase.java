import java.util.Scanner;
class Scase{
    public static void main(String args[]){
        String n;
        System.out.println("Choose between the words one, two, three or four ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        
        switch(n){
            case "one":
            System.out.println("Morning!");
            break;
            case "two":
            System.out.println("Afternoon");
            break;
            case "three":
            System.out.println("Evening");
            break;
            case "four":
            System.out.println("Night");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }
}