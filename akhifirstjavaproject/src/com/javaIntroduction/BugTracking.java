package com.javaIntroduction;

public class BugTracking {

	int bugid;
	String applicationname;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assignneddeveloper;

	public static void main(String[] args) {
		BugTracking b1 = new BugTracking();
		b1.bugid = 1024;
		b1.applicationname = "CloudCart Mobile";
		b1.bugtitle = "App crashes when user switches from WiFi to cellular data during checkout";
		b1.severity = "Critical";
		b1.priority = "High";
		b1.status = "In Progress";
		b1.assignneddeveloper = "Madhu";
		b1.displayBugsummary();
		
		
	}

	int getbugid() {
		return bugid;
	}
	String getapplicationname() {
		return applicationname;
	}
	String getbugtitle() {
		return bugtitle;
	}
	String getseverity() {
		return severity;
	}
	String getpriority() {
		return priority;
	}
	String getstatus() {
		return status;
	}
	String getassigndev() {
		return assignneddeveloper;
	}
	void assignToDev(int bugid,String Developername) {
		assignneddeveloper=Developername;
}
	String updatestatus(String newStatus) {
		newStatus="In Development";
		status=newStatus;
		return status;
	}
	void displayBugsummary() {
		System.out.println("BugId:"+getbugid());
		System.out.println("Application Name:"+getapplicationname());
		System.out.println("Bug Title:"+getbugtitle());
		System.out.println("Severity:"+getseverity());
		System.out.println("Priority:"+getpriority());
		System.out.println("Satus:"+getstatus());
		System.out.println("Assigned Developer:"+getassigndev());
		assignToDev(1024, "Kvr");
		System.out.println("New Assigned Developer:"+getassigndev());
		System.out.println("Updated Status:"+updatestatus(status));
		
	}
}