package dnc.rest.demo.students.entity;

/**
 * 
 * @author Shaik Chand Basha
 * 
 *
 */
public class Student 
{
	private int id;
	private String name;
	private int sem;
	private int avg;
	
	
	
	/**
	 * Student Constructor
	 * @param id
	 * @param name
	 * @param sem
	 * @param avg
	 */
	public Student(int id, String name, int sem, int avg) {
		super();
		this.id = id;
		this.name = name;
		this.sem = sem;
		this.avg = avg;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sem
	 */
	public int getSem() {
		return sem;
	}
	/**
	 * @param sem the sem to set
	 */
	public void setSem(int sem) {
		this.sem = sem;
	}
	/**
	 * @return the avg
	 */
	public int getAvg() {
		return avg;
	}
	/**
	 * @param avg the avg to set
	 */
	public void setAvg(int avg) {
		this.avg = avg;
	}
	
	
	
	

}
