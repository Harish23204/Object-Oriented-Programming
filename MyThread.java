class MyThread extends Thread{

    int TNo;
    MyThread(int TNo)
{
this.TNo=TNo;
}
public void run()
{
    System.out.println("Thread No"+TNo);
}
public static void main(String []argv)
{
    MyThread T1 = new MyThread(1);
    MyThread T2 = new MyThread(2);
    MyThread T3 = new MyThread(3);
    MyThread T4 = new MyThread(4);
    MyThread T5 = new MyThread(5);

T1.start();
T2.start();
T3.start();
T4.start();
T5.start();

    System.out.println("thread 5 states"+TS.getState());
    T5.start();

    T5.suspend();
    System.out.println("thread 5 states"+TS.getState());

    T5.resume();
    System.out.println("thread 5 states"+TS.getState());

    }
}
