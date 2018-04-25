package cn.springboot.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cn.springboot.entity.Teacher;
@Repository
public interface TeacherDao extends CrudRepository<Teacher, Integer>{

}
