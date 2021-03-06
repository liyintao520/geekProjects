package com.demo.week1.work;

/**
 * @author liyintao
 * @version 1.0.0
 * @ClassName MyHeart.java
 * @Description
 * @createTime 2021年08月10日 01:26:00
 */
public class MyHeart {

    public static void main(String[] args) {
        System.out.println(printHeart("*"));
    }

    private static String printHeart(String input) {
        int[] array = {0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 4, 5, 2, 3, 4, 1, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (i % 7 == 0)
                sb.append("\n");
            if (array[i] == 0)
                sb.append("   ");
            else if (array[i] == 4)
                sb.append("  ");
            else if (array[i] == 5)
                sb.append(" I");
            else if (array[i] == 2)
                sb.append(" Love ");
            else if (array[i] == 3)
                sb.append("You");
            else
                sb.append("  " + input);
        }
        return sb.toString();
    }

}

