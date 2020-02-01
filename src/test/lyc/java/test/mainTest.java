package lyc.java.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class mainTest {
    // 初始化方法，所有测试方法执行前，先执行
    @Before
    public void init() {
        System.out.println("init...");
    }

    @Test
    public void addTest() {
        int num = 1;
        num++;
        // 测试方法中用断言，输出不靠谱
        Assert.assertEquals(2,num);
    }

    // 最终方法，所有测试方法执行后，最后执行
    @After
    public void close() {
        System.out.println("close...");
    }
}
