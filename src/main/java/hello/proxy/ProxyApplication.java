package hello.proxy;

import hello.proxy.config.v2_dynamicproxy.DynamicFilterProxyBasicConfig;
import hello.proxy.config.v2_dynamicproxy.DynamicProxyBasicConfig;
import hello.proxy.config.v3_proxyfactory.ProxyFactoryConfigV1;
import hello.proxy.config.v5_autoproxy.AutoProxyConfig;
import hello.proxy.config.v6_app.AopConfig;
import hello.proxy.trace.logtrace.LogTrace;
import hello.proxy.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

//@Import(AppV1Config.class)
//@Import(AppV2Config.class)
//@Import(InterfaceProxyConfig.class)
//@Import(ConcreateProxyConfig.class)
//@Import(DynamicProxyBasicConfig.class)
//@Import(DynamicFilterProxyBasicConfig.class)
//@Import(ProxyFactoryConfigV1.class)
//@Import(AutoProxyConfig.class)
@Import(AopConfig.class)
@SpringBootApplication(scanBasePackages = "hello.proxy.app") //주의
public class ProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProxyApplication.class, args);
	}


	@Bean
	public LogTrace logTrace(){
		return new ThreadLocalLogTrace();
	}
}
