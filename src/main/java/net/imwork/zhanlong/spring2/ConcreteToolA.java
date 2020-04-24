package net.imwork.zhanlong.spring2;

public class ConcreteToolA implements Tool
{
    @Override
    public void realWork()
    {
        System.out.println("from ConcreteToolA");
    }
}
