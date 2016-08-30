package com.beans;

import java.sql.Timestamp;

public class Batch {

	private int batchId;
	private String status;
	private Timestamp JobTime;
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getJobTime() {
		return JobTime;
	}
	public void setJobTime(Timestamp jobTime) {
		JobTime = jobTime;
	}
	
	
}
