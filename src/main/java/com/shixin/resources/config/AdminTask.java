package com.shixin.pawcode.admin.config;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @Description 使用xxl-job做定时任务
 * @Author shixin
 * @Date 2021/5/17 9:26
 */
@Component
public class AdminTask {

    /**
     * 1、简单任务示例（Bean模式）
     */
    @XxlJob("demoJobHandler")
    public void demoJobHandler() throws Exception {
        XxlJobHelper.log("XXL-JOB, Hello World.");
    }

    
}
