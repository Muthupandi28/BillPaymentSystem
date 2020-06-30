package com.muthu.billPayment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ROLES")
public class Role {

	@Id
	@Column(name = "ROLE_ID")
	private int roleId;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@Column(name = "UI_DISPLAY_IND")
	private String uiDisplayInd;

	public Role() {
		super();
	}

	public Role(int roleId, String roleName, String uiDisplayInd) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
		this.uiDisplayInd = uiDisplayInd;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public int getRoleId() {
		return roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public String getUiDisplayInd() {
		return uiDisplayInd;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public void setUiDisplayInd(String uiDisplayInd) {
		this.uiDisplayInd = uiDisplayInd;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
