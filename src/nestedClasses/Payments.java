package nestedClasses;

public class Payments {


    private long receiptNumber;
    private double amount;
    static String currency = "U.S Dollars";


    public long getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(long receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double setAmount() {
        return amount;
    }

    private class Debit{

        private long routingNumber;
        private String bank;

        public Debit() {
        }

        public Debit(int routingNumber,String bank) {
            this.routingNumber = routingNumber;
            this.bank = bank;
        }


        public String getBank() {
            return bank;
        }

        public void setBank(String bank) {
            this.bank = bank;
        }

        public long getRoutingNumber() {
            return routingNumber;
        }

        public void setRoutingNumber(int routingNumber) {
            this.routingNumber = routingNumber;
        }

        public void makePayment(){
            System.out.println("payment made for the amount: "+Payments.this.getAmount()+" from routing number: " + this.routingNumber );
        }

    }
    private class Credit{

         Companies vendor;
         private long accountNumber;

        public Credit(Companies vendor, long accountNumber) {
            this.vendor = vendor;
            this.accountNumber = accountNumber;
        }

        public Credit(){

        }

        public long getAccountNumber() {
            return accountNumber;
        }
    }


}
