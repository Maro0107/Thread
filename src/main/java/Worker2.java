public class Worker2 implements Runnable {

    private Thread parent;

    public Worker2(Thread parent) {
        this.parent = parent;
    }

    public void run() {
        try {
            parent.join();

            System.out.println("Worker2 start");
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Worker2 end");
    }
}