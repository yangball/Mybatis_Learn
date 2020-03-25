package com.yht.mapper;

import java.util.List;

import com.yht.entity.Student;

//操作MyBatis的接口
public interface StudentMapper {
	/*
	 *  	1.方法名和mapper.xml的id值相同
	 *  	2.方法的输入参数和mapper.xml文件中标签的parameterType类型一值
	 *  	3.方法的返回值和mapper.xml文件中标签resultType类型一致
	 */
	Student queryStudentByStuno(int stuNo);
	void addStudent(Student student);
	void deleteStudentByStuno(int stuNo);
	void updateStudentByStuno(Student student);
	List<Student> queryAllStudent();
	
	
}
