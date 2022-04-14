package com.company;

public class Thread2 extends Thread{
    User user;
    public Thread2(User user){
        this.user = user;
    }
    public void run(){
       user.joinTable(100);
    }
}
