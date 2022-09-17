import org.junit.*;

public class TestRglExpr {

    @Test
    public void Task1_1(){
        Assert.assertTrue(RegularExpressions.Task1("127.0.0.1"));
    }
    @Test
    public void Task1_2(){
        Assert.assertTrue(RegularExpressions.Task1("255.255.255.0"));
    }
    @Test
    public void Task1_3(){
        Assert.assertTrue(RegularExpressions.Task1("0.1.2.3"));
    }
    @Test
    public void Task1_4(){
        Assert.assertTrue(RegularExpressions.Task1("249.230.189.199"));
    }
    @Test
    public void Task1_5(){
        Assert.assertTrue(RegularExpressions.Task1("255.254.253.252"));
    }
    @Test
    public void Task1_6(){
        Assert.assertTrue(RegularExpressions.Task1("9.59.180.1"));
    }
    @Test
    public void Task1_1Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("256.59.180.1"));
    }
    @Test
    public void Task1_2Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("abd.59.180.1"));
    }
    @Test
    public void Task1_3Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("9.59.180.1."));
    }
    @Test
    public void Task1_4Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("9,59,180,1"));
    }
    @Test
    public void Task1_5Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("255"));
    }
    @Test
    public void Task1_6Wrong(){
        Assert.assertFalse(RegularExpressions.Task1("Some random text, 255.255.255.255"));
    }

}
