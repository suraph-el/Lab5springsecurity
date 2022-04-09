package lab5.springsecurity.aspect;

import lab5.springsecurity.domain.Logger;
import lab5.springsecurity.service.LoggerService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class LoggerAspect {


    @Pointcut("@annotation(edu.miu.aspect.annotation.ExecutionTime)")
    public void logMeAnnotation(){ }

    @Pointcut("execution(* edu.miu.service.impl.CommentServiceImpl.*(..)) || " +
            "execution(* edu.miu.service.impl.UserServiceImpl.*(..)) || " +
            "execution(* edu.miu.service.impl.PostServiceImpl.*(..))")
    public void logService(){}

    @After("logService()")
    public void logAfter(JoinPoint joinPoint){
        Logger logger = new Logger();
        System.out.println("After" + joinPoint.getSignature().getName());

    }


    @Around("logMeAnnotation()")
    public void logMeExecution(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        long executionStartTime = System.currentTimeMillis();
        proceedingJoinPoint.proceed();
        long executionEndTime = System.currentTimeMillis();
        System.out.println("Execution time of " + proceedingJoinPoint.getSignature().getName() + " is "
                + (executionEndTime-executionStartTime));
    }
}