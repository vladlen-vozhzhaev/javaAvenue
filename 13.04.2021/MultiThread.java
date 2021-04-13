public class MultiThread {
    public static void main(String[] args) {
        /*
        Способ 1
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.task = "Стираем белье";
        t2.task = "Моем посуду";
        t1.start();
        t2.start();*/
        /*
        Способ 2
        Thread t1 = new Thread(new MyRunnableClass("Моем посуду"));
        Thread t2 = new Thread(new MyRunnableClass("Стираем белье"));
        t1.start();
        t2.start();*/
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(i+" стираем белье");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 200; i++) {
                    System.out.println(i+" моем посуду");
                }
            }
        });
        t1.start();
        t2.start();
    }
}

class MyRunnableClass implements Runnable{
    String task;

    public MyRunnableClass(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(i+" "+this.task);
        }
    }
}

class MyThread extends Thread{
    String task;
    @Override
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println(i+" "+this.task);
        }
    }
}
