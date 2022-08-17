public class Worker1 implements Runnable {

    public void run() {
        System.out.println("Worker1 start");

        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker1 end");
    }
}