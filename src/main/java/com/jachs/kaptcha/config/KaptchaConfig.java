package com.jachs.kaptcha.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import com.jachs.kaptcha.entity.KaptchaBean;

@Configuration
public class KaptchaConfig {
	@Autowired
	private KaptchaBean kaptchaBean;
    @Bean
    public DefaultKaptcha getDefaultKaptcha(){
        com.google.code.kaptcha.impl.DefaultKaptcha defaultKaptcha = new com.google.code.kaptcha.impl.DefaultKaptcha();
        Properties properties = new Properties();
        properties.setProperty("kaptcha.border", kaptchaBean.getBorder());
        properties.setProperty("kaptcha.border.color", kaptchaBean.getColor());
        properties.setProperty("kaptcha.textproducer.font.color", kaptchaBean.getFont_color());
        properties.setProperty("kaptcha.image.width", kaptchaBean.getWidth());
        properties.setProperty("kaptcha.image.height", kaptchaBean.getHeight());
        properties.setProperty("kaptcha.textproducer.font.size", kaptchaBean.getFont_size());
        properties.setProperty("kaptcha.session.key", kaptchaBean.getKey());
        properties.setProperty("kaptcha.textproducer.char.length", kaptchaBean.getLength());
        properties.setProperty("kaptcha.textproducer.font.names", kaptchaBean.getNames());
        
        Config config = new Config(properties);
        defaultKaptcha.setConfig(config);
        return defaultKaptcha;
    }
}