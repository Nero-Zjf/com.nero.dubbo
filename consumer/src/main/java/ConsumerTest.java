import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ProviderService;

import java.io.IOException;

public class ConsumerTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = (ProviderService) context.getBean("providerService");
        String str = providerService.SayHello("hello");
        System.out.println("调用返回" + str);
        System.in.read();
    }
}
