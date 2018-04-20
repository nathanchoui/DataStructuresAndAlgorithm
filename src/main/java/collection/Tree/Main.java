package collection.Tree;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/18.
 */
public class Main {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = Main.getTree();
        BinaryTreeIterator<Integer> iterator = BinaryTreeIterator.getInstance();
        System.out.println("前序遍历：");
        iterator.preOrder(root);
        System.out.println();
        System.out.println("中序遍历：");
        iterator.inOrder(root);
        System.out.println();
        System.out.println("后序遍历：");
        iterator.postOrder(root);
        System.out.println();
        System.out.println("层次遍历：");
        iterator.levelOrder(root);
//        System.out.println();
//        System.out.println("中序遍历：");
//        root.preOrder(root);

    }

    private static BinaryTreeNode<Integer> getTree() {
        BinaryTreeNode<Integer> one = new BinaryTreeNode<>();
        one.setData(1);
        BinaryTreeNode<Integer> two = new BinaryTreeNode<>();
        two.setData(2);
        BinaryTreeNode<Integer> three = new BinaryTreeNode<>();
        three.setData(3);
        BinaryTreeNode<Integer> four = new BinaryTreeNode<>();
        four.setData(4);
        BinaryTreeNode<Integer> five = new BinaryTreeNode<>();
        five.setData(5);
        BinaryTreeNode<Integer> six = new BinaryTreeNode<>();
        six.setData(6);
        BinaryTreeNode<Integer> seven = new BinaryTreeNode<>();
        seven.setData(7);

        two.setLeftNode(four);
        two.setRightNode(five);

        three.setLeftNode(six);
        three.setRightNode(seven);

        one.setLeftNode(two);
        one.setRightNode(three);
        return one;
    }
}
