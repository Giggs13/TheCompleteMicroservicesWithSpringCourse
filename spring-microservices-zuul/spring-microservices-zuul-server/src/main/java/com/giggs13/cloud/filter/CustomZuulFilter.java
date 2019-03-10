package com.giggs13.cloud.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;

public class CustomZuulFilter
        extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run()
            throws ZuulException {
        System.out.println("This request has passed through the custom Zuul Filter...");
        return null;
    }
}
