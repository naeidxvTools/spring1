package net.imwork.zhanlong.spring5;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//生命周期相关的方法
public class Chinese implements Person, InitializingBean, DisposableBean
{
    private Tool tool;

    public Chinese()
    {
        System.out.println("Chinese实例构造方法得到调用。");
    }

    public void setTool(Tool tool)
    {
        System.out.println("setTool()方法得到调用。");
        this.tool = tool;
    }

    @Override
    public void work()
    {
        System.out.println(this.tool.realWork());
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("destroy()得到调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception
    {
        System.out.println("afterPropertiesSet()得到调用");
    }

    public void init()
    {
        System.out.println("init()得到调用");
    }

    public void close()
    {
        System.out.println("close()得到调用");
    }
}
