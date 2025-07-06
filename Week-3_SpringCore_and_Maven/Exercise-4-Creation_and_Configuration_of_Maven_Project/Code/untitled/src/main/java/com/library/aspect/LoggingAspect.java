package com.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {
    //method for log execution time
    @Around("execution(* com.library.service.*.*(..))")
    public Object logExecTime(ProceedingJoinPoint joinPoint) throws Throwable{
        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        String methodName = joinPoint.getSignature().toLongString();

        System.out.println("[LOG:]");
        System.out.println("Method: "+methodName+" executed in "+(endTime-startTime)+" ms");
        return result;
    }
}