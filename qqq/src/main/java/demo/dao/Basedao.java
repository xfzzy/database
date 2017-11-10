package demo.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

@Component("basedao")
public class Basedao extends HibernateDaoSupport{
	@Resource(name="sessionFactory")
public void setfactory(SessionFactory sessionFactory) {
	super.setSessionFactory(sessionFactory);
}
	@Transactional
	public void add(Object object) {
		super.getHibernateTemplate().save(object);
	}
	@Transactional
	public void update(Object object) {
		super.getHibernateTemplate().update(object);
	}
	@Transactional
	public void delete(Object object) {
		super.getHibernateTemplate().delete(object);
	}
	@Transactional
	public Object load(Class clazz,Integer id) {
		return super.getHibernateTemplate().get(clazz, id);
	}
	@Transactional
	public List<Object> find(String hql) {
		return (List<Object>)super.getHibernateTemplate().find(hql);
	}
	@Transactional
	public List<Object> find(String hql,Object[]params) {
		return (List<Object>)super.getHibernateTemplate().find(hql,params);
	}
}
