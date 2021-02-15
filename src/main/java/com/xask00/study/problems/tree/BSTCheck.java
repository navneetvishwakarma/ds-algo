package com.xask00.study.problems.tree;

import com.xask00.study.ds.BinaryTreeNode;

public class BSTCheck {

    public boolean isBST(BinaryTreeNode root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBST(BinaryTreeNode node, int min, int max) {
        if (node == null) return true;
        if (node.getValue() < min || node.getValue() > max) {
            return false;
        }
        return isBST(node.getLeft(), min, node.getValue() - 1) && isBST(node.getRight(), node.getValue() + 1, max);
    }
}
