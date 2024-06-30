package br.com.erick.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.erick.exceptions.UnsupportedMathOperationException;
import br.com.erick.math.SimpleMath;
import br.com.erick.utils.Utils;

@RestController
public class MathController {
	SimpleMath math = new SimpleMath();

	// Recuperar dados da URL, Como o parâmetro é
	// obrigatório, preciso fazer a especificação
	// no @GetMapping ou @RequestMapping
	@GetMapping("/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.sum(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping("/average/{numberOne}/{numberTwo}")
	public Double average(@PathVariable(value = "numberOne")String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		
		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.average(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping("/divide/{numberOne}/{numberTwo}")
	public Double divide(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.divide(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping("/multiply/{numberOne}/{numberTwo}")
	public Double multiply(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.multiply(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
	
	@GetMapping("/square/{number}")
	public Double square(@PathVariable(value = "number")String number) throws Exception {
		
		if (!Utils.isNumeric(number)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return Math.sqrt(Utils.convertToDouble(number));
	}
	
	@GetMapping("/subtract/{numberOne}/{numberTwo}")
	public Double subtract(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!Utils.isNumeric(numberOne) || !Utils.isNumeric(numberTwo)) {
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}

		return math.multiply(Utils.convertToDouble(numberOne), Utils.convertToDouble(numberTwo));
	}
}
