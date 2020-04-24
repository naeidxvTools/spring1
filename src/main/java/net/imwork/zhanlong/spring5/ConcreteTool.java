package net.imwork.zhanlong.spring5;

public class ConcreteTool implements Tool
{
    public ConcreteTool()
    {
        System.out.println("ConcreteTool构造方法得到调用。");
    }

    @Override
    public String realWork()
    {
        return "realWork is invoked.";
    }
}
