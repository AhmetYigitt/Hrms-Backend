package kodlama.io.hrms.business.concrates;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobDao;
import kodlama.io.hrms.entities.concrates.Job;

@Service
public class JobManager implements JobService {

	
	private JobDao jobDao;

    @Autowired
	public JobManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}


	@Override
	public DataResult<List<Job>> getAll() {
		return new SuccessDataResult<List<Job>>(this.jobDao.findAll());
	}
	
	
}
