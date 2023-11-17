public class MultiThreading extends Thread {

    private Integer a = 10;
    private Integer b = 20;

    private Thread thread1;

    public void setThread1(Thread thread1) {
        this.thread1 = thread1;
    }
    public Thread getThread1(){
        return thread1;
    }
    private void addition(){
       System.out.println(a+b);
   }
   void runThread(){
       Runnable r = new Runnable() {
           @Override
           public void run() {
               addition();
           }
       };
       r.run();
   }
   public void lpopo(){
       addition();
   }
}
