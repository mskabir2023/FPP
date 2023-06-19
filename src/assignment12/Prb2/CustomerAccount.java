package assignment12.Prb2;

public class CustomerAccount {

        private String Cus_name;
        private String Acc_No;
        private Double Balance;

        public CustomerAccount(String cus_name, String acc_No, Double balance) {
            Cus_name = cus_name;
            Acc_No = acc_No;
            Balance = balance;
        }

        public boolean deposit(double amount) throws NegativeVBalanceException {
            if (amount < 0) {
                throw new NegativeVBalanceException("Amount not smaller than 0.");
            }
            Balance += amount;
            return true;
        }

        public boolean widthdraw(double amount) throws ExceedBalanceSheetException, BalanceException {
            if (amount > Balance) {
                throw new ExceedBalanceSheetException("You do not have balance in your account.");
            }
            if (Balance < 100) {
                throw new BalanceException("balance is below $100.");
            }
            Balance -= amount;
            return true;
        }

        public double getBalance() throws BalanceException {
            if (Balance < 100) {
                throw new BalanceException("balance is below $100.");
            }
            return Balance;
        }


        public static void main(String[] args) {
            CustomerAccount account1 = new CustomerAccount("BOBS", "IBL589674", 1000.0);
            try {
                account1.deposit(500.0);
                System.out.println("Balance Amount: " + account1.getBalance());
                account1.deposit(-100);
            } catch (BalanceException | NegativeVBalanceException e) {
                System.out.println(e.getMessage());
            }

            try {
                account1.widthdraw(450.0);
                System.out.println("Balance Amount: " + account1.getBalance());
                account1.widthdraw(2000);
            } catch (BalanceException | ExceedBalanceSheetException e) {
                System.out.println(e.getMessage());
            }

            try {
                account1.widthdraw(1000.0);
                System.out.println("Balance Amount: " + account1.getBalance());
            } catch (ExceedBalanceSheetException | BalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }

