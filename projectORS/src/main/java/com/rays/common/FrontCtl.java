package com.rays.common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * Front controller verifies if user is logged in.
 * Temporary version: JWT validation is bypassed for testing purposes.
 * Works with ProjectOrsApplication interceptor setup.
 * 
 * @author Avnish Upadhyay
 */
@Component
public class FrontCtl extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        String path = request.getServletPath();
        System.out.println("FrontCtl Called (Testing) - " + path);

        // ------------------------
        // TEMPORARY JWT BYPASS
        // ------------------------
        // All requests (except excluded paths) are allowed
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {

        // Maintain CORS headers
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Methods", "GET,HEAD,OPTIONS,POST,PUT");
    }
}
