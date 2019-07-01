package com.funong.newerp.dal.Base;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity implements Serializable {
    private Integer id;
    private Date createdAt;
    private Date updatedAt;
    private String createdBy;
    private String updatedBy;




}
