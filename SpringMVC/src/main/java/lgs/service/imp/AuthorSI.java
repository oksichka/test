package lgs.service.imp;

import java.util.List;

import javax.transaction.Transactional;

import lgs.dao.AuthorD;
import lgs.entity.Author;
import lgs.service.AuthorS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorSI implements AuthorS {
	@Autowired
	private AuthorD authorD;

	
	@Transactional
	public void save(String name) {
		
		authorD.save(new Author(name));
	}
	
	public List<Author> findAll() {
		return authorD.findAll();
	}

	public Author findOne(int id) {
		return authorD.findOne(id);
	}
	
	

}
