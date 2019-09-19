package com.universe.mongodb.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：yanghuanyu
 * @date ：Created in 2019-09-19 14:12
 * @description：
 * @modified By：
 * @version:
 */
@Data
@Document("user")
public class User implements Serializable {

    private Long id;
    private String username;
    private String password;
    private String phone;
    private String email;
    private Date addTime;
    private Date updateTime;
}
