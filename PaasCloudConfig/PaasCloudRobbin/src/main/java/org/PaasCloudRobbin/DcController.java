package org.PaasCloudRobbin;

import javax.ws.rs.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.converters.Auto;

@RestController
public class DcController {

	
	@Autowired
	private LoadBalancerClient client;

	@Auto
	private RestTemplate restTemplate;
	
	@RequestMapping("dc")
	public void dc(){
		ServiceInstance instance= client.choose("compute-service");
		System.out.println(instance.getHost()+instance.getPort()+instance.getServiceId());
	}
	
	
}
