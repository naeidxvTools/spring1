package net.imwork.zhanlong.spring_test;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;

//Mock测试
public class ServletTest
{
    @Test
    public void testServlet()
    {
        MockHttpServletRequest request = new MockHttpServletRequest();

        MockHttpSession session = new MockHttpSession();

        request.addParameter("username", "zhangsan");
        session.setAttribute("username", "lisi");
        // 实例化Servlet对象
        // 调用Servlet对象的doGet或者doPost方法

        Assert.assertEquals("zhangsan", request.getParameter("username"));
        Assert.assertEquals("lisi",session.getAttribute("username"));
    }
}
