package br.study.spring.batch.database.configxml;

import java.io.Serializable;

public class Tutorial implements Serializable {

	private static final long serialVersionUID = 1L;

	private int tutorial_id;
	private String tutorial_author;
	private String tutorial_title;
	private String submission_date;
	private String tutorial_icon;
	private String tutorial_description;

	public int getTutorial_id() {
		return tutorial_id;
	}

	public void setTutorial_id(int tutorial_id) {
		this.tutorial_id = tutorial_id;
	}

	public String getTutorial_author() {
		return tutorial_author;
	}

	public void setTutorial_author(String tutorial_author) {
		this.tutorial_author = tutorial_author;
	}

	public String getTutorial_title() {
		return tutorial_title;
	}

	public void setTutorial_title(String tutorial_title) {
		this.tutorial_title = tutorial_title;
	}

	public String getSubmission_date() {
		return submission_date;
	}

	public void setSubmission_date(String submission_date) {
		this.submission_date = submission_date;
	}

	public String getTutorial_icon() {
		return tutorial_icon;
	}

	public void setTutorial_icon(String tutorial_icon) {
		this.tutorial_icon = tutorial_icon;
	}

	public String getTutorial_description() {
		return tutorial_description;
	}

	public void setTutorial_description(String tutorial_description) {
		this.tutorial_description = tutorial_description;
	}

	@Override
	public String toString() {
		return " [Tutorial id=" + tutorial_id + ", " + "Tutorial Author=" + tutorial_author + "," + " Tutorial Title="
				+ tutorial_title + ", " + "Submission Date=" + submission_date + "tutorial_icon: " + tutorial_icon
				+ ", " + "tutorial_description: " + tutorial_description + "]";
	}
}
