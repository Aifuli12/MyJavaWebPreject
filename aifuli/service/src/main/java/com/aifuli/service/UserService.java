package com.aifuli.service;


import com.aifuli.pojo.vo.StudentVo;
import com.aifuli.respository.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    StudentMapper studentMapper;

    public List<StudentVo> getStudentList() {
        return studentMapper.getStudentList();
    }
}
