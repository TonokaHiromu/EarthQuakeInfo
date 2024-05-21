package com.example.demo;
import java.util.List;

public class EarthquakeData {
    private int code;
    private EarthquakeInfoData earthquakeInfoData;
    private String id;
    private IssueInfoData issue;
    private List<EarthquakePointData> points;
    private String time;
    private TimestampInfoData timestamp;
    private String user_agent;
    private String ver;
    
    
    //GetterSetter
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public EarthquakeInfoData getEarthquake() {
		return earthquakeInfoData;
	}
	public void setEarthquake(EarthquakeInfoData earthquake) {
		this.earthquakeInfoData = earthquake;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public IssueInfoData getIssue() {
		return issue;
	}
	public void setIssue(IssueInfoData issue) {
		this.issue = issue;
	}
	public List<EarthquakePointData> getPoints() {
		return points;
	}
	public void setPoints(List<EarthquakePointData> points) {
		this.points = points;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public TimestampInfoData getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(TimestampInfoData timestamp) {
		this.timestamp = timestamp;
	}
	public String getUser_agent() {
		return user_agent;
	}
	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}
	public String getVer() {
		return ver;
	}
	public void setVer(String ver) {
		this.ver = ver;
	}

    // GetterとSetterメソッド
}




