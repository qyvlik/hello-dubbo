package space.qyvlik.dubbol.hello;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubboConfiguration
@SpringBootApplication(scanBasePackages = "space.qyvlik.dubbol.hello")
public class ConsumerLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerLauncher.class, args);
    }
}
