package recursionStudy;

/**
 * Description:
 * <p>
 * 通过二叉树的中序遍历过程来分析汉诺塔问题：
 * <p>
 * 考虑A、B、C三根柱子，A上从上到下有1、2、3三个数，要把A上的数移动到C上，其过程应该是
 * <p>
 * 　　　　  A　　B　　C
 * <p>
 * 初始　　123
 * <p>
 * A->C　  23　　　　 1
 * <p>
 * A->B　  3　　2　　 1
 * <p>
 * C->B　  3　  12
 * <p>
 * A->C　  　　 12　　3
 * <p>
 * B->A　  1　　2　　 3
 * <p>
 * B->C　  1　　　　  23
 * <p>
 * A->C　    　　　　 123
 * <p>
 * <p>
 * <p>
 * <p>
 * <p>
 * Created by nathan.z on 2018/3/15.
 */
public class TowersOfHanoi {

    private static int count = 0;


    public void moveDisk(int diskNum, char from, char to, char inter) {
        count ++;
        if (diskNum == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        }
        else {
            moveDisk(diskNum - 1, from, inter, to);
            System.out.println("Disk " + diskNum + " from " + from + " to " + to);
            moveDisk(diskNum - 1, inter, to, from);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        towersOfHanoi.moveDisk(3, 'A', 'B', 'C');
        System.out.println(count);
    }
}
