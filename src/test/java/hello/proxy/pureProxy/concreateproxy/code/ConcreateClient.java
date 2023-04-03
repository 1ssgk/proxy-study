package hello.proxy.pureProxy.concreateproxy.code;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConcreateClient {

    private final ConcreateLogic concreateLogic;

    public void execute() {
        concreateLogic.operation();
    }

}
