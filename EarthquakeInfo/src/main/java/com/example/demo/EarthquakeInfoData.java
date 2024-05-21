package com.example.demo;

public class EarthquakeInfoData {
    private String domesticTsunami;
    private String foreignTsunami;
    private HypocenterInfoData hypocenter;
    private int maxScale;
    private String time;
	public String getDomesticTsunami() {
		return domesticTsunami;
	}
	public void setDomesticTsunami(String domesticTsunami) {
		this.domesticTsunami = domesticTsunami;
	}
	public String getForeignTsunami() {
		return foreignTsunami;
	}
	public void setForeignTsunami(String foreignTsunami) {
		this.foreignTsunami = foreignTsunami;
	}
	public HypocenterInfoData getHypocenter() {
		return hypocenter;
	}
	public void setHypocenter(HypocenterInfoData hypocenter) {
		this.hypocenter = hypocenter;
	}
	public int getMaxScale() {
		return maxScale;
	}
	public void setMaxScale(int maxScale) {
		this.maxScale = maxScale;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

    // GetterとSetterメソッド
    
}