/**
 * 
 */
package com.techtalk.actuator.custom;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.endpoint.AbstractEndpoint;
import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

/**
 * @author TechTalk Debu
 *
 */
@Component
@SuppressWarnings("rawtypes")
public class ListEndpoints extends AbstractEndpoint<List<Endpoint>>{
	
	List<Endpoint> endpoints;
	
	@Autowired
    public ListEndpoints(List<Endpoint> endpoints) {
        super("myListEndpoints");
        this.endpoints = endpoints;
    }
	
	@Override
	public List<Endpoint> invoke() {
		return this.endpoints;
	}

}
