/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author IB
 */
 public  class A {
     static class b
     {
        private void show()
         {
             System.out.println("inner");
         }
     }
     public static void main(String[] args) {
         A.b b1=new A.b();
         b1.show();
        
     }
 
}

