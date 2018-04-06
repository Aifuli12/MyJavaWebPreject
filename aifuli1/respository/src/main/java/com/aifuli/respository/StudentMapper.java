package com.aifuli.respository;

import com.aifuli.pojo.entity.Student;
import com.aifuli.pojo.vo.StudentVo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Li Feng
 */
public interface StudentMapper extends Mapper<Student> {

    public List<StudentVo> getStudentList();

}
