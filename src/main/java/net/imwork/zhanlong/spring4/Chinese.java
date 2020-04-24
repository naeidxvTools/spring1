package net.imwork.zhanlong.spring4;

import java.util.*;

public class Chinese implements Person
{
    private List list = new ArrayList();
    private Map map = new HashMap();
    private Set set = new HashSet();
    private Properties properties = new Properties();

    public void setList(List list)
    {
        this.list = list;
    }

    public void setMap(Map map)
    {
        this.map = map;
    }

    public void setSet(Set set)
    {
        this.set = set;
    }

    public void setProperties(Properties properties)
    {
        this.properties = properties;
    }

    @Override
    public void test()
    {
        System.out.println("list: "+list);
        System.out.println("map: "+ map);
        System.out.println("properties: "+properties);
        System.out.println("set: "+set);

    }
}
