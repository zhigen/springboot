package com.zglu.mybatis.user;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author zglu
 */
@Data
public class User {
    private Long id;
    private String name;
    private LocalDateTime createdDate;
    private Long createdBy;
    private LocalDateTime lastModifiedDate;
    private Long lastModifiedBy;
    private Boolean enable;

}
