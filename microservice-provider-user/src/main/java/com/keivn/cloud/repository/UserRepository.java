package com.keivn.cloud.repository;

import com.keivn.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @title
 * @description
 * @author caonanqing
 * @createDate 2018/11/6
 * @version 1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
