package net.imwork.zhanlong.spring1;

public class Chinese implements Person
{
    @Override
    public String sayHello(String name)
    {
        return name + ": 你好。";
    }

    @Override
    public String sayGoodbye(String name)
    {
        return name + ": 拜拜。";
    }
}
