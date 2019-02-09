package pt.caires.hackerrank.advanced;

/**
 *
 */
class SingletonPattern
{
    private static final SingletonPattern uniqueInstance = new SingletonPattern();

    String str;

    private SingletonPattern()
    {
    }

    static SingletonPattern getSingleInstance()
    {
        return uniqueInstance;
    }
}
