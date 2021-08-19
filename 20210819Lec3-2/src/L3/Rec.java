/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

/**
 *
 * @author jingy
 */
public class Rec extends Quad {
    
    public Rec(int a, int b)
    { 
        
        super(a,b,a,b);
         
    }
    public void area()
    {
        System.out.println("Area of Rec = "+ a*b);
    }
}
