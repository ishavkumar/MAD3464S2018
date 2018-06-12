/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day12;

/**
 *
 * @author macstudent
 */
public class GetThread {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = Thread.currentThread();

        System.out.println("Current thread : " + t1);
        t1.setName("My Thread");
        t1.setPriority(10);
        System.out.println("Thread info : " + t1);
        System.out.println("is alive : " + t1.isAlive());
        System.out.println("deamon : " + t1.isDaemon());
        System.out.println("interuppted : " + t1.isInterrupted());
    
       try {
            for(int i = 1; i<= 5; i++){
            System.out.println("main thread : " + i);
            new  firstThread();
           
                       
                       
           Thread.sleep(5000);
           
            }     
        

    }catch(InterruptedException ex){
    
    ex.printStackTrace();

    }catch(Exception ex){
    
   ex.printStackTrace();

    }

    }}
