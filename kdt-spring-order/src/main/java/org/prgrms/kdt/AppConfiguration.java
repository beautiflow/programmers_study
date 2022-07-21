package org.prgrms.kdt;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLOutput;


@Configuration
@ComponentScan(
        basePackages = {"org.prgrms.kdt.voucher", "org.prgrms.kdt.order","org.grgrms.kdt.Configuration"}
)
public class AppConfiguration {

//    @Bean(initMethod = "init")
//    public BeanOne beanone{
//        return new BeanOne();
//
//    }
//}
//
//class Beanone implements InitializingBean {
//    public void init(){
//        System.out.println("init called!");
//    }
//
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("afterPropertiseSet called!");
//    }
}