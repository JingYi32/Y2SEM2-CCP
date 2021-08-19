/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author vazeer
 */
public class MainClass {
    
    public static void fun(Rec a)
    {
        a.area();
    }
    public static void main(String a[])
    {
        Rec r = new Rec(20,60);
        Square s =new Square(50);
        fun(r);
        fun(s);
        int c=Runtime.getRuntime().availableProcessors();
        System.out.println(c);
        
    }
}
