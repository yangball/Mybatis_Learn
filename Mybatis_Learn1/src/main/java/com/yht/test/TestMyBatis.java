package com.yht.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.yht.entity.Student;

public class TestMyBatis {
	public static void main(String[] args) {
		
	}
	
	
	//查询单个学生
	public static void queryStudentBystuNo(int stuNo) {
			/*
			 *	  加载MyBatis配置文件（为了访问数据库）
			 *	 
			 */
			
			//通过Resourses将xml文件转化为流的形式
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//通过SqlSessionFactory创建
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    这里的session相当于jdbc方法里的connection
			SqlSession session = sessionFactory.openSession();
			String statement = "com.yht.entity.studentMapper."+"queryStudentByStuno";
			Student student = session.selectOne(statement,stuNo);
			System.out.println(student);
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//查询所有学生
	public static void queryAllStudent() {
			/*
			 *	  加载MyBatis配置文件（为了访问数据库）
			 *	 
			 */
				
			//通过Resourses将xml文件转化为流的形式
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//通过SqlSessionFactory创建
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    这里的session相当于jdbc方法里的connection
			SqlSession session = sessionFactory.openSession();
			String statement = "com.yht.entity.studentMapper."+"queryAllStudent";
			List<Student> students = session.selectList(statement);
			System.out.println(students);
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//增加学生
	public static void addStudent(Student student) {
			/*
			 *	  加载MyBatis配置文件（为了访问数据库）
			 *	 
			 */
			
			//通过Resourses将xml文件转化为流的形式
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//通过SqlSessionFactory创建
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    这里的session相当于jdbc方法里的connection
			SqlSession session = sessionFactory.openSession();
			String statement = "com.yht.entity.studentMapper."+"addStudent";
			int count = session.insert(statement,student);
			session.commit();//提交事务
			System.out.println("增加"+count+"个学生");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//刪除学生
	public static void deleteStudentBystuNo(int stuNo) {
			/*
			 *	  加载MyBatis配置文件（为了访问数据库）
			 *	 
			 */
			
			//通过Resourses将xml文件转化为流的形式
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//通过SqlSessionFactory创建
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    这里的session相当于jdbc方法里的connection
			SqlSession session = sessionFactory.openSession();
			String statement = "com.yht.entity.studentMapper."+"deleteStudentByStuno";
			int count = session.delete(statement,stuNo);
			session.commit();//提交事务
			System.out.println("刪除"+count+"个学生");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//修改学生
	public static void updateStudentBystuNo(int stuNo) {
			/*
			 *	  加载MyBatis配置文件（为了访问数据库）
			 *	 
			 */
			
			//通过Resourses将xml文件转化为流的形式
			try {
			Reader reader = Resources.getResourceAsReader("config.xml");
			//通过SqlSessionFactory创建
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			//session -- connection    这里的session相当于jdbc方法里的connection
			SqlSession session = sessionFactory.openSession();
			String statement = "com.yht.entity.studentMapper."+"updateStudentByStuno";
			Student student = new Student();
			
			//修改哪个人，where stuno = ?
			student.setStuNo(stuNo);
			
			//修改成什么样子
			student.setStuName("yht");
			student.setStuAge(20);
			student.setGraName("a1");
			
			int count = session.update(statement,student);
			session.commit();//提交事务
			System.out.println("修改了"+count+"个学生");
			session.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
