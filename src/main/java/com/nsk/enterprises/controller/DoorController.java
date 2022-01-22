package com.nsk.enterprises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsk.enterprises.domain.Door;
import com.nsk.enterprises.dto.DoorDTO;

@RestController
@RequestMapping(path = "/api")
public class DoorController {

	@Autowired
	DoorDTO doorDTO;

	@GetMapping("/doors")
	public Door getDoorDet() {
		return new Door(doorDTO.getDoorId(), doorDTO.getDoorSize(), doorDTO.getDoorType());
	}

}
