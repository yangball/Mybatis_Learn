package com.yht.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.yht.entity.Student;
import com.yht.mapper.StudentMapper;

public class TestMyBatis {
	public static void main(String[] args) {
		
	}
	
	
	//��ѯ����ѧ��
	public static void queryStudentBystuNo(int stuNo) {
			/*
			 *	  ����MyBatis�����ļ���Ϊ�˷������ݿ⣩
			 *	 
			 */
			
			//ͨ��Resourses��xml�ļ�ת��Ϊ������ʽ
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//ͨ��SqlSessionFactory����
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    �����session�൱��jdbc�������connection
			SqlSession session = sessionFactory.openSession();
			//��̬����ʽ
			StudentMapper studentmapper = session.getMapper(StudentMapper.class);
			Student student = studentmapper.queryStudentByStuno(stuNo);//�ӿ��еķ���-->SQL���
			
			System.out.println(student);
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//��ѯ����ѧ��
	public static void queryAllStudent() {
			/*
			 *	  ����MyBatis�����ļ���Ϊ�˷������ݿ⣩
			 *	 
			 */
				
			//ͨ��Resourses��xml�ļ�ת��Ϊ������ʽ
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//ͨ��SqlSessionFactory����
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    �����session�൱��jdbc�������connection
			SqlSession session = sessionFactory.openSession();
//			String statement = "com.yht.entity.studentMapper."+"queryAllStudent";
//			List<Student> students = session.selectList(statement);
			StudentMapper studentmapper = session.getMapper(StudentMapper.class);
			List<Student> students = studentmapper.queryAllStudent();
			System.out.println(students);
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//����ѧ��
	public static void addStudent(Student student) {
			/*
			 *	  ����MyBatis�����ļ���Ϊ�˷������ݿ⣩
			 *	 
			 */
			
			//ͨ��Resourses��xml�ļ�ת��Ϊ������ʽ
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//ͨ��SqlSessionFactory����
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    �����session�൱��jdbc�������connection
			SqlSession session = sessionFactory.openSession();
//			String statement = "com.yht.entity.studentMapper."+"addStudent";
//			int count = session.insert(statement,student);
			StudentMapper studentmapper = session.getMapper(StudentMapper.class);
			studentmapper.addStudent(student);
			session.commit();//�ύ����
			System.out.println("���ӳɹ�");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//�h��ѧ��
	public static void deleteStudentBystuNo(int stuNo) {
			/*
			 *	  ����MyBatis�����ļ���Ϊ�˷������ݿ⣩
			 *	 
			 */
			
			//ͨ��Resourses��xml�ļ�ת��Ϊ������ʽ
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//ͨ��SqlSessionFactory����
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    �����session�൱��jdbc�������connection
			SqlSession session = sessionFactory.openSession();
//			String statement = "com.yht.entity.studentMapper."+"deleteStudentByStuno";
//			int count = session.delete(statement,stuNo);
			StudentMapper studentmapper = session.getMapper(StudentMapper.class);
			studentmapper.deleteStudentByStuno(stuNo);
			session.commit();//�ύ����
			System.out.println("�h���ɹ�");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//�޸�ѧ��
	public static void updateStudentBystuNo(int stuNo) {
			/*
			 *	  ����MyBatis�����ļ���Ϊ�˷������ݿ⣩
			 *	 
			 */
			
			//ͨ��Resourses��xml�ļ�ת��Ϊ������ʽ
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//ͨ��SqlSessionFactory����
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    �����session�൱��jdbc�������connection
			SqlSession session = sessionFactory.openSession();
//			String statement = "com.yht.entity.studentMapper."+"updateStudentByStuno";
			StudentMapper studentmapper = session.getMapper(StudentMapper.class);
			Student student = new Student();
			
			//�޸��ĸ��ˣ�where stuno = ?
			student.setStuNo(stuNo);
			
			//�޸ĳ�ʲô����
			student.setStuName("yht");
			student.setStuAge(20);
			student.setGraName("a1");
			studentmapper.updateStudentByStuno(student);
//			int count = session.update(statement,student);
			session.commit();//�ύ����
			System.out.println("�޸ĳɹ�");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
