/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author ASUS
 */
public class Latihan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        array x;
        x = new array(10); // 10 itu parameter 
        x.add (20);
        x.add (10);
        x.add (15);
        
        x.print();
        
        
        
//        array y;
//        y = new array (15);
//        
//        array [] z ; // array of array 
        
    
        boolean result;
        result = x.isEmpty();
        System.out.println(result);
        
        int a;
        a = x.get (3);
        
        int b;
        b = x.getPosition (7);
        
       
    
    
    }
 
 
}

 
    