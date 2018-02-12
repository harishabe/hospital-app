package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dao.DoctorRecord;
import service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	@RequestMapping(value="/signUp",method=RequestMethod.POST)
	public void addDoctor(@RequestBody DoctorRecord doctorRecord) {
		doctorService.addDoctor(doctorRecord);
	}
}
