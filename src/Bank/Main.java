package Bank;
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Account account = new Account();
        List<Account> list = new ArrayList<>();
        int op,n = 0;
        boolean isVaildate = false;
        do {
            System.out.println("1-> Add account ");
            System.out.println("2-> Edit Account");
            System.out.println("3-> Delete Account");
            System.out.println("4-> Show Account");
            System.out.println("5-> Exit");
            System.out.print("Choose One Option (1-5): ");
            op= sc.nextInt();
            switch (op){
                case 1->{
                    System.out.println("$$$$$$$$$$$$$ Add Account $$$$$$$$$$$$$$$");
                        System.out.print("Enter Account number  : ");
                        account.accNum=sc.nextInt();
                        System.out.print("Enter owner of Account : ");
                        sc.nextLine();
                        account.accOwner= sc.nextLine();
                        System.out.print("Enter number balance : ");
                        account.balance=sc.nextDouble();
                    list.add(account);
                }
                case 2->{
                    System.out.println("$$$$$$$$$$$$$ Edit Account $$$$$$$$$$$$$$$");
                    int id ;
                    System.out.print("Enter id to edit account : ");
                    id=sc.nextInt();
                    for(int i = 0 ;i<list.size();i++) {
                        if (id == account.accNum) {
                            System.out.print("Enter number of Account : ");
                            account.accNum = sc.nextInt();
                            System.out.print("Enter owner of Account : ");
                            sc.nextLine();
                            account.accOwner = sc.nextLine();
                            System.out.print("Enter number balance : ");
                            account.balance = sc.nextDouble();
                            list.set(i,account);
                        }
                    }
                }
                case 3->{
                    System.out.println("$$$$$$$$$$$$$ Delete Account $$$$$$$$$$$$$$$");
                    int dID ;
                    System.out.print("Enter id to edit account : ");
                    dID=sc.nextInt();
                    if(dID == account.accNum){
                        list.remove(account);
                        System.out.println("\"Deleted Account successfully.\"");
                    }else{
                        System.out.println("Delete not success....! Pleas delete again.");
                    }
                }
                case 4->{
                    System.out.println("$$$$$$$$$$$$ Show Information Account $$$$$$$$$$$$$$$$");
                    int opt ;
                    System.out.println("Show account nformation");
                    System.out.println("1. Ascending order (by ID )");
                    System.out.println("2. Descending order (by ID) ");
                    System.out.println("3. Descendig order (by balance) ");
                    System.out.print("Choose show option (1-3) : ");
                    opt =  sc.nextInt();
                    switch (opt){
                        case 1: {
                            System.out.println("Ascending ");
                            for (Account account1 : list){
                               account1.display();
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("Descending order by ID ");
                            Collections.sort(list, new Comparator<Account>() {
                                @Override
                                public int compare(Account o1, Account o2) {
                                    return Integer.valueOf(o1.accNum).compareTo(o2.accNum);
                                }
                            });
                            for (int i =0 ;i<list.size();i++){
                                account.display();
                            }
                            break;
                        }
                        case 3:{
                            System.out.println(" Descending order (by balance) ");
                            Collections.sort(list, new Comparator<Account>() {
                                @Override
                                public int compare(Account o1, Account o2) {
                                    return Integer.valueOf(o2.accNum).compareTo(o1.accNum);
                                }
                            });
                            for (int i =0 ;i<list.size();i++){
                                account.display();
                            }
                            break;
                        }
                        default:
                            System.out.println("Exit Program...");
                    }
                }
                case 5->{
                    System.exit(1);
                }
                default -> System.out.println("Leave Program.");
            }
        } while (!isVaildate);
    }
}
