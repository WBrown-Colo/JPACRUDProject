package com.skilldistillery.sports.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.sports.entities.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ColoSportsDAOImpl implements ColoSportsDAO{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Team> findAll() {
		
		String allTeams = "SELECT t FROM Team t";
		List<Team> results = em.createQuery(allTeams, Team.class)
							   .getResultList();
		return results;
	}

	@Override
	public Team findById(int teamId) {
		return em.find(Team.class, teamId);
	}
	
	//NO transaction.begin/commit
	//NO em.close

	@Override
	public Team create(Team newTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Team update(int teamId, Team updatingTeam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int teamId) {
		// TODO Auto-generated method stub
		return false;
	}

}
