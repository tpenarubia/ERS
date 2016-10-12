package org.sofgen.ers.dao.impl;

import java.util.List;

import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.sofgen.ers.dao.ReferenceCodeDao;
import org.sofgen.ers.model.ReferenceCode;
import org.springframework.stereotype.Repository;

@Repository(value="referenceCodeDao")
public class ReferenceCodeImpl extends BaseDaoImpl<ReferenceCode> implements ReferenceCodeDao{

	
	@SuppressWarnings("unchecked")
	@Override
	public List<ReferenceCode> findByKey(String key) {
		return (List<ReferenceCode>) getCurrentSession().createCriteria(ReferenceCode.class)
				.add(Restrictions.eq("key", key));
	}

	@Override
	public ReferenceCode findByValue(String value) {
		return (ReferenceCode)getCurrentSession().createCriteria(ReferenceCode.class)
				.add(Restrictions.eq("value", value))
				.uniqueResult();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<ReferenceCode> listAllKeysDistinct() {
		return (List<ReferenceCode>)getCurrentSession().createCriteria(ReferenceCode.class)
				.setProjection(Projections.projectionList()
						.add(Projections.distinct(Projections.property("key")))).list();
	}
	
}
