package com.huang;

import com.huang.dao.BlogRepository;
import com.huang.dao.TypeRepository;
import com.huang.dao.UserRepository;
import com.huang.po.User;
import com.huang.utill.MD5Utils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlogApplicationTests {

    @Autowired
    private UserRepository userRepository;
    @Autowired
//    private BlogRepository blogRepository;
    private TypeRepository typeRepository;

    @Test
    void contextLoads() {
//        System.out.println(blogRepository.findAll());
        System.out.println(typeRepository.findByName("java"));
    }

    @Test
    public void test1() {
        System.out.println(MD5Utils.code("123"));
    }

}
