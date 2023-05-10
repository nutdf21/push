package nutdf21.push.api;

import nutdf21.push.api.jpa.AppInfoRepository;
import nutdf21.push.api.vo.jpa.AppInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ApiApplicationTests {

    @Autowired
    AppInfoRepository appInfoRepository;

    @Test
    void contextLoads() {
        System.out.println("start");
        List<AppInfo> result = appInfoRepository.findByName("test");
        System.out.println("end");
    }

}
