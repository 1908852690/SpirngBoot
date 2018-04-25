package cn.springboot.SpringBoot_FastJson;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App extends WebMvcConfigurerAdapter{
	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		super.configureMessageConverters(converters);
		
		//01.定义一个Converter转化消息的对象
		FastJsonHttpMessageConverter converter=new FastJsonHttpMessageConverter();
		//02.增加fastjson的配置信息
		FastJsonConfig config=new FastJsonConfig();
		//设置格式化特性
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		//03.转换器converter中增加配置信息
		converter.setFastJsonConfig(config);
		//04.将converter添加到converters中
		converters.add(converter);
	}
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
