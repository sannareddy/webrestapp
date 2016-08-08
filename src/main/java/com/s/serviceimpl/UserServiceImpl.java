package com.s.serviceimpl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.s.dao.UserDAO;
import com.s.daoimpl.UserDAOImpl;
import com.s.entities.User;
import com.s.service.UserService;
@Path("users")
public class UserServiceImpl implements UserService{
	private UserDAO userDAO=new UserDAOImpl();
	@Override
	@POST
	@Produces("application/json")
	@Path("create")
	public String createUser(User user) {
		try{
			if(userDAO.createUser(user)){
				return "{result:SUCCESS}";
			}else{
				return "{result:FAILED,cause:FAILED_TO_ADD}";
			}
		}catch(ClassNotFoundException|SQLException|IOException ex){
			return "{result:FAILED,cause:INTERNAL_ERROR}";
		}		
	}

	@Override
	@GET 
	@Produces("application/json")
	@Path("{id}")
	public User getUser(@PathParam("id")int userID) {
		User user=null;
		try{
			user=userDAO.getUser(userID);
			return user;			
		}catch(ClassNotFoundException|SQLException|IOException ex){
			return null;
		}		
	}

	@Override
	@GET
	@Produces("application/json")
	public Set<User> getAllUsers() {
		try{
			return userDAO.getAllUsers();			
		}catch(ClassNotFoundException|SQLException|IOException ex){
			return null;
		}
	}
	
}