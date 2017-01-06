package concepts.src.stringmanipulation;

public class stringlenth {

static int i,c,res;
    
    static int length(String s)
    {
        try
        {
            /*Initialize two variables and keep the condition of the loop always true. 
            Iterate the whole string using one variable ,
            while use other variable as counter to count the length of the string .When the string completes , 
            then  String.charAt() will throw an exception as array index out of range exception , 
            which is caught in the catch block.*/
            for(i=0,c=0;0<=i;i++,c++)
            s.charAt(i);
        }
        catch(Exception e)
        //Array index out of bounds and array index out of range are different exceptions
        {
            System.out.print("length is ");
            // we can not put return  statement in catch
        }
        return c;
    }
    
    public static void main (String args[])
    {
        
        System.out.println("Original String is : ");
        System.out.println("Alive is awesome ");
        res=stringlenth.length("Alive is awesome ");
        System.out.println( res);
    }

}
