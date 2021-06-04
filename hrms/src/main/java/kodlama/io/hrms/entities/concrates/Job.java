package kodlama.io.hrms.entities.concrates;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jobs")
public class Job {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "JobID")
	private int id;
	
	@Column(name = "Name")
	private String name;

	public Job() {}
	
	public Job(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
