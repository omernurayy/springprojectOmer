package pl.edu.vistula.first_project_java_spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HelloController {

	@GetMapping(value = "/")
	@ResponseBody
	public String sayHello() {
		return "Hello Vistula, in my first Spring controller.";
	}
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="Vistula") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
