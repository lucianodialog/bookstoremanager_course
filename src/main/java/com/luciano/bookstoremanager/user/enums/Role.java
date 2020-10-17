package com.luciano.bookstoremanager.user.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Role {

    ADMIN("ADMIN"),
    USER("USER");

    private final String description;
    
    Role(String description){
		this.description = description;		
    	
    }
	
	
}