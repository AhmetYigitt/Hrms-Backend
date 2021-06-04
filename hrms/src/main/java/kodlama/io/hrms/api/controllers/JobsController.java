package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concrates.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobService jobService;

	@Autowired
	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Job>> getAll(){
		return this.jobService.getAll();
	}
	
}
