package cn.springboot.SpringBoot_FastJson;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class AppBean {                       
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		// 01.定义一个Converter转化消息的对象
		FastJsonHttpMessageConverter fastconverter = new FastJsonHttpMessageConverter();
		// 02.增加fastjson的配置信息
		FastJsonConfig config = new FastJsonConfig();
		// 设置格式化特性
		config.setSerializerFeatures(SerializerFeature.PrettyFormat);
		// 03.转换器converter中增加配置信息
		fastconverter.setFastJsonConfig(config);
		HttpMessageConverter<?> converter=fastconverter;
		//04.将converter添加到converters中并且返回
		return new HttpMessageConverters(converter);
	}

	public static void main(String[] args) {
		
		SpringApplication.run(AppBean.class, args);
	}
}
