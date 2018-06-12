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
public class secondThread implements Runnable{
    
    String name;
    Thread t;
    
    public secondThread(String name){
        this.name =name;
        t = new Thread(this, name);
        System.out.println("New second thread : " + t);
        t.start();
        
    }

    @Override
    public void run() {try{
            for(int i = 1; i <= 5; i++){
                System.out.println("i : " + i);
                Thread.sleep(1000);
            }
            
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }finally{
            System.out.println("existing second thread");
        }
        
        
    }
    
}
