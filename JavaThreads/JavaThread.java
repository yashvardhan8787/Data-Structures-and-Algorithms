package JavaThreads;


class MyTask extends Thread {
    @Override
    public void run() {
        super.run();
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Task1 is Running");
        }
    }
}


class MyTask2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 100 ; i++){
            System.out.println("Task2 is Running");
        }
    }
}

public class JavaThread {

    public static void main(String[] args) {
        MyTask t1 = new MyTask();
        t1.start();

        MyTask2 t2 = new MyTask2();

        Thread t22= new Thread(t2);
        t22.start();

    }

}
