abstract class Bank {
    abstract void memory();

    void balance() {
        System.out.println("Welcome to Bank");
    }
}

class SBI extends Bank {
    void memory() {
        System.out.println("This is SBI memory method");
    }
}

class Main {
    public static void main(String[] args) {
        SBI obj = new SBI();

        obj.memory();
        obj.balance();
    }
}