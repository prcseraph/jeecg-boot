package org.jeecg.modules.activiti.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Leave implements Serializable {
    private String userId;

    private Boolean submit;

    private Date startDate;

    private Date endDate;

    private float totalDay;

    private String desc;

    private String taskId;

    private String taskName;

    private String approver1;

    private Boolean agree1;

    private String approveDesc1;

    private String approver2;

    private Boolean agree2;

    private String approveDesc2;
}
