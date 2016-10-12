package org.sofgen.ers.service;

import java.util.List;
import java.util.Map;

import org.sofgen.ers.model.ReferenceCode;
import org.sofgen.ers.model.SearchResult;


public interface ReferenceCodeService {

	List<ReferenceCode> getReferenceCodeList();
	
	List<ReferenceCode> getDistinctKeyList();
	
	List<ReferenceCode> findReferenceCodeByKey(String key);
	
	ReferenceCode findReferenceCodeByValue(String value);
	
	ReferenceCode addReferenceCode(String key, String value, String description);
	
	boolean deleteReferenceCode(Long id);
	
	ReferenceCode updateReferenceCode(String key, String value, String description);
	
	SearchResult getSearchResults(Map<String, Object> params, int fetchSize, int page);

}
