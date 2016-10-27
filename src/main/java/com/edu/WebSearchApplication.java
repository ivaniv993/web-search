package com.edu;

import com.edu.utills.EnvUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
public class WebSearchApplication {

	private static final Logger log = LoggerFactory.getLogger(WebSearchApplication.class);

	public static void main(String[] args) {

		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, getActiveProfile());
		SpringApplication.run(WebSearchApplication.class, args);

	}

	private static String getActiveProfile(){
		String host = null;
		try {
			host = InetAddress.getLocalHost().getHostName();
			log.info("Host : {}", host);
		} catch (UnknownHostException e) {
			log.error("Error ", e);
		}

		String workingHost = "IIVANIV3";
		if (workingHost.equals(host)) {
			return EnvUtil.WORK_PLACE.name();
		}else return EnvUtil.HOME_PLACE.name();

	}
}
