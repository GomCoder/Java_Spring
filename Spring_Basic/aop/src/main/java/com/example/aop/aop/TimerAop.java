package com.example.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class TimerAop {

    //controller 하위에 있는는 메서드 들에 적용
    @Pointcut("execution(* com.example.aop.controller..*.*(..))")
    private void cut() { }

    //패키지의 하위에 있는 해당 어노테이션이 설정된 메서드만 로깅을 할 것임
    @Pointcut("@annotation(com.example.aop.annotation.Timer)")
    private void enableTimer(){}


    //cut() && enableTimer() 두 가지 조건에 적용함
    @Around("cut() && enableTimer()")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object result = joinPoint.proceed();//실제적으로 메소드가 실행이 되면 특정한 값이나 Object가 리턴되면 Object Type으로 반환됨

        stopWatch.stop();

        //초단위 실행시간 출력
        System.out.println("total time : " + stopWatch.getTotalTimeSeconds());
    }
}
