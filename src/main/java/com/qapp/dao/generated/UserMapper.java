package com.qapp.dao.generated;

import com.qapp.dao.MapperRootInterface;
import com.qapp.model.generated.User;
import com.qapp.model.generated.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper extends MapperRootInterface {
  int countByExample(UserExample example);

  int deleteByExample(UserExample example);

  int deleteByPrimaryKey(Long id);

  int insert(User record);

  int insertSelective(User record);

  List<User> selectByExample(UserExample example);

  User selectByPrimaryKey(Long id);

  int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

  int updateByExample(@Param("record") User record, @Param("example") UserExample example);

  int updateByPrimaryKeySelective(User record);

  int updateByPrimaryKey(User record);
}
