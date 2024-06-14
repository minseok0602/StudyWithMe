package Actor;

public class Student extends Member {
	private int totalStudyTime;
	private String motto;
	private int totalPlan;
	private int completePlan;
	private float performanceRate;
	public Student(String id,String name, String depart) {
		this.id = id;
		this.name= name;
		this.depart = depart;
		totalStudyTime = 0 ;
		totalPlan = 0 ;
		completePlan = 0 ;
		performanceRate = 0;
	}
	public int getTotalStudyTime() {
		return totalStudyTime;
	}
	public void addStudyTime(int t) {
		totalStudyTime+=t;
	}
	public String getMotto() {
		return motto;
	}
	public void setMotto(String motto) {
		this.motto = motto;
	}
	public int getTotalPlan() {
		return totalPlan;
	}
	public void setTotalPlan(int totalPlan) {
		this.totalPlan = totalPlan;
	}
	public int getCompletePlan() {
		return completePlan;
	}
	public void setCompletePlan(int completePlan) {
		this.completePlan = completePlan;
	}
	public float getPerformanceRate() {
		return performanceRate;
	}
}
