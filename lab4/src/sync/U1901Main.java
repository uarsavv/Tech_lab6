package sync;

public class U1901Main {
    public static void main(String[] args) {
        U1901Bank bankMain = new U1901Bank();
        U1901Thread threadOne = new U1901Thread(bankMain, 100, 2000L);
        threadOne.setName("The First Thread");
        threadOne.setPriority(Thread.MAX_PRIORITY);
        threadOne.start();
        U1901Thread threadTwo = new U1901Thread(bankMain, 50, 300L);
        threadTwo.setName("The Second Thread");
        threadTwo.setPriority(Thread.MAX_PRIORITY);
        threadTwo.start();
        Thread.currentThread().getName();
    }
}
