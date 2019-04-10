package com.example.demo;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.servlet.config.annotation.*;

import com.example.demo.util.Constants;
import com.example.demo.util.FileUtil;

/**
 * @author lph
 * @data 2018/12/4 7:26 PM
 */
@Configuration
public class MyConfig extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
//        registry.addResourceHandler("/MP_verify_MmbjGwMb2j8wEZB5.txt").addResourceLocations("classpath:/MP_verify_MmbjGwMb2j8wEZB5.txt");
//        //测试
//        registry.addResourceHandler("/MP_verify_EHbWyBG0eSnGyUs0.txt").addResourceLocations("classpath:/MP_verify_EHbWyBG0eSnGyUs0.txt");
//        //正式
        //registry.addResourceHandler("/favicon.ico").addResourceLocations("classpath:/favicon.ico");
        if (FileUtil.isWindows()) {
            registry.addResourceHandler("/" + Constants.UPLOAD_DIRECTORY + "/**")
                    .addResourceLocations("file:" + Constants.DRIVE_LETTER + ":/" + Constants.UPLOAD_DIRECTORY + "/");
        } else {
            registry.addResourceHandler("/" + Constants.UPLOAD_DIRECTORY + "/**")
                    .addResourceLocations("file:" + Constants.COMPUTER_USER_NAME + "/" + Constants.UPLOAD_DIRECTORY + "/");
        }
    }

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(new PCInterceptor())
//                .addPathPatterns("/**")
////                .excludePathPatterns("/**")//调试
//                .excludePathPatterns("/explore")
//                .excludePathPatterns("/clearreport")
//                .excludePathPatterns("/explorereport")
//                .excludePathPatterns("/contract3")
//                .excludePathPatterns("/contract2")
//                .excludePathPatterns("/test")
//                .excludePathPatterns("/sign")
//                .excludePathPatterns("/sign2")
//                .excludePathPatterns("/file/base64up")
//                .excludePathPatterns("/yyob/updatecontractInfo")
//                .excludePathPatterns("/yyob/getcontractInfobyobCode")
//                .excludePathPatterns("/yyob/save")
//                .excludePathPatterns("/obdetail/getall")
//                .excludePathPatterns("/yyob/getbybasicid")
//                .excludePathPatterns("/getAccess_Token")
//                .excludePathPatterns("/login")
//                .excludePathPatterns("/payreturn")
//                .excludePathPatterns("/wxpay")
//                .excludePathPatterns("/useradmin/login")
//                .excludePathPatterns("/pay/callback")
//                .excludePathPatterns("/orders")
//                .excludePathPatterns("/user/**")
//                .excludePathPatterns("/MP_verify_MmbjGwMb2j8wEZB5.txt")
//                .excludePathPatterns("/MP_verify_EHbWyBG0eSnGyUs0.txt")
//                .excludePathPatterns("/static/**")
//                .excludePathPatterns("/" + Constants.UPLOAD_DIRECTORY + "/**")
//        ;
//        super.addInterceptors(registry);
//    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
////                .allowedOrigins("http://47.111.28.118")//生产
//                .allowedOrigins("**")//测试
//                .allowedMethods("GET", "POST", "PUT", "OPTIONS", "DELETE", "PATCH")
//                .allowCredentials(true)
//                .maxAge(3600);
//    }
}
