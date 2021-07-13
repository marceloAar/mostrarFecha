//Marcelo Aceituno R
//Full Stack JAVA 0034
//Mostrar La Fecha
package com.coding.fecha;

import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	
	@RequestMapping("/")
	public String principal() {
		
		return "index.jsp";
		
	}
	
	
	@RequestMapping("/date")
	public String mostrarFecha(Model model) {
		Date fecha = new Date();		
		
		String patron = "'Fecha: ' EEEE d 'de' MMMM 'de' YYYY";
		SimpleDateFormat formatoFecha = new SimpleDateFormat(patron);
		String fec = formatoFecha.format(fecha);
		
        model.addAttribute("Fecha", fec);
        return "fecha.jsp";
    }
	
	@RequestMapping("/time")
	public String mostrarHora(Model model) {
		Date hora = new Date();
		
		String patron = "'Hora: ' hh:mm aa";
		SimpleDateFormat formatoHora = new SimpleDateFormat(patron);
		String hor = formatoHora.format(hora);
		
        model.addAttribute("Hora", hor);
        return "hora.jsp";
    }	

}
