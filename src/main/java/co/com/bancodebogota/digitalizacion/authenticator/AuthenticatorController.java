package co.com.bancodebogota.digitalizacion.authenticator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.bancodebogota.digitalizacion.authenticator.services.AuthenticatorServiceImpl;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/auth"})
public class AuthenticatorController {
	
	public AuthenticatorServiceImpl authService;
	
	@PostMapping(path="/user")
    public void authorize(@RequestBody User user){
        
    };
    
    @PostMapping(path="/user")
    public void authorize(@RequestParam String username, @RequestParam String password){
        
    };
    
    @GetMapping(path="/user")
    public void login(@RequestParam String username, @RequestParam String password){
    };

}

