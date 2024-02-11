package com.buddywindow.aop.advise;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Aspect
@Component
public class LoggingAdvise {
	
	Logger log = LoggerFactory.getLogger(LoggingAdvise.class);
	
	@Pointcut(value =  "execution(* com.buddywindow.*.*.*(..) )")
	public void myPointCut() {
		
	}

	//ProceedingJoinPoint internally using reflection and we can get method name class name etc from this
	@Around("myPointCut()")
	public Object applicationLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		ObjectMapper mapper = new ObjectMapper();
		String methodName = joinPoint.getSignature().getName();
		String className = joinPoint.getTarget().getClass().toString();
		Object[] array = joinPoint.getArgs();
		log.info("Class : "+className + " Method : "+methodName + "arguments "+mapper.writeValueAsString(array));
		Object obj = joinPoint.proceed();
		log.info("Class : "+className + " Method : "+methodName + " response "+mapper.writeValueAsString(obj));
		return obj;

	}
}
