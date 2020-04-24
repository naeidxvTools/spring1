package net.imwork.zhanlong.spring7;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CgLibProxy implements MethodInterceptor
{
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class<?> clazz)
    {
        // 设置子类对象的父类是谁
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);

        // 创建子类对象
        Object o = enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy)
            throws Throwable
    {
        System.out.println(o.getClass().getName() + "." + method.getName());

        // 执行父类的对应方法
        Object result = methodProxy.invokeSuper(o, objects);

        System.out.println("执行结束");
        return result;
    }

    public static void main(String[] args)
    {
        CgLibProxy proxy = new CgLibProxy();
        Person7 person = (Person7) proxy.getProxy(Person7.class);
        System.out.println(person.getClass().getName());
        person.Study();
    }
}
