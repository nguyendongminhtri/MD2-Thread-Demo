package com.company;

public class Thread1 extends Thread{
    User user;
    public Thread1(User user){
        this.user = user;
    }
    public void run(){
        user.joinTable(5);
    }

}
