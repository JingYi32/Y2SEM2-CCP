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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadExtend T1 = new ThreadExtend("Thread-1");
        T1.start();
        ThreadExtend T2 = new ThreadExtend("Thread-2");
        T2.start();

    }
    
}
