package be.pirbaert.DAOs;

import java.sql.Connection;
import java.util.List;

import be.pirbaert.POJOs.Registration;

public class RegistrationDAO extends DAO<Registration> {

	public RegistrationDAO(Connection connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean create(Registration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Registration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Registration obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Registration find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Registration> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
