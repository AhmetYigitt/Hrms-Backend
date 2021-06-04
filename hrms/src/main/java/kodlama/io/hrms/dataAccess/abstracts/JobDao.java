package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concrates.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
