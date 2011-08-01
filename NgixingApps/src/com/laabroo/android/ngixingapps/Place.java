package com.laabroo.android.ngixingapps;

public class Place {

	public double lat;
	public double lon;
	public int catetory;
	public String locName;

	public Place(double pLat, double pLon, int pCategory, String pLocName) {
		this.lon = pLon;
		this.lat = pLat;
		this.catetory = pCategory;
		this.locName = pLocName;

	}

}
