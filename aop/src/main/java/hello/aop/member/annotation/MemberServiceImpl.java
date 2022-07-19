package hello.aop.member.annotation;

import org.springframework.stereotype.Component;

import hello.aop.member.MemberService;

@ClassAop
@Component
public class MemberServiceImpl implements MemberService {
    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return " ok";
    }
}
