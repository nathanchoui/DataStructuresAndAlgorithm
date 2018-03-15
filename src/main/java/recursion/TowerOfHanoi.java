package recursion;

import java.text.MessageFormat;

/**
 * Title: 汉诺塔问题
 *
 * Description:
 * 问题描述：
 *
 *  A,B,C 三根柱子。
 *  A上有n个圆盘，自上向下从小到大排列。
 *  将A柱上的所有圆盘移动到B柱。
 *  每次只能移动一个圆盘，每个圆盘只能放在比自己大的圆盘上面。
 *
 *
 * 算法分析：
 *  1、从A柱上移动n-1个圆盘到C
 *  2、从A柱上移动第n个圆盘到B
 *  3、借助A柱从C移动n-1个圆盘到B
 *
 *
 * <p>
 * Created by zhangwei on 2018/3/13.
 */
public class TowerOfHanoi {

    private static int moveCount = 0;

    public void move(int moveNum, char from, char to, char temp) {
        if (moveNum == 1) {
            moveCount ++;
            System.out.println("move disk 1 from " + from + " to " + to);
            return;
        }
        move(moveNum - 1, from, temp, to);
        //System.out.println("move disk from " + from + " to " + to);
        move(moveNum - 1, temp, to, from);
    }

    public static void main(String[] args) {
        TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
        towerOfHanoi.move(3, 'A' , 'B', 'C');
        System.out.println("moveCount: " + moveCount);
    }
}
