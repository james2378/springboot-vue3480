package com.entity.view;

import com.entity.GongxiangwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 共享文件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
@TableName("gongxiangwenjian")
public class GongxiangwenjianView  extends GongxiangwenjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongxiangwenjianView(){
	}
 
 	public GongxiangwenjianView(GongxiangwenjianEntity gongxiangwenjianEntity){
 	try {
			BeanUtils.copyProperties(this, gongxiangwenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
