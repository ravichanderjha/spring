package org.example;

public class Student {

	private int sId;
	private String sName;
	private String course;

	/**
	 * @return the sId
	 */
	public int getsId() {
		return sId;
	}

	/**
	 * @param sId
	 *            the sId to set
	 */
	public void setsId(int sId) {
		System.out.println("Inside setter id");
		this.sId = sId;
	}

	/**
	 * @return the sName
	 */
	public String getsName() {
		return sName;
	}

	/**
	 * @param sName
	 *            the sName to set
	 */
	public void setsName(String sName) {
		this.sName = sName;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
	}

}
