package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainSumLessBonus() {

        int actual = service.remain(300);
        int excepted = 600;

        Assert.assertEquals(actual, excepted);
    }

    @Test
    public void remianSumLowerBonus(){
        int actual = service.remain(1);
        int expected = 999;

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void remainSumUpperBonus(){
        int actual = service.remain(999);
        int expected = 1;

        Assert.assertEquals(actual,expected);

    }

    @Test
    public void remainSumEqualBonus() {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }

}


