class T1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class T2 extends Thread {
    public void run() {
        for (int i = 101; i <= 200; i++) {
            System.out.println(i);
        }
    }
}

class T3 extends Thread {
    public void run() {
        for (int i = 201; i <= 300; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        try {
            T1 t1 = new T1();
            T2 t2 = new T2();
            T3 t3 = new T3();

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
/*output 
1
2
3
...
100
101
102
...
200
201
202
...
300 */