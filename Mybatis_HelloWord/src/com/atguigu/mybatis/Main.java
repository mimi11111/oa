/**
 * 
 */
package com.atguigu.mybatis;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author Administrator
 *
 */
public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		String resource="mybits.config.xml";
		InputStream inputStream= Resources.getResourceAsStream(resource);
		SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession();
		
		try{
			Student student = session.selectOne("com.atguigu.mybatis.mapping.student11",1);
			System.out.println(student);
		}finally{
			session.close();
		}
		
		
		
		
	}
	
	
}
