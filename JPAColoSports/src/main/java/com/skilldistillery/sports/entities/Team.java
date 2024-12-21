package com.skilldistillery.sports.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String league;
	
	@Column(name= "sport_name")
	private String sportName;
	private String owner;
	private String manager;
	private String coach;
	
	@Column(name= "number_championships")
	private Integer numberChampionships;
	private String venue;
	private String city;
	
	@Column(name= "number_HoF")
	private Integer numberHOF;
	private Integer established;
	private Boolean active;
	
	@Column(name= "value_usd")
	private String value;
	
	
	
	
	public Team() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeague() {
		return league;
	}

	public void setLeague(String league) {
		this.league = league;
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public Integer getNumberChampionships() {
		return numberChampionships;
	}

	public void setNumberChampionships(Integer numberChampionships) {
		this.numberChampionships = numberChampionships;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getNumberHOF() {
		return numberHOF;
	}

	public void setNumberHOF(Integer numberHOF) {
		this.numberHOF = numberHOF;
	}

	public Integer getEstablished() {
		return established;
	}

	public void setEstablished(Integer established) {
		this.established = established;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", league=" + league + ", sportName=" + sportName + ", owner="
				+ owner + ", manager=" + manager + ", coach=" + coach + ", numberChampionships=" + numberChampionships
				+ ", venue=" + venue + ", city=" + city + ", numberHOF=" + numberHOF + ", established=" + established
				+ ", active=" + active + ", value=" + value + "]";
	}

}
