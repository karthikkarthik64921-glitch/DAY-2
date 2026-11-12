class RBI {
    void loan() {
        System.out.println("This is RBI loan method");
    }
}

class SBI extends RBI {
    SBI() {
        System.out.println("This is SBI");
    }
}

class HDFC extends SBI {
    HDFC() {
        System.out.println("This is HDFC");
    }
}

class Main {
    public static void main(String[] args) {
        HDFC obj = new HDFC();
        obj.loan();
    }
}