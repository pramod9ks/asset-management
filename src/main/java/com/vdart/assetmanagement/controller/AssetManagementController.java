package com.vdart.assetmanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetManagementController {
	
	@GetMapping(value = "/")
    public String home() {
		return "Successfully login...";
    }
	
	@GetMapping(value = "/test")
    public String test() {
        return "Hello Test";
    }
	
}
