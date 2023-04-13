package com.vcsd.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {
    public String fatchStateName(String ssn) {
    	
    	String stateName=null;
    	if(ssn.startsWith("4")) {
    		stateName="NewJersi";
    	}else if(ssn.startsWith("5")) {
    		stateName="Rhode Island";
    	}else if(ssn.startsWith("6")) {
    		stateName="Kentukky";
    	}else if(ssn.startsWith("7")) {
    		stateName="Ohio";
    	}else {
    		stateName="Invalid ssn";
    	}
    	return stateName;
    }
}
