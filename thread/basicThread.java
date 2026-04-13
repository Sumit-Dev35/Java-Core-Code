class myThread1 extends Thread{
    public void run(){
        System.out.println("Thread1 is running");
    }
}

class myThread2 extends Thread{
    public  void run(){
        System.out.println("Thread2 is running");
    }
}
class basicThread{
    public static void main(String [] args){
        myThread1 thread1=new myThread1();
        myThread2 thread2=new myThread2();
        thread1.start();
        thread2.start();
    }
}