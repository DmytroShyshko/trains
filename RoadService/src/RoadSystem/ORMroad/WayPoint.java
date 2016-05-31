package ORMroad;

// Generated 18.03.2015 1:22:07 by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Waypoint generated by hbm2java
 */
@XmlRootElement(name = "wayPoint")
@XmlAccessorType(XmlAccessType.FIELD)
public class WayPoint implements java.io.Serializable {
	private Integer wayPointId;
	@XmlElement(name = "route")
	private Route route;
	@XmlElement(name = "station")
	private Station station;
	private String arrival;
	private String despatch;

	public WayPoint() {
	}

	public WayPoint(Route route, Station station, String arrival,
			String despatch) {
		this.route = route;
		this.station = station;
		this.arrival = arrival;
		this.despatch = despatch;
	}

	public Integer getWayPointId() {
		return this.wayPointId;
	}

	public void setWayPointId(Integer wayPointId) {
		this.wayPointId = wayPointId;
	}

	public Route getRoute() {
		return this.route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public Station getStation() {
		return this.station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public String getArrival() {
		return this.arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDespatch() {
		return this.despatch;
	}

	public void setDespatch(String despatch) {
		this.despatch = despatch;
	}

}