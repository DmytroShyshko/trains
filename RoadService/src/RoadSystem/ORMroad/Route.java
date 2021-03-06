package ORMroad;

// Generated 18.03.2015 1:22:07 by Hibernate Tools 3.4.0.CR1

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Set;

/**
 * Route generated by hbm2java
 */
@XmlRootElement(name = "route")
@XmlAccessorType(XmlAccessType.FIELD)
public class Route implements java.io.Serializable {

	private Integer routeId;
	private String train;
	private String time;
	private String travelTime;
	private String name;
	private Set waypoints = new HashSet(0);

	public Route() {
	}

	public Route(String train, String time, String travelTime, String name) {
		this.train = train;
		this.time = time;
		this.travelTime = travelTime;
		this.name = name;
	}

	public Route(String train, String time, String travelTime, String name,
			Set waypoints) {
		this.train = train;
		this.time = time;
		this.travelTime = travelTime;
		this.name = name;
		this.waypoints = waypoints;
	}

	public Integer getRouteId() {
		return this.routeId;
	}

	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}

	public String getTrain() {
		return this.train;
	}

	public void setTrain(String train) {
		this.train = train;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTravelTime() {
		return this.travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getWaypoints() {
		return this.waypoints;
	}

	public void setWaypoints(Set waypoints) {
		this.waypoints = waypoints;
	}

	public void splitTrainName() {
		String[] trains = train.split(" ");
		this.setTrain(trains[0]);
	}

}
