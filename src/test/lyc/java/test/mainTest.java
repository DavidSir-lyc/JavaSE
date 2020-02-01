package lyc.java.test;

import org.junit.Assert;
import org.junit.Test;

public class mainTest {
    @Test
    public void addTest() {
        int num = 1;
        num++;
        // 测试方法中用断言，输出不靠谱
        Assert.assertEquals(2,num);
    }
}
