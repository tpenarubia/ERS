package org.sofgen.ers.service.impl;

import java.util.List;
import java.util.Map;

import org.sofgen.ers.model.ReferenceCode;
import org.sofgen.ers.model.SearchResult;
import org.sofgen.ers.service.ReferenceCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sofgen.ers.dao.ReferenceCodeDao;
@Service
@Transactional
public class ReferenceCodeServiceImpl implements ReferenceCodeService {
    
	@Autowired
	ReferenceCodeDao referenceCodeDao;
	
	@Override
	public List<ReferenceCode> getReferenceCodeList() {
		return referenceCodeDao.listAllRecord();
	}

	@Override
	public List<ReferenceCode> findReferenceCodeByKey(String key) {
		return referenceCodeDao.findByKey(key);
	}

	@Override
	public ReferenceCode findReferenceCodeByValue(String value) {
		return referenceCodeDao.findByValue(value);
	}

	@Override
	public ReferenceCode addReferenceCode(String key, String value, String description) {
		ReferenceCode referenceCode = new ReferenceCode();
		
		referenceCode.setKey(key);
		referenceCode.setValue(value);
		referenceCode.setDescription(description);
		
		referenceCodeDao.save(referenceCode);
		return referenceCode;
	}

	@Override
	public boolean deleteReferenceCode(Long id) {
		boolean deleted = false;
		
		ReferenceCode referenceCode = referenceCodeDao.findById(id);
		
		if(referenceCode != null && referenceCode.getId() > 0){
			referenceCodeDao.delete(referenceCode);
			deleted = true;
		}
		return deleted;
	}

	@Override
	public ReferenceCode updateReferenceCode(String key, String value, String description) {
		ReferenceCode referenceCode = referenceCodeDao.findByValue(value);
		
		if(referenceCode != null){
			referenceCode.setKey(key);
			referenceCode.setValue(value);
			referenceCode.setDescription(description);
			
			referenceCodeDao.update(referenceCode);
		}
		return referenceCode;
	}

	@Override
	public List<ReferenceCode> getDistinctKeyList() {
		return referenceCodeDao.listAllKeysDistinct();
	}


	@SuppressWarnings("unchecked")
	@Override
	public SearchResult<ReferenceCode> getSearchResults(Map<String, Object> params, int fetchSize, int page) {
	    
	    
	    //int resultCount = referenceCodeDao.countSearch(params, fetchSize, page);
	    List<ReferenceCode> searchResult = referenceCodeDao.search(params, fetchSize, page);
	    
	    SearchResult<ReferenceCode> result = new SearchResult(searchResult, fetchSize, page);
	    
	    return result;
	}
 
}
