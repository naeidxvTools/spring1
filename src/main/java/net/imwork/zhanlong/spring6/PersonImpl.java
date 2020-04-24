package net.imwork.zhanlong.spring6;

public class PersonImpl implements Person
{
    private String name;
    private String address;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public void eat()
    {
        System.out.println(this.name + " 在吃饭。");
    }

    @Override
    public void sleep()
    {
        System.out.println(this.name + " 在睡觉。");
    }

    @Override
    public String study()
    {
        System.out.println(this.name + " 在" + this.address + " 学习。");
        return "我是返回值";
    }
}
