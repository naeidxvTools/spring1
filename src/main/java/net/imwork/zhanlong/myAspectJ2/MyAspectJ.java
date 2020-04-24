package net.imwork.zhanlong.myAspectJ2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 基于xml配置文件方式的aspectj
 */
public class MyAspectJ
{
    public void beforeExecute(JoinPoint joinPoint)
    {
        System.out.println("before execute2");
    }

    public Object myOperation(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
    {
        System.out.println("myOperation2");
        return proceedingJoinPoint.proceed();
    }

    public void afterExecute(JoinPoint joinPoint)
    {
        System.out.println("after execute2");
    }
}
