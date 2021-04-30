package com.spmvclogin.springmvclogin.repository;


import com.spmvclogin.springmvclogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByEmailId(String emailId);
    User findByEmailIdAndPassword(String emailId,String password);

}
