package net.imwork.zhanlong.spring6;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

// 异常通知
public class TransactionManager6 implements ThrowsAdvice
{
    // 这里的方法名一定是 afterThrowing
    public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
    {
        System.out.println("=========================");

        System.out.println("method: " + method.getName());

        System.out.println("抛出异常： " + ex.getMessage());

        System.out.println("成功回滚事务");
    }

    public void afterThrowing(Exception ex)
    {
        System.out.println("抛出异常： " + ex.getMessage());

        System.out.println("成功回滚事务");
    }
}
