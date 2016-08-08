package knowledgebase.string;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Du on 16/8/8.
 */
public class StringTest02 {

    public static void main(String[] args) {

        int arrLength = 100000;
        String originStr = getOriginStr(arrLength);

        System.out.println(originStr);
        System.out.println(originStr.substring(0,3));
        long start1 = System.currentTimeMillis();

        String[] arrSplit = originStr.split("\\.");
        System.out.println("使用 split() 耗时: " + (System.currentTimeMillis() - start1));
        System.out.println("截取字符串个数: " + arrSplit.length);


        String[] subStringArr = new String[arrLength];
        long st5 = System.currentTimeMillis();
        int len = originStr.lastIndexOf(".");
        System.out.println("使用String.substring()切分字符串");
        int k=0,count=0;

        for (int i = 0; i <= len; i++) {
            if(originStr.substring(i, i+1).equals(".")){
                if(count==0){
                    subStringArr[count] = originStr.substring(0, i);
                }else{
                    subStringArr[count] = originStr.substring(k+1, i);
                    if(i == len){
                        subStringArr[count + 1] = originStr.substring(len+1, originStr.length());
                    }
                }
                k=i;count++;
            }
        }
        System.out.println("String.substring()截取字符串用时: "+(System.currentTimeMillis()-st5));
        System.out.println("String.substring()截取字符串结果个数：" + subStringArr.length);
        System.out.println(Arrays.asList(subStringArr));

    }




    private static String getOriginStr(int n) {
        StringBuilder sb = new StringBuilder("10.");
        Random random = new Random();
        while (--n > 0) {
            sb.append(random.nextInt(9)).append(random.nextInt(9)).append(random.nextInt(9));
            if (n != 1) {
                sb.append(".");
            }
        }
        return sb.toString();
    }

}
