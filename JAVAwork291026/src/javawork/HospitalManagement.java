package javawork;

public class HospitalManagement {
	
	private int id;
	private String name;
	private String issue;
	
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
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
	
	public static void main(String[]args) {
		
		HospitalManagement h = new HospitalManagement();
		
		System.out.println("Patient Details : ");
		System.out.println();
		
		 h.setId(1);
		h.setName("Tulip");
		h.setIssue("Fever");
		
		System.out.println(h.getId()+" - "+h.getName()+" - "+h.getIssue());
	
		
		h.setId(2);
		h.setName("Murali");
		h.setIssue("Cold and cough");
		
		
		System.out.println(h.getId()+" - "+h.getName()+" - "+h.getIssue());
	}
	

}
