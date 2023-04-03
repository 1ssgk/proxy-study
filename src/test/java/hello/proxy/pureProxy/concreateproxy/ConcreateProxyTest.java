package hello.proxy.pureProxy.concreateproxy;

import hello.proxy.pureProxy.concreateproxy.code.ConcreateClient;
import hello.proxy.pureProxy.concreateproxy.code.ConcreateLogic;
import hello.proxy.pureProxy.concreateproxy.code.TimeProxy;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class ConcreateProxyTest {

    @Test
    void noProxy() {
        ConcreateLogic logic = new ConcreateLogic();
        ConcreateClient client = new ConcreateClient(logic);
        client.execute();
    }

    @Test
    void addProxy() {
        ConcreateLogic logic = new ConcreateLogic();
        TimeProxy proxy = new TimeProxy(logic);
        ConcreateClient client = new ConcreateClient(proxy);
        client.execute();
    }
}
