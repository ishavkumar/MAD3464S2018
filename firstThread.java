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
public class firstThread extends Thread{
    
    public firstThread(){
        super("first thread");
        System.out.println("first thread created");
        start();
    }
    
    public void run(){
        try{
            for(int i = 1; i <= 5; i++){
                System.out.println("first thread : " + i);
                Thread.sleep(1000);
            }
            
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("existing first thread");
        }
        
    }
}
