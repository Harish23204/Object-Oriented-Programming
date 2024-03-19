public class Practical_7b
{
    public static void main(String[] args) 
    {
        int age = Integer.parseInt(args[0]);

        try
        {
            validate(age);
            System.out.println("Eligible for Voting");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static void validate(int age) throws ArithmeticException
    {
        if(age < 18)
        {
            throw new ArithmeticException("Not Eligible for Voting");
        }
    }
}