package scoresystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xavimo on 2018/1/10.
 */
public class Main {
    public static void main(String[] args)
    {
        com.alibaba.dubbo.container.Main.main(args);
    }
}
//public class Main {
//    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                new String[] {"dubbo/dubbo-provider.xml"});
//        context.start();
//        // press any key to exit
//        System.in.read();
//    }
//}