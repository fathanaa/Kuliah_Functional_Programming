package modul11;

import java.util.stream.IntStream;

import java.util.Arrays;
import java.util.List;

class test1 {
    public static void main(String[] args) {

        // Sequential digunakan secara default
        List<String> list1 = Arrays.asList("Have","a","good");
//        list1.stream().forEach(System.out::println);

        // Menggunakan Method Sequential dalam Stream
        List<String> list = Arrays.asList("Good","D","a","y");
//        list.stream().sequential().forEach(System.out::println);

        // Membuat parallelStream()


    }
}

class test2 extends Thread{
    public static void main(String[] args) {
        test2 test2 = new test2();
        test2.start();
    }

    @Override
    public void run() {
        System.out.println("Good Mornig");
    }
}

class test{
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Morning");
            }
        };
        thread.start();
    }
}

class test3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Morning, with runnable implemented");
    }

    public static void main(String[] args) {
        test3 test3 = new test3();
        Thread t = new Thread(test3);
        t.start();
    }
}

class test4{
    public static void main(String[] args) {
        Runnable run = new Runnable(){
            @Override
            public void run() {
                System.out.println("Avalon strike");
            }
        };
        Thread t = new Thread(run);
        t.start();
    }
}

class test5{
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Functional Programming Thread");
        }).start();

        Runnable runnable = () -> {
            System.out.println("Functional Programming Runnable");
        };
        Thread t = new Thread(runnable);
        t.start();
    }
}




class ThreadExample {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for (int i=0; i < 13; i++){
                    System.out.print(i);
                }
            }
        };
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(run);

        th1.start();
        th2.start();
    }
}

class ThrExm2{
    public static void main(String[] args) {
        Runnable run = () -> {
            for (int i=0; i < 12000; i++){
                Thread.currentThread().getId();
            }
        };
        Thread th1 = new Thread(run);
        Thread th2 = new Thread(run);
        th1.start();
        th2.start();
    }
}

class ThrExm3{
    public static void main(String[] args) {
        Runnable runnable = () -> IntStream.range(0,1000).forEach(i -> Thread.currentThread().getId());
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}

class TheExam4{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : Multithreading");
        Runnable task1 = () -> {
            System.out.println(Thread.currentThread().getName() + " : Is Running");
        };

        Thread thread2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " : Is Running");
        });

        Runnable task3 = () -> {
            System.out.println(Thread.currentThread().getName() + " : Is Running");
        };

        Thread th1 = new Thread(task1);
        th1.start();
        thread2.start();
        new Thread(task3).start();



    }
}
