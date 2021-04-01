package com.parallel.tests1;

import com.parelles.pages.Page1;
import org.testng.annotations.Test;

public class Test1 extends TestGuru99MultipleSession1
{
    @Test
    public void test1()
    {
        Page1 p = new Page1(driver);
        p.scrollTillElementVisible();
        p.clickonlink();
    }
}
