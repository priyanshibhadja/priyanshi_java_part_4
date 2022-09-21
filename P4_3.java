class P4_3
{
        public static void main(String[] args) 
        {     
            try{    
                System.out.println("try Block:: Begin");  
                int myArray[]=new int[5];    
                myArray [5]=10/0;    
            } 
            catch(ArithmeticException e)  
            {  
                System.out.println(e);  
            }
            catch(ArrayIndexOutOfBoundsException e)  
            {  
                System.out.println(e);  
            }          
            finally {
                System.out.println (":: Finally Block::");
            }
            
        }  
    }  