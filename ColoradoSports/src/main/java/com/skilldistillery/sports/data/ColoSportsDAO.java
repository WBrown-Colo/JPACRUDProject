package com.skilldistillery.sports.data;

import java.util.List;

import com.skilldistillery.sports.entities.Team;

public interface ColoSportsDAO {
	List<Team> findAll();
	Team findById (int teamId);
	Team create(Team newTeam);
	Team update(int teamId, Team updatingTeam);
	boolean deleteById(int teamId);

}
