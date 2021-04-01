package com.parallel.test3;

import com.parelles.pages.Page3;
import org.testng.annotations.Test;

public class Test3 extends TestGuru99MultipleSession3{
    @Test
    public void test3() throws InterruptedException {
        Page3 t3 = new Page3(driver);
        t3.scrollTillElementVisible();
        Thread.sleep(20000);

        t3.clickonlink();
        Thread.sleep(20000);


    }
}
