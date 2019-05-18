package com.jzh.springmvc.test;

/**
 * 1.求[15,200,3,47,63,78,94,10]数组中元素的平均值，
 * 并统计其中大于和小于此平均值的元素的个数。
 */
public class ArrayTest {

    public static void main(String[] args) {

        int[] numbers = new int[]{15, 200, 3, 47, 63, 78, 94, 10};
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int sun = 0;

        for (int i = 0; i < numbers.length; i++) {
            sun += numbers[i];
        }

        for (int j = 0; j < numbers.length; j++) {
            int num = numbers.length;
            if (numbers[j] > sun / num) {
                count++;
            } else if (numbers[j] < sun / num) {
                count1++;
            } else {
                count2++;
            }
        }

        System.out.println("平均值是：" + sun / numbers.length + "\n" +
                "大于平均值得有：" + count + "小于的有：" + count1 + "等于的有：" + count2);
    }
}
