abstract class Parent{
    abstract void loan();
    void printing(){
        System.out.println("Welcome to RBI");
    }
}
class Child extends Parent{
    void loan(){
        System.out.println("Loan Accepted !!");
    }
}
class Main{
    public static void main(String[] args) {
        Child ch = new Child();
        ch.loan();
        ch.printing();
    }
}