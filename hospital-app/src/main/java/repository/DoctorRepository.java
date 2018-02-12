package repository;

import org.springframework.data.repository.CrudRepository;

import dao.DoctorRecord;

public interface DoctorRepository extends CrudRepository<DoctorRecord, Long>{
	
}
