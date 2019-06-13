import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

gaiclass lab2 {
    private void print(String orgStr, String cmpStr, int toffset, int ooffset, int len)
    {
        String toShow = "";
        if (toffset < 0)
            toShow+="toffset < 0 \n";
        else
            toShow+="toffset >= 0 \n";
        if (ooffset < 0)
            toShow+="oofset < 0 \n";
        else
            toShow+="offset >= 0 \n";
        if ((toffset <= (long) orgStr.length()-len))
            toShow+="toffset <= (long)value.length - len\n";
        else
            toShow+="toffset > (long)value.length - len\n";
       if((ooffset <= (long)cmpStr.length() - len))
           toShow+="offset <= (long)other.value.length - len\n";
       else
           toShow+="offset > (long)other.value.length - len\n";
       System.out.println(toShow);
    }


    @Test
    public void case11()
    {
        String s = "Welcome to Java";
        StringBuffer cs = new StringBuffer(("Welcome to Java"));
        assertEquals(true, s.contentEquals(cs));
    }

    @Test
    public void case12()
    {
        String s = "Welcome to Java";
        StringBuilder cs = new StringBuilder("Welcome to Java");
        assertEquals(true,s.contentEquals(cs));
    }

    @Test
    public void case13()
    {
        String s = "Welcome to Java";
        String cs = new String("Welcome to Java");
        assertEquals (true, s.contentEquals(cs));
    }

    @Test
    public void case14()
    {
        String s = "Welcome to Java";
        CharSequence cs = new myCharSequence("Welcome to Java");
        assertEquals(true, s.contentEquals(cs));
    }

    @Test
    public void case15()
    {
        String s = "Welcome to Java";
        CharSequence cs = new myCharSequence("Welcome");
        assertEquals(false, s.contentEquals(cs));
    }

    @Test
    public void case16()
    {
        String s = "Welcome to Java";
        CharSequence cs = new myCharSequence("Welcome to Jjaa");
        assertEquals(false, s.contentEquals(cs));
    }

    @Test
    public void case21()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome to Java";
        int toffset = -1;
        int ooffse = -1;
        int len = 20;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(-1,"Welcome to Java", -1, 5));
    }

    @Test
    public void case22()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = -1;
        int ooffse = -1;
        int len = 15;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case23()
    {
        String orgStr = "Welcome";
        String cmpStr = "Welcome to Java";
        int toffset = -1;
        int ooffse = -1;
        int len = 15;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case24()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome to Java";
        int toffset = -10;
        int ooffse = -10;
        int len = 15;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case25()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 0;
        int ooffse = -1;
        int len = 15;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case26()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 0;
        int ooffse = 20;
        int len = 15;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case27()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 0;
        int ooffse = 1;
        int len = 8;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case28()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 0;
        int ooffse = 1;
        int len = 8;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case29()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = -1;
        int ooffse = 10;
        int len = 8;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case30()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome to Java Java";
        int toffset = -1;
        int ooffse = 0;
        int len = 13;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case31()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = -20;
        int ooffse = 0;
        int len = 13;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case32()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = -1;
        int ooffse = 0;
        int len = 1;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case34()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 8;
        int ooffse = 0;
        int len = 4;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case33()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 8;
        int ooffse = 0;
        int len = 20;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case35()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome";
        int toffset = 0;
        int ooffse = 0;
        int len = 8;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertFalse(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case36()
    {
        String orgStr = "Welcome to Java";
        String cmpStr = "Welcome to Java";
        int toffset = 0;
        int ooffse = 0;
        int len = 8;
        this.print(orgStr, cmpStr, toffset, ooffse, len);
        assertTrue(orgStr.regionMatches(toffset, cmpStr, ooffse, len));
    }

    @Test
    public void case3_1()
    {
        assertFalse("Welcome".startsWith("Welcome to Java", -1));
    }

    @Test
    public void case3_2()
    {
        assertFalse("Welcome to Java".startsWith("Welcome", -1));
    }

    @Test
    public void case3_3()
    {
        assertFalse("Welcome to Java".startsWith("Welcome", 8));
    }

    @Test
    public void case3_4()
    {
        assertFalse("Welcome to Java".startsWith("Welcome to C++", 0));
    }

    @Test
    public void case3_5()
    {
        assertTrue("Welcome to Java".startsWith("Welcome", 0));
    }

    @Test // H
    public void case4_1()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        System.out.println(s.indexOf("",30));
        assertEquals(15, s.indexOf("",30));
    }

    @Test // I
    public void case4_2()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        assertEquals(0, s.indexOf("",-1));
        System.out.println(s.indexOf("",-1));
    }

    @Test // G
    public void case4_3()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        assertEquals(11, s.indexOf("Java",-1));
        System.out.println(s.indexOf("Java",-1));
    }


    @Test // A
    public void case4_4()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        assertEquals(-1, s.indexOf("Welcome to Java",5));
    }
    @Test // B
    public void case4_5()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        assertEquals(-1, s.indexOf("Welcome to Java and Python",5));
    }

    @Test // F
    public void case4_6()
    {
        StringBuilder s = new StringBuilder("欢迎 to Java");
        System.out.println(s.indexOf("Welcome to Java",0));
        assertEquals(-1, s.indexOf("Welcome to Java",0));
    }

    @Test // E
    public void case4_7()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        System.out.println(s.indexOf("欢迎",0));
        assertEquals(0, s.indexOf("Welcome to Java",0));
    }

    @Test // D
    public void case4_8()
    {
        StringBuilder s = new StringBuilder("欢迎 to Java");
        System.out.println(s.indexOf("欢迎",0));
        assertEquals(0, s.indexOf("欢迎",0));
    }

    @Test // C
    public void case4_9()
    {
        StringBuilder s = new StringBuilder("Welcome to Java");
        System.out.println(s.indexOf("Java",0));
        assertEquals(11, s.indexOf("Java",0));
    }

    @Test
    public void case5_1()
    {
        final String[] strs = "aaaobbboccc".split("o", 2);
        //assertAll(()->assertTrue("aaa".equals(strs[0])));
        assertAll(()->assertTrue("aaa".equals(strs[0])),
                ()->assertTrue("bbboccc".equals(strs[1])));
    }

    @Test
    public void case5_2()
    {
        String[] strs = "aaaobbboccc".split("o",3);
        assertAll(()->assertTrue("aaa".equals(strs[0])),
                ()->assertTrue("bbb".equals(strs[1])),
                ()->assertTrue("ccc".equals(strs[2])));
    }
    @Test
    public void case5_3()
    {
        String[] strs = "aaaobbboccc".split("k", 0);
        assertAll(()->assertTrue("aaaobbboccc".equals(strs[0])));
    }

    @Test
    public void case5_4()
    {
        String[] strs = "aaaobbboccco".split("o", 0);
        assertAll(()->assertTrue(3==strs.length),
                ()->assertTrue("aaa".equals(strs[0])),
                ()->assertTrue("bbb".equals(strs[1])),
                ()->assertTrue("ccc".equals(strs[2]))
                );
    }

    @Test
    public void case5_5()
    {
        String[] strs = "aaaoobbbooccc".split("oo", 0);
        assertAll(()->assertTrue(3==strs.length),
                ()->assertTrue("aaa".equals(strs[0])),
                ()->assertTrue("bbb".equals(strs[1])),
                ()->assertTrue("ccc".equals(strs[2]))
        );
    }
}

class myCharSequence implements CharSequence
{
    public myCharSequence(String str) {
        this.value = str.toCharArray();
    }
    private char[] value;
    public int length() {
        return value.length;
    }
    public char charAt(int index) {
        return this.value[index];
    }
    public CharSequence subSequence(int start, int end) {
        return new myCharSequence(new String(value).substring(start, end + 1));
    }
}
