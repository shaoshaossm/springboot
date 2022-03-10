package com.bjpowernode.springboot.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.bjpowernode.springboot.mapper.StudentMapper;
import com.bjpowernode.springboot.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import java.util.concurrent.TimeUnit;

@Component
@Service(interfaceName ="com.bjpowernode.springboot.service.StudentService",version = "1.0.0",timeout = 1500)
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private RedisTemplate<Object, Object> redisTemplate;

    @Override
    public Student queryStudentById(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer queryAllStudentCount() {
        Integer allStudentCount = (Integer) redisTemplate.opsForValue().get("allStudentCount");
        if (null == allStudentCount){
            allStudentCount = studentMapper.selectAllStudentCount();
            redisTemplate.opsForValue().set("allStudentCount",allStudentCount,30, TimeUnit.SECONDS);
        }
        return allStudentCount;
    }
}
