package demo.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import demo.bean.Dept;
import demo.bean.Emp;
import demo.dao.Basedao;

@Service("baseservice")
public class BaseService {
	@Autowired
private Basedao dao;
	@Transactional
	public void add(Object object) {
		dao.add(object);
	}
	@Transactional
	public void update(Object object) {
		dao.update(object);
	}
	@Transactional
	public void delete(Object object) {
		dao.delete(object);
	}
	@Transactional
	public Object load(Class clazz,Integer id) {
		return dao.load(clazz, id);
	}
	@Transactional
	public List<Object> find(String hql) {
		return dao.find(hql);
	}
	@Transactional
	public List<Object> find(String hql,Object[]params) {
		return dao.find(hql,params);
	}
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("/app-core.xml");
		BaseService service=(BaseService)ctx.getBean("baseservice");
		
		Dept dept1=new Dept();
		dept1.setDname("开发部");
		
		Dept dept2=new Dept();
		dept2.setDname("市场部");		
	service.add(dept1);
	service.add(dept2);
		
//		Emp emp1=new Emp();
//		Emp emp2=new Emp();
//		Emp emp3=new Emp();
//		Emp emp4=new Emp();
//		
//		emp1.setEname("小一");
//		emp1.setSex("M");
//		emp1.setHire(new Date());
//		emp1.setDid(1);
//		
//		emp2.setEname("小二");
//		emp2.setSex("M");
//		emp2.setHire(new Date());
//		emp2.setDid(1);
//		
//		emp3.setEname("小三");
//		emp3.setSex("M");
//		emp3.setHire(new Date());
//		emp3.setDid(2);
//		
//		emp4.setEname("小四");
//		emp4.setSex("M");
//		emp4.setHire(new Date());
//		emp4.setDid(2);
//		
//		service.add(emp1);
//		service.add(emp2);
//		service.add(emp3);
//		service.add(emp4);
	}

}
