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
public class array {
    int [] data;
    int maxSize;
    int size;
    
    public array (int maxSize){ // nama variable yang sama di class 
        this.maxSize = maxSize; // menyatakan yang di variable yang punya nya array namanya This.maxsize atau isi variable diatas
        data = new int [this.maxSize]; 
        this.size = 0;
    }
        public boolean isEmpty(){
            return (size ==0);
            }
        public boolean isFull (){
            return (size == maxSize);
   }
               public void add (int item){
                   if (!isFull())
                       data[size++] = item;
   }
   
               public void print (){
                   for (int i = 0; i<size; i ++){
                       System.out.println(data [i]+"");
               }
   }
              public int get (int position){
                  if (position < size -1)
                      return data [position];
                  else
                      return -1000;
              }
              public int getPosition (int Item){
       int position =0;
       while ((position < size)&& (data[position]!=Item))
       position ++;
       if (position<size)
           return position;
       else 
           return -1;
   }
          
              
       }
   
    
 

