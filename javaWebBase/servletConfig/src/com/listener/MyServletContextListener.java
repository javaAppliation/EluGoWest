package com.listener;

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener,ServletContextAttributeListener {

    private ServletContext context = null;

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        System.out.println("调用该方法————>ServletContext destroy");

    }

    @Override
    public void attributeAdded(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent servletContextAttributeEvent) {

    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

    }
}
