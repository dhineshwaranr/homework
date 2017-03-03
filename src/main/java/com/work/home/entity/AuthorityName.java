package com.work.home.entity;

public enum AuthorityName {

	 ROLE_SUPERADMIN("Super Admin"),
	 ROLE_ADMIN("Admin"),
	 ROLE_USER("User");
	 
	 private final String displayName;

	 private AuthorityName(String displayName) {
		 this.displayName = displayName;
	 }

	public String getDisplayName() {
		return displayName;
	}
	
}
