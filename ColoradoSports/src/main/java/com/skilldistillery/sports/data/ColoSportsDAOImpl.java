package com.skilldistillery.sports.data;

import java.util.List;

import org.springframework.stereotype.Service;

import com.skilldistillery.sports.entities.Team;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ColoSportsDAOImpl implements ColoSportsDAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Team> findAll() {

		String allTeams = "SELECT t FROM Team t";
		List<Team> results = em.createQuery(allTeams, Team.class).getResultList();
		return results;
	}

	@Override
	public Team findById(int teamId) {
		return em.find(Team.class, teamId);
	}

	// NO transaction.begin/commit
	// NO em.close

	@Override
	public Team create(Team newTeam) {
		em.persist(newTeam);
		return newTeam;
	}

	@Override
	public Team update(int teamId, Team updatedTeam) {
		Team managedTeam = em.find(Team.class, teamId);
		managedTeam.setName(updatedTeam.getName());
		managedTeam.setLeague(updatedTeam.getLeague());
		managedTeam.setSportName(updatedTeam.getSportName());
		managedTeam.setOwner(updatedTeam.getOwner());
		managedTeam.setManager(updatedTeam.getManager());
		managedTeam.setCoach(updatedTeam.getCoach());
		managedTeam.setNumberChampionships(updatedTeam.getNumberChampionships());
		managedTeam.setVenue(updatedTeam.getVenue());
		managedTeam.setCity(updatedTeam.getCity());
		managedTeam.setNumberHOF(updatedTeam.getNumberHOF());
		managedTeam.setEstablished(updatedTeam.getEstablished());
		managedTeam.setActive(updatedTeam.getActive());
		managedTeam.setValue(updatedTeam.getValue());
		em.persist(managedTeam);
		return managedTeam;
	}

	@Override
	public boolean deleteById(int teamId) {
		try {
			Team managedTeam = em.find(Team.class, teamId);
			em.remove(managedTeam);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}
