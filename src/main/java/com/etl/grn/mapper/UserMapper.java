package com.etl.grn.mapper;

import com.etl.grn.dto.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author ETLGRN
 * @since 2019-09-03
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
