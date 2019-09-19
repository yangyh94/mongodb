package com.universe.mongodb.repository;

import com.universe.mongodb.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author ：yanghuanyu
 * @date ：Created in 2019-09-19 14:40
 * @description：
 * @modified By：
 * @version:
 */
public interface UserRepository extends MongoRepository<User,Long> {

    /**
     * 1。继承MongonRepository 接口
     * 2。直接书写接口按字段名称编写接口，可以直接使用
     *
     * */
    List<User> findByUsername(String username);

    List<User> findByUsernameEndsWith(String username);
    List<User> findUserByUsernameLike(String username);

    List<User> findUserByPhoneLike(String phone);

}
