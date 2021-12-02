package pt.caires.hackerrank.advanced;


class SingletonPattern {

    private static final SingletonPattern UNIQUE_INSTANCE = new SingletonPattern();

    public String str;

    private SingletonPattern() {
    }

    static SingletonPattern getSingleInstance() {
        return UNIQUE_INSTANCE;
    }

}
