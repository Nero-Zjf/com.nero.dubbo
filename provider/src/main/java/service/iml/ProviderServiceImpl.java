package service.iml;

import service.ProviderService;

/**
 * xml方式服务提供者实现类
 */
public class ProviderServiceImpl implements ProviderService {

    public String SayHello(String word) {
        System.out.println("消费者调用");
        return word;
    }
}