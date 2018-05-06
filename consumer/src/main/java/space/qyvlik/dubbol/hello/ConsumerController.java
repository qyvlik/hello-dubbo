package space.qyvlik.dubbol.hello;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private ProviderService providerService;

    @RequestMapping("/providerName")
    public String getProviderName() {
        return providerService.getProviderName();
    }
}
