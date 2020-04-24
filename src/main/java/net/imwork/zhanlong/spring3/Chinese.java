package net.imwork.zhanlong.spring3;

public class Chinese implements Person
{
    private Tool tool;

    public void setTool(Tool tool)
    {
        this.tool = tool;
    }

    public Tool getTool()
    {
        return tool;
    }

    @Override
    public void work()
    {
        tool.realWork();
    }
}
