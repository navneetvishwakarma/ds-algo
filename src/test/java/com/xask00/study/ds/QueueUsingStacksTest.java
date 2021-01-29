package com.xask00.study.ds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueUsingStacksTest {
    private QueueUsingStacks queue;

    @Before
    public void initiate() {
        queue = new QueueUsingStacks();
    }

    @Test
    public void enqueueTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        Assert.assertEquals("Top element should be 1", 1, queue.peek());
    }

    @Test
    public void dequeueTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        int num = queue.dequeue();
        Assert.assertEquals("Dequeued element should be 1", 1, num);
        num = queue.dequeue();
        Assert.assertEquals("Dequeued element should be 2", 2, num);
        Assert.assertTrue("Queue must be empty", queue.isEmpty());
    }

    @Test
    public void QueueSizeTest() {
        queue.enqueue(1);
        queue.enqueue(2);
        Assert.assertEquals("Queue size should be 2", 2, queue.size());
        queue.dequeue();
        Assert.assertEquals("Queue size should be 1", 1, queue.size());
        queue.dequeue();
        Assert.assertEquals("Queue size should be 0", 0, queue.size());
    }

    @Test(expected = RuntimeException.class)
    public void dequeueExceptionTest() {
        queue.dequeue();
    }
}
