package sb.web.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class service2 {
	
	private final RestTemplate restTemplate;
	@Autowired
	public service2(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	public String callAnotherService(){
		  String otherServiceUrl = "http://localhost:9090/control2/jpa/users"; // Replace with the actual URL of the other service

	        // Make a GET request and parse the response as a String
	        ResponseEntity<String> response = restTemplate.getForEntity(otherServiceUrl, String.class);

	        // Optionally, you can access the response body and HTTP status code
	        String responseBody = response.getBody();
	        HttpStatus httpStatus = response.getStatusCode();
	        return responseBody;
	}
}
