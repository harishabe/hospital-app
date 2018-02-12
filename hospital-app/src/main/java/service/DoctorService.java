package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DoctorRecord;
import repository.DoctorRepository;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
	public void addDoctor(DoctorRecord doctorRecord) {
		doctorRepository.save(doctorRecord);
	}
}
