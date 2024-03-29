/**
 * 
 */
package com.techtalk.actuator.custom;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;

/**
 * @author TechTalk Debu
 *
 */
public class CustomAppHealth implements HealthIndicator{

	@Override
	public Health health() {
		int errorCode = check(); // perform some specific health check
		if (errorCode != 0) {
			return Health.down().withDetail("Error Code", errorCode).build();
		}
		return Health.up().build();
	}

	private int check() {
		return 0;
	}

}
