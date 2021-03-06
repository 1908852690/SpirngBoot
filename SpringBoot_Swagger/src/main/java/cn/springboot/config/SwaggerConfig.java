package cn.springboot.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    
	@Bean
    public Docket buildDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(ApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.springboot.controller"))//该包下的类将会自动生成文档
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo ApiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot+swagger2集成")
                .contact("五道口学术部")
                .version("1.0")
                .build();
    }
}
