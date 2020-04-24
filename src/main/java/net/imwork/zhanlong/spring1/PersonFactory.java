package net.imwork.zhanlong.spring1;

public class PersonFactory
{

    public static Person getPerson(String str)
    {
        if ("chinese".equals(str))
        {
            return new Chinese();
        }

        return new American();
    }
}
