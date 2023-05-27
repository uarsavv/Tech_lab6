package sync;
public class U1901Bank {
    int intTo;
    int intFrom = 220;

    public synchronized void calc(int intTransaction, long intTimeout){
        System.out.println("\n----------State before----------" +
                "\nrecipient score: " + intTo +
                "\nsender score: " + intFrom +
                "\nstream name: " + Thread.currentThread().getName());
        intFrom -= intTransaction;
        try{
            Thread.sleep(intTimeout);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        intTo += intTransaction;
        System.out.println("\n----------State after----------" +
                "\nrecipient score: " + intTo +
                "\nsender score: " + intFrom +
                "\nstream name: " + Thread.currentThread().getName());
    }
}
