package org.sofgen.ers.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.sofgen.ers.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class BaseDaoImpl<T extends Serializable> implements BaseDao<T>  {
	
	@Autowired
	SessionFactory sessionFactory;
	
	private Class<T> type;

	@SuppressWarnings("unchecked")
	public BaseDaoImpl(){
		this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
	@Override
	public T findById(Long id) {
		return (T) getCurrentSession().get(type, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAllRecord() {
		return getCurrentSession().createCriteria(type).list();
	}

	@Override
	public void save(T entity) {
		getCurrentSession().save(entity);
		
	}

	@Override
	public void update(T entity) {
		getCurrentSession().update(entity);
		
	}

	@Override
	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}

	@Override
	public void deleteById(Long id) {
		T entity = findById(id);
		delete(entity);
		
	}

	protected final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	public List<T> search(Map<String, Object> params, int fetchSize, int page){
		
		Criteria criteria = getCurrentSession().createCriteria(type);
		
/*	   if(!params.isEmpty() && params != null){
		   for(String key: params.keySet()){
				criteria.add(Restrictions.eqOrIsNull(key, params.get(key)));
			}
	   }*/
		
		if (fetchSize > 0){
			criteria.setFetchSize(fetchSize);	
		}
		
		if (page > 0){
			criteria.setFirstResult(page);	
		}
		
		return (List<T>)criteria.list();
	}
	
	public int countSearch(Map<String, Object> params, int fetchSize, int page){
		Criteria criteria = getCurrentSession().createCriteria(type);
		
		for(String key: params.keySet()){
			criteria.add(Restrictions.eqOrIsNull(key, params.get(key)));
		}
		
		if (fetchSize > 0){
			criteria.setFetchSize(fetchSize);	
		}
		
		if (page > 0){
			criteria.setFirstResult(page);	
		}
		
		return (int) criteria.setProjection(Projections.rowCount()).uniqueResult();
		
	}
	
}
