package com.company;

public class Main  {

    public static void main(String[] args) throws InterruptedException {
//        Main thread1 = new Main();
//        thread1.start();
//        Main thread2 = new Main();
//        while (thread1.isAlive()){
//            System.out.println("Waiting1 ....");
//        }
//        thread1.sleep(5000);
//        System.out.println("ket thuc thread 1");
//        thread2.start();
//        System.out.println("Count sau khi thread chay thread1 "+count);
//        while (thread2.isAlive()){
//            System.out.println("Waiting ....");
//        }
//        System.out.println("Count sau khi thread chay thread2 "+count);
//        count++;
//        System.out.println("Count outside Thread === "+count);
//        for (int i = 0; i < 5; i++) {
//           thread1.sleep(2000);
//            System.out.println(i);
//        }
User user = new User();
Thread1 thread1 = new Thread1(user);
Thread2 thread2 = new Thread2(user);
thread1.start();
thread2.start();

//        Thread1 thread1 = new Thread1();
//        System.out.println("count trước: "+thread1.count);
//        thread1.start();
////while (thread1.isAlive()){
////    System.out.println("waiting ....");
////}
//        thread1.sleep(5000);
//        System.out.println("sau"+thread1.count);
//        System.out.println("kết thúc thread1");
//        Thread1 thread2 = new Thread1();
//        thread2.start();

    }
}
