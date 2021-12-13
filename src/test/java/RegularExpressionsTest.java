import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionsTest {

    ///IP Tests

    @Test
    public void IPTest1() {
        Assert.assertTrue(RegularExpressions.isIP("0.0.0.0"));
    }

    @Test
    public void IPTest2() {
        Assert.assertTrue(RegularExpressions.isIP("255.255.0.0"));
    }

    @Test
    public void IPTest3() {
        Assert.assertTrue(RegularExpressions.isIP("127.43.45.89"));
    }

    @Test
    public void IPTest4() {
        Assert.assertTrue(RegularExpressions.isIP("255.255.255.255"));
    }

    @Test
    public void IPTest5() {
        Assert.assertTrue(RegularExpressions.isIP("10.10.10.0"));
    }

    @Test
    public void IPTest6() {
        Assert.assertFalse(RegularExpressions.isIP("256.0.0.0"));
    }

    @Test
    public void IPTest7() {
        Assert.assertFalse(RegularExpressions.isIP("25.10.12.34.0"));
    }

    @Test
    public void IPTest8() {
        Assert.assertFalse(RegularExpressions.isIP("abc.def.gha.bcd"));
    }

    @Test
    public void IPTest9() {
        Assert.assertFalse(RegularExpressions.isIP("010.300.10.10"));
    }

    @Test
    public void IPTest10() {
        Assert.assertFalse(RegularExpressions.isIP("240.255.134"));
    }


    ///GUID Tests

    @Test
    public void GUIDTest1() {
        Assert.assertTrue(RegularExpressions.isGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
    }

    @Test
    public void GUIDTest2() {
        Assert.assertTrue(RegularExpressions.isGUID("00000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void GUIDTest3() {
        Assert.assertTrue(RegularExpressions.isGUID("abcdefab-abcd-abdc-ABDC-abcdefabcdef"));
    }

    @Test
    public void GUIDTest4() {
        Assert.assertTrue(RegularExpressions.isGUID("12312345-4567-6125-4214-643711325476"));
    }

    @Test
    public void GUIDTest5() {
        Assert.assertTrue(RegularExpressions.isGUID("c03b56e4-1bc1-BC54-245F-1bC815fFd67A"));
    }

    @Test
    public void GUIDTest6() {
        Assert.assertFalse(RegularExpressions.isGUID("gbcdefab-abcd-abdc-ABDC-abcdufabcdef"));
    }

    @Test
    public void GUIDTest7() {
        Assert.assertFalse(RegularExpressions.isGUID("e02fd0e400fd090Aca300d00a0038ba0"));
    }

    @Test
    public void GUIDTest8() {
        Assert.assertFalse(RegularExpressions.isGUID("12312345-6125-4214-643711325476"));
    }

    @Test
    public void GUIDTest9() {
        Assert.assertFalse(RegularExpressions.isGUID("c03b56e4-1bc1-BC54-245F-f567-1bC815fFd67A"));
    }

    @Test
    public void GUIDTest10() {
        Assert.assertFalse(RegularExpressions.isGUID("c03b56e456-1bc1-BC54-245F-1bC815fFd67A"));
    }

    ///URL Tests

    @Test
    public void URLTest1() {
        Assert.assertTrue(RegularExpressions.isURL("http://www.example.com"));
    }

    @Test
    public void URLTest2() {
        Assert.assertTrue(RegularExpressions.isURL("http://example.com"));
    }

    @Test
    public void URLTest3() {
        Assert.assertTrue(RegularExpressions.isURL("https://translate.google.com"));
    }

    @Test
    public void URLTest4() {
        Assert.assertTrue(RegularExpressions.isURL("translate.google.com"));
    }

    @Test
    public void URLTest5() {
        Assert.assertTrue(RegularExpressions.isURL("https://www.vyatsu.ru"));
    }

    @Test
    public void URLTest6() {
        Assert.assertFalse(RegularExpressions.isURL("Just Text"));
    }

    @Test
    public void URLTest7() {
        Assert.assertFalse(RegularExpressions.isURL("http://a.com"));
    }

    @Test
    public void URLTest8() {
        Assert.assertFalse(RegularExpressions.isURL("translate_google_com"));
    }

    @Test
    public void URLTest9() {
        Assert.assertFalse(RegularExpressions.isURL("vyatsu.231"));
    }

    @Test
    public void URLTest10() {
        Assert.assertFalse(RegularExpressions.isURL("http://example-.com"));
    }

    ///Password Tests

    @Test
    public void PWTest1() {
        Assert.assertTrue(RegularExpressions.isStrongPassword("C00l_Pass"));
    }

    @Test
    public void PWTest2() {
        Assert.assertTrue(RegularExpressions.isStrongPassword("SupperPas1"));
    }

    @Test
    public void PWTest3() {
        Assert.assertTrue(RegularExpressions.isStrongPassword("Passw0rd"));
    }

    @Test
    public void PWTest4() {
        Assert.assertTrue(RegularExpressions.isStrongPassword("Newpw123"));
    }

    @Test
    public void PWTest5() {
        Assert.assertTrue(RegularExpressions.isStrongPassword("A_b_c_D_1"));
    }

    @Test
    public void PWTest6() {
        Assert.assertFalse(RegularExpressions.isStrongPassword("Cool_pass"));
    }

    @Test
    public void PWTest7() {
        Assert.assertFalse(RegularExpressions.isStrongPassword("C00l"));
    }

    @Test
    public void PWTest8() {
        Assert.assertFalse(RegularExpressions.isStrongPassword("ABC123ABC"));
    }

    @Test
    public void PWTest9() {
        Assert.assertFalse(RegularExpressions.isStrongPassword("New password1"));
    }

    @Test
    public void PWTest10() {
        Assert.assertFalse(RegularExpressions.isStrongPassword("!Pass123"));
    }
}