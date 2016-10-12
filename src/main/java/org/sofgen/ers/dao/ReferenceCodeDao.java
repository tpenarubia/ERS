package org.sofgen.ers.dao;

import java.util.List;

import org.sofgen.ers.model.ReferenceCode;

public interface ReferenceCodeDao extends BaseDao<ReferenceCode>{
    List<ReferenceCode> findByKey(String key);
    ReferenceCode findByValue(String value);
    List<ReferenceCode> listAllKeysDistinct();
}
