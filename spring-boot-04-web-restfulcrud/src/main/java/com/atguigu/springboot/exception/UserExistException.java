package com.atguigu.springboot.exception;

/**
 * @author ：jccccccc
 * @date ：Created in 2020/5/6 10:30
 */
public class UserExistException extends RuntimeException {

    public UserExistException(){
        super("用户存在,但不给予登录");
    }

}
