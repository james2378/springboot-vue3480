package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 会议信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-05 21:56:21
 */
@TableName("huiyixinxi")
public class HuiyixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuiyixinxiEntity() {
		
	}
	
	public HuiyixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 会议名称
	 */
					
	private String huiyimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：会议名称
	 */
	public void setHuiyimingcheng(String huiyimingcheng) {
		this.huiyimingcheng = huiyimingcheng;
	}
	/**
	 * 获取：会议名称
	 */
	public String getHuiyimingcheng() {
		return huiyimingcheng;
	}
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
