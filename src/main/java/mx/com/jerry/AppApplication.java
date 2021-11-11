package mx.com.jerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	@GetMapping
	public ResponseEntity<Object> saludar(){
		return new ResponseEntity<>(new Saludar("Hola Mundo"), HttpStatus.OK);
	}

}
class Saludar{
	private String mensaje;

	public Saludar(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public Saludar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
