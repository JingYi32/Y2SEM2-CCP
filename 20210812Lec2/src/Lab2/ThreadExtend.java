/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author jingy
 */
public class ThreadExtend extends Thread{
    private Thread t;
    private String threadName;
    
    ThreadExtend(String name){
        threadName = name;
        System.out.println("Creating" + threadName);
    }
    
        public void run(){
        System.out.println("Running"+threadName);
        try{
            for (int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + ", Loop: " + i);
                //Let the thread sleep for a while.
                Thread.sleep(0);
            } 
        }catch(InterruptedException e){
            System.out.println("Thread "+ threadName + "interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting");
    }
    
    public void start(){
        System.out.println("Starting " + threadName);
        if (t ==null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
