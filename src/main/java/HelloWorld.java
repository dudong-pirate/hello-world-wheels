import org.jdom2.input.SAXBuilder;

/**
 * Created by Du on 16/5/25.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello Mac!");

        String sa = new String("Hello World!");
        String sb = new String("Hello Wolrd!");

        String sc = "Hello World!";
        String sd = "Hello World!";

        /** 代码1中局部变量sa,sb中存储的是JVM在堆中new出来的两个String对象的内存地址。
         虽然这两个String对象的值(char[]存放的字符序列)都是"Hello world"。
         因此"=="比较的是两个不同的堆地址。代码2中局部变量sc,sd中存储的也是地址，
         但却都是常量池中"Hello world"指向的堆的唯一的那个拘留字符串对象的地址 。自然相等了。
         **/
        System.out.println(sa == sb);
        System.out.println(sa.equals(sb));
        System.out.println(sc == sd);
        System.out.println(sc.equals(sd));

        System.out.println(sa.hashCode());
        System.out.println(sb.hashCode());
        System.out.println(sc.hashCode());
        System.out.println(sd.hashCode());

    }

}
