

abstract class AbstractBank {  // abstract class
    abstract void createAccount();// abstract method
    abstract void withdrawMoney();

    void depositMoney(){
        System.out.println("deposit your money in your account");
    }
}



class  ICICIBank extends AbstractBank{
        void createAccount(){                   // abstract method must be override 
            System.out.println("ICICIbank account created");
        }

        void withdrawMoney(){         // abstract method must be override
            System.out.println("Money withdrawn from ICICI account");
        }
    }

class BankOfIndia extends AbstractBank{
    void withdrawMoney(){
        System.out.println("Money withdrawn from BOI account");
    }

    void createAccount(){                   // abstract method must be override 
            System.out.println("BOI  account created");
        }
    
}

 class Main {
    public static void main(String[] args) {
        
        
        AbstractBank bank1 = new ICICIBank(); 
            bank1.createAccount();
            bank1.withdrawMoney();
        

        AbstractBank bank2 = new BankOfIndia(); 
        bank2.createAccount();
        bank2.withdrawMoney();
    
}

}

