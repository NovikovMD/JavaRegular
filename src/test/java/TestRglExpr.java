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
        Assert.assertFalse(RegularExpressions.Task1("Some random text, 255.255.255.255"));    }

    @Test
    public void Task2_1(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }
    @Test
    public void Task2_2(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("077ef8ae-0c41-49b3-aaa9-e1ba36f0f341"));
    }
    @Test
    public void Task2_3(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("e517fb41-e032-46b2-a94b-9a2fcfa3f2f6"));
    }
    @Test
    public void Task2_4(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("e02fd0e4-00fd-090A-CA30-0d00a0038ba0"));
    }
    @Test
    public void Task2_5(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("11111111-2222-3333-4444-555555555555"));
    }
    @Test
    public void Task2_6(){
        Assert.assertTrue(RegularExpressions.FindOutIfRegexIncluded("aaaaaaaa-bbbb-cccc-dddd-eeeeeeeeeeee"));
    }
    @Test
    public void Task2_1Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("e02fd0e400fd090Aca300d00a0038ba0"));
    }
    @Test
    public void Task2_2Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("aaaaaaaa@bbbb/cccc^dddd:eeeeeeeeeeee"));
    }
    @Test
    public void Task2_3Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("f708e505-60d1-414f-b006-gggggggggggg"));
    }
    @Test
    public void Task2_4Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("a-bbbb-cccc-dddd-eeeeeeeeeeee"));
    }
    @Test
    public void Task2_5Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("aaaaaaaa-bbbb-cccc-dddd-eeee"));
    }
    @Test
    public void Task2_6Wrong(){
        Assert.assertFalse(RegularExpressions.FindOutIfRegexIncluded("aaaaaaaa-cccc-dddd-eeeeeeeeeeee"));
    }

    @Test
    public void Task3_1(){
        Assert.assertEquals("http://www.example.com",RegularExpressions.GetFromText("Some text http://www.example.com here "));
    }

}
