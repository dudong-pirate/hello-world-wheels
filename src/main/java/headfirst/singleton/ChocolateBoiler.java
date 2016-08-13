package headfirst.singleton;

/**
 * 利用双重检查加锁 double-checked locking ,首先检查是否实例已经创建了,
 * 如果尚未创建,"才"进行同步。
 * Created by Du on 16/8/13.
 */
public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getChocolateBoiler() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null) {  // 进入这个区块后,再检查一次。如果仍然是null,才创建实例。
                    chocolateBoiler = new ChocolateBoiler();
                }
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }


    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
