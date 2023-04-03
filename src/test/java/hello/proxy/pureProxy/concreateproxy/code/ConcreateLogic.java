package hello.proxy.pureProxy.concreateproxy.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConcreateLogic {
    public String operation() {
        log.info("ConcreateLoginc 실행");
        return "ok";
    }
}
