package sb.web.demo.bean;

public class controlBean {
	private String name,job;
	private int id;
	
	public controlBean(String name, String job, int id) {
		this.name = name;
		this.job = job;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "controlBean [name=" + name + ", job=" + job + ", id=" + id + "]";
	}
	
}
