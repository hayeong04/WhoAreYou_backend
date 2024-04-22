package ju.ha.whoareyou;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/auth")
@Log4j
public class LoginController {

	@GetMapping("/login")
	public void login() {
		log.info("login..");
		System.out.println("login!");
	}
	
	@PostMapping("/test")
	public String test() {
		return "yse";
	}
}
