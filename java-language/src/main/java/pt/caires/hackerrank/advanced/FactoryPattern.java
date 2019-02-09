package pt.caires.hackerrank.advanced;

import java.security.Permission;
import java.util.Scanner;


interface Food
{
    String getType();
}

class Pizza implements Food
{
    @Override
    public String getType()
    {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food
{

    @Override
    public String getType()
    {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory
{
    Food getFood(final String order)
    {
        switch (order)
        {
            case "cake":
                return new Cake();
            case "pizza":
                return new Pizza();
            default:
                return null;
        }
    }
}

public class FactoryPattern
{
    public static void main(final String[] args)
    {
        Do_Not_Terminate.forbidExit();

        try
        {

            final Scanner sc = new Scanner(System.in);
            //creating the factory
            final FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            final Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        }
        catch (final Do_Not_Terminate.ExitTrappedException e)
        {
            System.out.println("Unsuccessful Termination!!");
        }
    }

}

class Do_Not_Terminate
{

    static class ExitTrappedException extends SecurityException
    {

        private static final long serialVersionUID = 1L;
    }

    static void forbidExit()
    {
        final SecurityManager securityManager = new SecurityManager()
        {
            @Override
            public void checkPermission(final Permission permission)
            {
                if (permission.getName().contains("exitVM"))
                {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}
