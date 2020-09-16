package com.anime.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.anime.exception.AnimeException;

@Component
@Aspect
public class LoggingAspect {
	private final static Log LOGGER = LogFactory.getLog(LoggingAspect.class);
	
	@AfterThrowing(pointcut="execution(* com.anime.service.*Impl.*(..))", throwing="exception")
	public void logServiceException(AnimeException exception) {
		LOGGER.error(exception.getMessage(), exception);
	}
}
