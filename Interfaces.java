import java.util.*;

public interface Interfaces {
void depositMoney();
void withdrawMoney();
// abstarct methods and static & default methods are accepted inside Interfaces

static void createaccount(){
    System.out.println("account created");  // allowed
}
default void createaccount1(){
    System.out.println("account created");  // allowed
}
// concrete , normal methods are not allowed

// void createaccount{
// not allowed
// }

    
}
class BOI implements Interfaces{     // interfaces + classes should be declared in separate files or remove the public keyword before clss
    @Override
    public void depositMoney() {
         System.out.println("Deposit your Money in BankOfIndia.");
    }

    @Override
    public void withdrawMoney() {
        System.out.println("Withdraw your Money from BankOfIndia."); 
        
    }
} 


class Main1{
public static void main(String args[]){
   BOI boi = new BOI();
   boi.depositMoney();
   boi.withdrawMoney();
}
}
