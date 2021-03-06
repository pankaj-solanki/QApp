/**
 * 
 */
package com.qapp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.qapp.model.ModelRootClass;

/**
 * @author Pankaj Solanki The MapperRootInterface makes generic service
 *         implementations feasible.
 */
public interface MapperRootInterface {

  int countByExample(Object example);

  int deleteByExample(Object example);

  int deleteByPrimaryKey(Long id);

  int insert(ModelRootClass record);

  int insertSelective(ModelRootClass record);

  List<? extends ModelRootClass> selectByExample(Object example);

  ModelRootClass selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") ModelRootClass record,
      @Param("example") Object example);

  int updateByExample(@Param("record") ModelRootClass record, @Param("example") Object example);

  int updateByPrimaryKeySelective(ModelRootClass record);

  int updateByPrimaryKey(ModelRootClass record);

}
