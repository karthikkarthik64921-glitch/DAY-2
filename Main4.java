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

class hdfc extends rbi {
    hdfc() {
        System.out.println("This is HDFC");
    }
}

class Main4 {
    public static void main(String[] args) {

        sbi obj1 = new sbi();
        obj1.loan();

        hdfc obj2 = new hdfc();
        obj2.loan();
    }
}