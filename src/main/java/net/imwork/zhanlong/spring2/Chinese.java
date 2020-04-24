package net.imwork.zhanlong.spring2;

public class Chinese implements Person
{
    private Tool tool;

    public Chinese(Tool tool)
    {
        this.tool = tool;
    }

    public Chinese()
    {
    }

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
