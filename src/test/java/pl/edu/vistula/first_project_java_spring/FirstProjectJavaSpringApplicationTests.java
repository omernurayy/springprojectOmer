package pl.edu.vistula.first_project_java_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class FirstProjectJavaSpringApplicationTests {

	@GetMapping("/hello")
	@ResponseBody
	public String sayHello() {
		return "Hello, World!";
	}
}

