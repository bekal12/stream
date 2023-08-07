package selfPractice.multithreading.runnable;

public class Test {

    public static void main(String[] args){
        MyRunnable r = new MyRunnable();
        // normal
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("parent thread");
        }
        //case study
        System.out.println("****** look the following case study  *****");
        Thread t1 = new Thread();
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println("case thread");
        }
    }
}
