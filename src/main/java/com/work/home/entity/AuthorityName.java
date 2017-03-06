package com.work.home.entity;

public enum AuthorityName {
	 ROLE_ADMIN("Admin"),
	 ROLE_OWNER("Owner"),
	 ROLE_LABOUR("Labour");
	 
	 private final String displayName;

	 AuthorityName(String displayName) {
        this.displayName = displayName;
     }

     public String getDisplayName() {
        return displayName;
     }
}
