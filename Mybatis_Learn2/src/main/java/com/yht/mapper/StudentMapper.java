package com.yht.mapper;

import java.util.List;

import com.yht.entity.Student;

//����MyBatis�Ľӿ�
public interface StudentMapper {
	/*
	 *  	1.��������mapper.xml��idֵ��ͬ
	 *  	2.���������������mapper.xml�ļ��б�ǩ��parameterType����һֵ
	 *  	3.�����ķ���ֵ��mapper.xml�ļ��б�ǩresultType����һ��
	 */
	Student queryStudentByStuno(int stuNo);
	void addStudent(Student student);
	void deleteStudentByStuno(int stuNo);
	void updateStudentByStuno(Student student);
	List<Student> queryAllStudent();
	
	
}
