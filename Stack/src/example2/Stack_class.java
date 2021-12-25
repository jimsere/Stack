/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example2;


public class Stack_class {
    private int N;
    private int[] A;
    
    //constructor
    public Stack_class(){
        N=0;
        A=new int[2];
    
    }
    
    
    //methods
    
    public void Push(int n){
     A[N]=n;
     N++;
     
     if(N>=A.length -1)
     {
        doublesize();
     }
    }
    
    private void doublesize(){
    
    int[] temp=new int[A.length * 2]; 
    
    for(int i=0;i<N;i++)
    {
    temp[i]=A[i];
    
    
    }
    
    A=temp;
    
    
    
    }
    
 public int pop(){
    int toreturn=A[N-1];
    N--;
    if(N<=A.length/4)
    {
        halfsize();
    }
      return toreturn;  
 }
 
 public int peak(){
 return A[N-1];
 
 }
 
 public boolean isempty()
 {
   if(N==0)
   {
       return true;
   }
   else
   {
       return false;
   }
 
 }
 
 
 
 
 private void halfsize(){
 int[] temp=new int[A.length / 2]; 
    
    for(int i=0;i<N;i++)
    {
    temp[i]=A[i];
    
    
    }
    
    A=temp;
 
 }
 
 
 public String toString(){
   String toReturn="    ";
   
   
   for(int i=0;i<N;i++)
   {
      toReturn=toReturn+A[i]+"   ";
   }
   
 return toReturn;
 
 }
 
 
 
}
