package com.neu.entity;

public class Train {
	private String train_no;
	private String start_station;
	private String arrival_station;
	private String start_time;
	private String arrival_time;
	private String type;
	private String runtime;
	private Integer mile;
	@Override
	public String toString() {
		return "Train [train_no=" + train_no + ", start_station=" + start_station + ", arrival_station="
				+ arrival_station + ", start_time=" + start_time + ", arrival_time=" + arrival_time + ", type=" + type
				+ ", runtime=" + runtime + ", mile=" + mile + "]";
	}
	public Train(String train_no, String start_station, String arrival_station, String start_time, String arrival_time,
			String type, String runtime, Integer mile) {
		super();
		this.train_no = train_no;
		this.start_station = start_station;
		this.arrival_station = arrival_station;
		this.start_time = start_time;
		this.arrival_time = arrival_time;
		this.type = type;
		this.runtime = runtime;
		this.mile = mile;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTrain_no() {
		return train_no;
	}
	public void setTrain_no(String train_no) {
		this.train_no = train_no;
	}
	public String getStart_station() {
		return start_station;
	}
	public void setStart_station(String start_station) {
		this.start_station = start_station;
	}
	public String getArrival_station() {
		return arrival_station;
	}
	public void setArrival_station(String arrival_station) {
		this.arrival_station = arrival_station;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getRuntime() {
		return runtime;
	}
	public void setRuntime(String runtime) {
		this.runtime = runtime;
	}
	public Integer getMile() {
		return mile;
	}
	public void setMile(Integer mile) {
		this.mile = mile;
	}
}
