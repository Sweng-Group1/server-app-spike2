package com.sweng22.g1.spike2.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweng22.g1.spike2.model.User;
import com.sweng22.g1.spike2.service.UserService;

@RequestMapping("api/v1/user")
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping(path = "{id}")
	public User getUser(@PathVariable("id") Long id) {
		User thisUser = userService.get(id);

//		if (thisUser == null) {
//			throw new UserNotFoundException();
//		}

		return thisUser;
	}

	@GetMapping
	public List<User> getAllUsers() {
		return userService.listAll();
	}

	@PostMapping
	public void createUser(@RequestBody User newUser) {
		System.out.println(newUser);
		userService.save(newUser);
	}

	@PatchMapping
	public void updateUser(@RequestBody User thisUser) {
		userService.save(thisUser);
	}

	@DeleteMapping(path = "{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.delete(id);
	}

}
