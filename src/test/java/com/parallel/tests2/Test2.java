package com.parallel.tests2;

import com.parelles.pages.Page2;
import com.qa.pages.LoginPage;
import org.testng.annotations.Test;

public class Test2 extends TestGuru99MultipleSession2{
    @Test
    public void testLogin() throws InterruptedException {
       Page2 page2 = new Page2(driver);
       page2.scrollTillElementVisible();
        Thread.sleep(20000);
        page2.clickonlink();
        Thread.sleep(20000);
    }
}
