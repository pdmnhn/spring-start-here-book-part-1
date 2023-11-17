package main;

import java.util.List;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Order(1)
public class SecurityAspect {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @Around("@annotation(annotations.Log)")
    public Object securityAspect(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        logger.info("Security aspect intercepted "
                + methodName
                + " called with arguments "
                + List.of(joinPoint.getArgs()));
        Object returnValue = joinPoint.proceed();
        logger.info("Method returned " + returnValue);
        return returnValue;
    }
}
