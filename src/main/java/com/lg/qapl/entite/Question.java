package com.lg.qapl.entite;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
@TableName("question")
public class Question {
    @TableId(type = IdType.AUTO)
    @TableField(value = "question_id")
    private Integer questionId;
    @TableField(value = "question_name")
    private String questionName;
    @TableField(value = "question_content")
    private String questionContent;
    @TableField(value = "question_type")
    private Integer questionType;
    @TableField(value = "user_id")
    private Integer userID;
    @TableField(fill = FieldFill.INSERT, value = "create_time")
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE, value = "update_time")
    private Date updateTime;
    @TableField(value = "is_deleted")
    private Boolean isDeleted;
}
