package ru.borisevich.springapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class MySpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {SpringConfig.class}; //сюда ставим локацию спринг-конфигурации
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"}; //аналог <url-pattern>/</url-pattern> из web.xml
    }
}
