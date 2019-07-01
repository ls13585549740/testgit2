package com.funong.newerp.schedule;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HelloSchedule {
    static Integer batchProcessCount = 1000;//批量处理数据条数
    static Integer batchProcessSeconds = 600;//批量处理数据时间

    public void process() {
        int count = 0;
        while (count < batchProcessCount) {
            List<Integer> list = new ArrayList<>();
            for (Integer entity : list) {
                count += 1;
            }
            if (list.size() == 0) {
                break;
            }
        }
    }

}
