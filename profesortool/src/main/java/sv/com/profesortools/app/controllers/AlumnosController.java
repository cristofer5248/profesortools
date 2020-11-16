package sv.com.profesortools.app.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/alumnos")
@Controller
public class AlumnosController {

	@RequestMapping(value = { "/listar", "/listar/{param}" }, method = RequestMethod.GET)
	public String listar(Model model, @PathVariable(value = "param", required = false) String param) {
		model.addAttribute("titulo","Hola mundo");
		return "alumnos";
	}

}
