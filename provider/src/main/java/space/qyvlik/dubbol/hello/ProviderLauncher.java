package space.qyvlik.dubbol.hello;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication
public class ProviderLauncher {
    public static void main(String[] args) {
        SpringApplication.run(ProviderLauncher.class, args);
    }
}
