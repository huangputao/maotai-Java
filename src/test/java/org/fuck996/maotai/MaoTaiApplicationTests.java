package org.fuck996.maotai;

import org.fuck996.maotai.service.MaoTaiService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MaoTaiApplicationTests {
    @Autowired
    private MaoTaiService maoTaiService;
    @Test
    void contextLoads() throws Exception {
        maoTaiService.pushMessageForWinningRecord();
    }

}
