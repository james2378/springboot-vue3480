package com.entity.model;

import com.entity.HuiyixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 会议信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
public class HuiyixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议图片
	 */
	
	private String huiyitupian;
		
	/**
	 * 会议时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huiyishijian;
		
	/**
	 * 会议内容
	 */
	
	private String huiyineirong;
		
	/**
	 * 会议文件
	 */
	
	private String huiyiwenjian;
		
	/**
	 * 会议部门
	 */
	
	private String huiyibumen;
				
	
	/**
	 * 设置：会议图片
	 */
	 
	public void setHuiyitupian(String huiyitupian) {
		this.huiyitupian = huiyitupian;
	}
	
	/**
	 * 获取：会议图片
	 */
	public String getHuiyitupian() {
		return huiyitupian;
	}
				
	
	/**
	 * 设置：会议时间
	 */
	 
	public void setHuiyishijian(Date huiyishijian) {
		this.huiyishijian = huiyishijian;
	}
	
	/**
	 * 获取：会议时间
	 */
	public Date getHuiyishijian() {
		return huiyishijian;
	}
				
	
	/**
	 * 设置：会议内容
	 */
	 
	public void setHuiyineirong(String huiyineirong) {
		this.huiyineirong = huiyineirong;
	}
	
	/**
	 * 获取：会议内容
	 */
	public String getHuiyineirong() {
		return huiyineirong;
	}
				
	
	/**
	 * 设置：会议文件
	 */
	 
	public void setHuiyiwenjian(String huiyiwenjian) {
		this.huiyiwenjian = huiyiwenjian;
	}
	
	/**
	 * 获取：会议文件
	 */
	public String getHuiyiwenjian() {
		return huiyiwenjian;
	}
				
	
	/**
	 * 设置：会议部门
	 */
	 
	public void setHuiyibumen(String huiyibumen) {
		this.huiyibumen = huiyibumen;
	}
	
	/**
	 * 获取：会议部门
	 */
	public String getHuiyibumen() {
		return huiyibumen;
	}
			
}
