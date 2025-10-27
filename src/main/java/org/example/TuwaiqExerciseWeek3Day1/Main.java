package org.example.TuwaiqExerciseWeek3Day1;

public class Main
{
    public static void main(String[] args) {

        //_______________________________Q-1_________________________________\\

//        Account account1 = new Account("1", "Ammar Yagoub");
//        Account account2 = new Account("2", "Yousef Yagoub");
//        account1.setBalance(account1.credit(1000));
//        account1.setBalance(account1.debit(2000));
//        System.out.println(account1.getBalance());
//        account2.setBalance(account1.transferTo(account2, 100));
//        account1.setBalance(account2.transferTo(account1, 10000));
//        System.out.println(account1.getName());
//        account1.setName("AmmarYagoub");
//        System.out.println(account1);
//        System.out.println(account2);


        //_______________________________Q-2_________________________________\\

        Employee e1 = new Employee("1","Ammar Yagoub",6500);
        e1.setSalary(12000);
        e1.setSalary(e1.raisedSalary(10));
        System.out.println("your annual salary is "+e1.getAnnualSalary());
        System.out.println(e1);

    }
}
