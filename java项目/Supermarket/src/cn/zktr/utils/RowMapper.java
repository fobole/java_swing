package cn.zktr.utils;

import java.sql.ResultSet;
/**
 * 专门封装实体类对象的接口
 * @author 
 *
 * @param <T>
 */
public interface RowMapper<T> {
	T map(ResultSet rs) throws Exception;
}
