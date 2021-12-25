



package example2;



public class Stack {

   
 /*  
 ftiaxno mia stoiva h opoia pernei times dld tis kanei push kai meta tis kanei pop
 h stiva bgazei PANTA to teleftaio stoixeio to opoio eixe isxorithei ston pinaka
 h stoiva sthn arxh einai kenh kai meta thn gemizo ego symfona me ta methods pou exo ftiaksei
 */   
    public static void main(String[] args) {

      //dhmiourgo to antikeimeno
      Stack_class stack =new Stack_class();
      
      stack.Push(2);
      stack.Push(0);
      stack.Push(1);
      stack.Push(2);
      stack.Push(-32);
      stack.Push(-2);
      stack.Push(3);
      
        System.out.println(stack);
        System.out.println("-----------------------------");
        System.out.println("Peaking:" + stack.peak());
        System.out.println("------------------------------");
        
        while(!stack.isempty())
            System.out.println(stack.pop());
        
    }
    
}
