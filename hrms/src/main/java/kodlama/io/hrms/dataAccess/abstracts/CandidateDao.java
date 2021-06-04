package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concrates.Candidate;


public interface CandidateDao extends JpaRepository<Candidate, Integer>{

}
