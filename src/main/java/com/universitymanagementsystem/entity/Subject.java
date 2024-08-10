package com.universitymanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "table-generator")
	@TableGenerator(name = "table-generator", table = "subject_ids", pkColumnName = "seq_id", valueColumnName = "seq_value")
	private Long subjectId;
	
	private float java;
	
	private float python;
	
	private float html;
	
	private float css;
	
	private float javaScript;
	
	private Long userId;
	
	private float total = (java + python + html + css + javaScript);
	
	private float percentage = (total / 100 * 5);

	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Subject(Long subjectId, float java, float python, float html, float css, float javaScript, Long userId,
			float total, float percentage) {
		super();
		this.subjectId = subjectId;
		this.java = java;
		this.python = python;
		this.html = html;
		this.css = css;
		this.javaScript = javaScript;
		this.userId = userId;
		this.total = total;
		this.percentage = percentage;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public float getJava() {
		return java;
	}

	public void setJava(float java) {
		this.java = java;
	}

	public float getPython() {
		return python;
	}

	public void setPython(float python) {
		this.python = python;
	}

	public float getHtml() {
		return html;
	}

	public void setHtml(float html) {
		this.html = html;
	}

	public float getCss() {
		return css;
	}

	public void setCss(float css) {
		this.css = css;
	}

	public float getJavaScript() {
		return javaScript;
	}

	public void setJavaScript(float javaScript) {
		this.javaScript = javaScript;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "Subject [subjectId=" + subjectId + ", java=" + java + ", python=" + python + ", html=" + html + ", css="
				+ css + ", javaScript=" + javaScript + ", userId=" + userId + ", total=" + total + ", percentage="
				+ percentage + "]";
	}

	
	
}

