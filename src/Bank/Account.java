package Bank;

public class Account {
        int accNum;
        String accOwner;
        double balance;

        public void display(){
                System.out.println("Acc Number : "+accNum);
                System.out.println("Acc Owner  : "+accOwner);
                System.out.println("Balance    : "+balance);
        }
}
