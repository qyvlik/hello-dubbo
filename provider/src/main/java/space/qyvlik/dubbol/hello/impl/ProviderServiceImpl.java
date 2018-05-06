package space.qyvlik.dubbol.hello.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import space.qyvlik.dubbol.hello.ProviderService;

@Service(interfaceClass = ProviderService.class)
@Component
public class ProviderServiceImpl implements ProviderService {
    public String getProviderName() {
        return "hello dubbo! this is provider service impl";
    }
}
