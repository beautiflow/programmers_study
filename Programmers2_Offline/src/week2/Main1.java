
package week2;

public class Main1 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.giveCoffee();
        vm.makeCoffee();

    }
}

class VendingMachine{
    void makeCoffee(){
        System.out.println("커피를 만듭니다.");
    }

    void giveCoffee(){
        System.out.println("커피를 줍니다.");
    }
}
