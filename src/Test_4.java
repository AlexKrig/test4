public class Test_4 {
    public static void main(String[] args) {
       //подача данных на рекурсию
        System.out.println(testRec1(5));
       //создание нового потока
        Thread testThread1=new Thread(new Runnable() {
            @Override
            public void run() {
                pokPot();
            }
        });
       //запуск потока
        testThread1.start();
        for (int i =0;i<300;i++) {
            System.out.println(Thread.currentThread().getName()+" "+1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
       //тестирование рекурсии
    public static int testRec1(int n){
        if (n==0){
            return 1;
        }
        return n*testRec1(n-1);
    }
    //текст потока
    public static void pokPot(){
        while (true){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
