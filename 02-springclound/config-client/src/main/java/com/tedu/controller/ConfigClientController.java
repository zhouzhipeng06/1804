package com.tedu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
	@Value("${jtver}")
	String jtver;

	@RequestMapping(value = "/jt")
	public String jt() {
		return jtver;
	}
}
