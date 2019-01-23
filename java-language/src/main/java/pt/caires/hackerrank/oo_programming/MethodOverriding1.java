package pt.caires.hackerrank.oo_programming;

class Sports
{
    String getName()
    {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports
{
    @Override
    String getName()
    {
        return "Soccer Class";
    }

    @Override
    void getNumberOfTeamMembers()
    {
        System.out.println("Each team has 11 players in " + getName());
    }
}

/**
 *
 */
public class MethodOverriding1
{
    public static void main(final String[] args)
    {
        printSports(new Sports());
        printSports(new Soccer());
    }

    private static void printSports(final Sports sports)
    {
        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
    }
}
