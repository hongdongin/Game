package com.ee.vo;

public class TestInfoVO {

	private int tinum;
	private String tiName;
	private String tibirth;

	public int getTinum() {
		return tinum;
	}

	public void setTinum(int tinum) {
		this.tinum = tinum;
	}

	public String getTiName() {
		return tiName;
	}

	public void setTiName(String tiName) {
		this.tiName = tiName;
	}

	public String getTibirth() {
		return tibirth;
	}

	public void setTibirth(String tibirth) {
		this.tibirth = tibirth;
	}

	@Override
	public String toString() {
		return "TestInfoVO [tinum=" + tinum + ", tiName=" + tiName + ", tibirth=" + tibirth + "]";
	}

}
