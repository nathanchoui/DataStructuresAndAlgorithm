package collection.Tree;

import java.util.LinkedList;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/18.
 */
public class BinaryTreeNode<E> {
    // 数据部
    private E data;
    // 左子树
    private BinaryTreeNode<E> leftNode;
    // 右子树
    private BinaryTreeNode<E> rightNode;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public BinaryTreeNode<E> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode<E> leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode<E> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode<E> rightNode) {
        this.rightNode = rightNode;
    }
}
