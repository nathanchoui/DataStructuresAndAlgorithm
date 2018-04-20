package collection.Tree;

import java.util.LinkedList;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/19.
 */
public class BinaryTreeIterator<E> {

    private BinaryTreeIterator() {}

    // 采用线程安全的单例模式
    private static class InstanceHolder<E> {
        private static final BinaryTreeIterator instance = new BinaryTreeIterator<>();
    }

    public static <E> BinaryTreeIterator<E> getInstance() {
        return InstanceHolder.instance;
    }


    /**
     * 前序遍历
     * DLR
     * 时间复杂度: O(n)
     * 空间复杂度: O(n)
     *
     * @param root
     */
    public void preOrder(BinaryTreeNode<E> root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }
    }

    /**
     * 中序遍历
     * LDR
     * 时间复杂度: O(n)
     * 空间复杂度: O(n)
     *
     * @param root
     */
    public void inOrder(BinaryTreeNode<E> root) {
        if (root != null) {
            inOrder(root.getLeftNode());
            System.out.print(root.getData() + " ");
            inOrder(root.getRightNode());
        }
    }

    /**
     * 后序遍历
     * LDR
     * 时间复杂度: O(n)
     * 空间复杂度: O(n)
     *
     * @param root
     */
    public void postOrder(BinaryTreeNode<E> root) {
        if (root != null) {
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            System.out.print(root.getData() + " ");
        }
    }

    /**
     * 层次遍历
     * 时间复杂度: O(n)
     * 空间复杂度: O(n)
     *
     * @param root
     */
    public void levelOrder(BinaryTreeNode<E> root) {
        if (root == null) {
            return;
        }
        LinkedList<BinaryTreeNode<E>> list = new LinkedList<>();
        list.add(root);
        BinaryTreeNode<E> temp = null;
        while (!list.isEmpty()) {
            temp = list.poll();
            if (temp == null) {
                break;
            }
            System.out.print(temp.getData() + " ");
            if (root.getLeftNode() != null) {
                list.add(temp.getLeftNode());
            }
            if (root.getRightNode() != null) {
                list.add(temp.getRightNode());
            }
        }
    }
}
