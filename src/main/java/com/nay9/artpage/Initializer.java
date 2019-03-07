package com.nay9.artpage;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.nay9.artpage.repositories.Art;
import com.nay9.artpage.repositories.ArtRepository;

@Service
public class Initializer implements CommandLineRunner{
	
	@Resource
	ArtRepository artRepo;

	@Override
	public void run(String... args) throws Exception {
		Art art1 = artRepo.save(new Art("first-painting.jpg", "ink", "first"));
		
		Art art2 = artRepo.save(new Art("second-painting.jpg", "black and white", "second"));
	}

}