public class P4_1 {  
  
    public static void main(String[] args) {  
        try  
        {  
            int data=50/0; //may throw exception  
            
        }  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        try {
            {
                int  a[] = new int[7];
                a[8] = 9; 

            }
        } 
        
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("Array Index is Out Of Bounds");
        }
       
    }  
      
}  