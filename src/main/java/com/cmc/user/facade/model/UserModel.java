package com.cmc.user.facade.model;

import java.util.Date;

public class UserModel {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.id
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.name
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.sex
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String sex;

	/**
	 * view层sex对应值
	 * 
	 * @notice 实际上应该放在VO中
	 */
	private String strSex;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.age
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private Integer age;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.create_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private Date createTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.update_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.delete_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private Date deleteTime;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.is_delete
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String isDelete;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.temp1
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String temp1;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.temp2
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String temp2;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column user.temp3
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	private String temp3;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.id
	 *
	 * @return the value of user.id
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.id
	 *
	 * @param id the value for user.id
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setId(String id) {
		this.id = id == null ? null : id.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.name
	 *
	 * @return the value of user.name
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.name
	 *
	 * @param name the value for user.name
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.sex
	 *
	 * @return the value of user.sex
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getSex() {
		return sex;
	}

	public String getStrSex() {
		return strSex;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.sex
	 *
	 * @param sex the value for user.sex
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setSex(String sex) {
		this.sex = sex == null ? null : sex.trim();
	}

	public void setStrSex(String strSex) {
		this.strSex = strSex == null ? null : strSex.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.age
	 *
	 * @return the value of user.age
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.age
	 *
	 * @param age the value for user.age
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.create_time
	 *
	 * @return the value of user.create_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.create_time
	 *
	 * @param createTime the value for user.create_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.update_time
	 *
	 * @return the value of user.update_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.update_time
	 *
	 * @param updateTime the value for user.update_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.delete_time
	 *
	 * @return the value of user.delete_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public Date getDeleteTime() {
		return deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.delete_time
	 *
	 * @param deleteTime the value for user.delete_time
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.is_delete
	 *
	 * @return the value of user.is_delete
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getIsDelete() {
		return isDelete;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.is_delete
	 *
	 * @param isDelete the value for user.is_delete
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete == null ? null : isDelete.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.temp1
	 *
	 * @return the value of user.temp1
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getTemp1() {
		return temp1;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.temp1
	 *
	 * @param temp1 the value for user.temp1
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setTemp1(String temp1) {
		this.temp1 = temp1 == null ? null : temp1.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.temp2
	 *
	 * @return the value of user.temp2
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getTemp2() {
		return temp2;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.temp2
	 *
	 * @param temp2 the value for user.temp2
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setTemp2(String temp2) {
		this.temp2 = temp2 == null ? null : temp2.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column user.temp3
	 *
	 * @return the value of user.temp3
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public String getTemp3() {
		return temp3;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column user.temp3
	 *
	 * @param temp3 the value for user.temp3
	 *
	 * @mbggenerated Sun Jun 12 11:10:07 CST 2016
	 */
	public void setTemp3(String temp3) {
		this.temp3 = temp3 == null ? null : temp3.trim();
	}
}