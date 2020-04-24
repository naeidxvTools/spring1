package net.imwork.zhanlong.spring6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

// 来自于aop联盟的通知
public class MyAroundAdvice implements MethodInterceptor
{
    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable
    {
        System.out.println("进入到invoke方法:");
        Object proceed = invocation.proceed();
        System.out.println("退出invoke方法。");
        return proceed;
    }
}
