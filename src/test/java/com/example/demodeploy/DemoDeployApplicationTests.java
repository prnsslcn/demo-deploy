package com.example.demodeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoDeployApplicationTests {

    @Test
    void contextLoads() {
        // 단위 테스트
        // MVC 테스트 -> 목업통해서 가상 처리 가능
        // RestAPI 테스트 가능
        // 메시지가 보이지는 않지만, 차후 코드로 확인
        System.out.println("단위 테스트 호출 echo");
    }

}
