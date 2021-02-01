package com.xask00.study.ds;

import com.xask00.study.LRUCache;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LRUCacheTest {
    private LRUCache lruCache;

    @Before
    public void setup() {
        this.lruCache = new LRUCache(3);
    }

    @Test
    public void test1() {
        Assert.assertEquals("Fetch from empty cash should give -1", -1, this.lruCache.get(1));
        this.lruCache.put(1, 10);
        Assert.assertEquals("invalid key should give -1", -1, this.lruCache.get(2));
    }

    @Test
    public void test2() {
        this.lruCache.put(1, 10);
        Assert.assertEquals("Entry should be inserted", 10, this.lruCache.get(1));
        this.lruCache.put(2, 20);
        this.lruCache.put(3, 30);
        this.lruCache.put(4, 40);
        Assert.assertEquals("Should return latest entry", 40, this.lruCache.get(4));
        Assert.assertEquals("Last entry should get removed", -1, this.lruCache.get(1));
    }

    @Test
    public void test3() {
        this.lruCache.put(1, 10);
        this.lruCache.printCache();
        this.lruCache.put(2, 20);
        this.lruCache.printCache();
        Assert.assertEquals("Entry should be found and made latest", 10, this.lruCache.get(1));
        this.lruCache.put(3, 30);
        this.lruCache.printCache();
        this.lruCache.put(4, 40);
        this.lruCache.printCache();
        Assert.assertEquals("Should return latest entry", 40, this.lruCache.get(4));
        Assert.assertEquals("Last used entry should get removed", -1, this.lruCache.get(2));
    }
}
