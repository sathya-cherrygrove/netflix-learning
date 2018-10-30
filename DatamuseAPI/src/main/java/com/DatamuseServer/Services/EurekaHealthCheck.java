package com.DatamuseServer.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.netflix.discovery.DiscoveryClient;

@Service
public class EurekaHealthCheck {

	@RequestMapping("/DatamuseServerCheck")
	public String DatamuseServerCheck() {

		return "Datamuse Server Running Normally...";

	}

}
