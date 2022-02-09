package com.java.gbsuftblai.controllers;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.java.gbsuftblai.services.GbsuFtbLaiService;

@RestController
@RequestMapping(value = "/gbsu-ftb-lai", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = { "http://localhost:8080", "http://localhost:4200" })
public class GbsuFtbLaiController {

	@GetMapping(value = "/{inputNumber}")
	public String convertNumber(@PathVariable(name = "inputNumber") Integer inputNumber) {

		String response = GbsuFtbLaiService.convertNumber(inputNumber);
		Map<String, String> elements = new HashMap<>();
		elements.put("result", response);
		ObjectMapper objectMapper = new ObjectMapper();
		String json = null;
		try {
			json = objectMapper.writeValueAsString(elements);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return json;
	}
}
