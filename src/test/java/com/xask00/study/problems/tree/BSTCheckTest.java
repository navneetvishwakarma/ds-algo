package com.xask00.study.problems.tree;

import com.xask00.study.ds.BinaryTreeNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BSTCheckTest {

    private BSTCheck bstCheck;
    private BinaryTreeNode root;

    @Before
    public void setup() {
        this.bstCheck = new BSTCheck();
        this.root = null;
    }

    @Test
    public void test1() {
        Assert.assertTrue("Empty tree should be valid BST", this.bstCheck.isBST(this.root));
    }

    @Test
    public void test2() {
        this.root = new BinaryTreeNode(50);
        this.root.setLeft(new BinaryTreeNode(30));
        this.root.setRight(new BinaryTreeNode(80));
        this.root.getLeft().setLeft(new BinaryTreeNode(20));
        this.root.getLeft().setRight(new BinaryTreeNode(49));
        Assert.assertTrue("Should be valid BST", this.bstCheck.isBST(this.root));
    }
}
