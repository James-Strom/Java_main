package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//	BankAccount jamesAccount = new BankAccount("111",100, "James Smith", "james12@myemail.com", "012 345 6789");
//    jamesAccount.withdraw(20);
//    jamesAccount.deposit(100);
//
//
//    BankAccount newAccount = new BankAccount("New", "new@email.com", "123456789");
//        System.out.println(newAccount.getAccountNumber()+" name " + newAccount.getCustomerName());
//    }

    VipCustomer vipPerson1 = new VipCustomer();
        System.out.println(vipPerson1.getName());

    VipCustomer vipPerson2 = new VipCustomer("George", 100000.00);
        System.out.println(vipPerson2.getName());


    VipCustomer vipPerson3 = new VipCustomer("Joe", 1000.00, "Joe@myemail.com");
        System.out.println(vipPerson3.getName());
    }
}
