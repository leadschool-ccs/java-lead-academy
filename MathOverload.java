class MathOverload{
    void add(int a, double b){
        System.out.println("I am from int int method "+(a+b));
    }
    
    void add(double a, double b, double c){
        System.out.println("I am from int int int method "+(a+b+c));
    }
    void add(){
        System.out.println("I dont have any para");
    }
}