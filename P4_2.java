class myexception extends Exception
{ 
       
          public myexception(String s)
           {
            super(s);            
          } 
        }  
    
      public  class P4_2{
        //main method  
        public static void main(String args[]) throws myexception{  
            //calling the function  
            try{
                throw new myexception("exception");
            }
            catch(myexception e)
            {
                System.out.println(e.getMessage());
            }
               
      }    
    }    