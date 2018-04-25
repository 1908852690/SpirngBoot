package cn.springboot.exception;

import javax.servlet.http.HttpServletRequest;




import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class StringBootException {
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest request,Exception ex)
	{
		return "服务器内部错误";
	}
}
