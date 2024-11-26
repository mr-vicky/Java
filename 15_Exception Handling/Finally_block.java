public class Finally_block {
    static void meth1() throws Exception
    {
        try
        {
            throw new Exception();
        }
        finally{
            System.out.println("Finally");
        }
    }
    public static void main(String args[]) throws Exception
    {

        // Inside the main block
        // try
        // {
        //     System.out.println(10/0);
        // }
        // finally{
        //     System.out.println("Finally");
        // }

        // finally block inside another method
        meth1();
    }
}
