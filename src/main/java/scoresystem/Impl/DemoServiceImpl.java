package scoresystem.Impl;

import org.springframework.stereotype.Service;
import scoresystem.service.DemoService;

/**
 * Created by xavimo on 2018/1/10.
 */
@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String demo(String param) {
        return "Hello " + param;
    }
}
