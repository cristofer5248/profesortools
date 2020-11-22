package sv.com.profesortools.app.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sv.com.profesortools.app.models.entity.Alumno;
import sv.com.profesortools.app.models.service.IAlumnoService;

@RequestMapping("/alumno")
@Controller
public class AlumnosController {

	@Autowired
	private IAlumnoService alumnoService;

	@RequestMapping(value = "/nuevo", method = RequestMethod.GET)
	public String listar(Map<String, Object> model) {
		Alumno alumno = new Alumno();
		model.put("titulo", "Crear un nuevo alumno");
		model.put("alumno", alumno);
		return "alumno/form";
	}

	@Secured("ROLE_ADMIN")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String guardar(@Valid Alumno alumno, BindingResult result, Model model, RedirectAttributes flash,
			SessionStatus status, Authentication autentication) {

		if (result.hasErrors()) {
			model.addAttribute("titulo", "Formulario de alumnos");		
			model.addAttribute(alumno);			
			
			return "/alumno/form";
		}
		String mensajeFlash = (alumno.getId() != null) ? "Alumno editado con éxito!" : "Alumno creado con éxito!";
//		cliente.setUsuario(userservice.findByUsername(autentication.getName()));
		alumnoService.save(alumno);
		status.setComplete();
		flash.addFlashAttribute("success", mensajeFlash);
		return "redirect:/";
	}
}
