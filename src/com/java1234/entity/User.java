package com.java1234.entity;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

/**
 * �û�ʵ��
 * @author Administrator
 *
 */
public class User {

	private Integer id; // ���
	private String userName; // �û���
	private String password; // ����
	private String trueName; // ��ʵ����
	private String email; // �ʼ�
	private String phone; // �绰
	private String roleName; // ��ɫ���� ϵͳ����Ա �������� �ͻ����� �߹�
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTrueName() {
		return trueName;
	}
	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
}
