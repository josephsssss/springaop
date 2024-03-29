package hello.aop.order.aop;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {


    @Pointcut("execution(* hello.aop.order..*(..))")
    public void allOrder() {
    } //포컷 시그니춰

    @Pointcut("execution(* *..*Service.*(..))")
    public void allService() {
    }

    @Pointcut("allOrder() && allService()")
    public void orderAndService() { }
}
