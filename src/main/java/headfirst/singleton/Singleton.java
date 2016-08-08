package headfirst.singleton;

/**
 * Created by Du on 16/6/19.
 */
public class Singleton {

    // 利用一个静态变量来记录Singleton类的唯一实例
    private static Singleton uniqueInstance;

    // 把构造器声明为私有的,只有Singleton类内才能调用
    private Singleton() {};

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
