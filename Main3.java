class rbi {
    void loan() {
        System.out.println("This is RBI loan method");
    }
}

class sbi extends rbi {
    sbi() {
        System.out.println("This is SBI");
    }
}

class Main3 {
    public static void main(String[] args) {
        sbi obj = new sbi();
        obj.loan();
    }
}