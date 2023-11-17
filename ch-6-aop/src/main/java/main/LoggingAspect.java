package main;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import models.Comment;


@Aspect
@Order(2)
public class LoggingAspect {
    private final Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("execution(* services.CommentService.publishComment(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] arguments = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + List.of(arguments) + " will execute");

        Comment comment = new Comment();
        comment.setText("Aspect's text")
                .setAuthor("Aspect's author");
        Object[] newArguments = { comment };

        Object returnedByMethod = joinPoint.proceed(newArguments);
        logger.info("Method executed and returned " + returnedByMethod);
        return "Failure";
    }

    @Around("@annotation(annotations.Log)")
    public Object logMethodsAnnotated(ProceedingJoinPoint joinPoint) throws Throwable {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        logger.info("Method " + methodName + " with parameters " + List.of(args) + " will execute");
        Object returnValue = joinPoint.proceed();
        logger.info("Method returned " + returnValue);
        return returnValue;
    }
}
