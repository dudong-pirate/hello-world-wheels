package knowledgebase.sort;

import java.util.Arrays;

/**
 * Created by Du on 16/7/20.
 */
public class Sort {

    /**
     * description : 快速排序
     * @autor dudong
     * modify :2016-7-20
     *
     * @param left
     * @param right
     * @return
     */
    static void quicksort(int n[], int left, int right) {
        int dp;
        System.out.println("Before sort:");
        System.out.println(Arrays.toString(n));
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
        System.out.println("After sort:");

        System.out.println(Arrays.toString(n));
    }

    static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {

            // 找到右侧第一个小于pivot的数
            while (left < right && n[right] >= pivot) {
                right--;
            }

            // 将刚刚找到的数字放到 left 位置, left 右移一位
            if (left < right) {
                n[left++] = n[right];
            }


            // 找到左侧第一个大于pivot的数
            while (left < right && n[left] <= pivot) {
                left++;
            }


            // 将刚刚找到的数字放到 right 位置
            if (left < right)
                n[right--] = n[left];
        }

        // 最终 left 和 right 交叉 即中轴位置 把之前保存的pivot放到此处
        n[left] = pivot;

        return left;
    }

}
