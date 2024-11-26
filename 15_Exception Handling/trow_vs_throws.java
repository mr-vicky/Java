class NegativeDimentionException extends Exception
{
    public String toString(){
        return "Dimention of a rectangle cannot be negative";
    }
};

public class trow_vs_throws {
    static void meth1() throws NegativeDimentionException
    {
        int res = area(10, -20);
        System.out.println(res);
    }

    static int area(int a, int b) throws NegativeDimentionException
    {

        if(a < 0 || b < 0)
            throw new NegativeDimentionException();

        return a * b;
    }
    public static void main(String args[]) {
        try
        {
            meth1();
        }
        catch(NegativeDimentionException e){
            System.out.println(e);
        }
    }
}
