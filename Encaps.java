class User{
    private int amount = 0;

    void getter(){
        System.out.println(amount);
    }
    
    void setter(int num){
        amount = num;
    }
}

class Encaps{
    public static void main(String[] args) {
        User us = new User();
        us.setter(203019);
        us.getter();
    }
}