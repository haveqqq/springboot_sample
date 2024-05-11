package com.springboot;

import com.alibaba.fastjson.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 启动类
 * @Auther: chenmingjian
 * @Date: 18-11-7 15:12
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        JSONObject param = new JSONObject();
        param.put("aah","123456789101123456");
        final String creditCode = param.getString("creditcode");
        if (creditCode != null && !creditCode.isEmpty()) {
            System.out.println(creditCode);
        }else {
            System.out.println("creditcode is null");
        }
    }
}
