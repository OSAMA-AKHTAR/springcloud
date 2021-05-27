package com;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@RequestMapping("/getDataFromCloud")
	public String getDataFromCloud() {
		return "Hello All, How r u today";
	}
}
