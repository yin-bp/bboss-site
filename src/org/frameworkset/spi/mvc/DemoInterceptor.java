package org.frameworkset.spi.mvc;

import org.frameworkset.util.annotations.MethodData;
import org.frameworkset.web.servlet.HandlerInterceptor;
import org.frameworkset.web.servlet.ModelAndView;
import org.frameworkset.web.servlet.handler.HandlerMeta;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, HandlerMeta handlerMeta) throws Exception {
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, HandlerMeta handlerMeta, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, HandlerMeta handlerMeta, Exception ex) throws Exception {

    }

    @Override
    public boolean invokerHandle(HttpServletRequest request, HttpServletResponse response, HandlerMeta handlerMeta, MethodData handlerMethod) throws Exception {
        return HandlerInterceptor.super.invokerHandle(request, response, handlerMeta, handlerMethod);
    }
}
