package com.ee.vo;

public class TestInfoVO {

	private int tinum;
	private String tiName;
	private String tidesc;

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

	public String getTidesc() {
		return tidesc;
	}

	public void setTidesc(String tidesc) {
		this.tidesc = tidesc;
	}

	@Override
	public String toString() {
		return "TestInfoVO [tinum=" + tinum + ", tiName=" + tiName + ", tidesc=" + tidesc + "]";
	}

}
