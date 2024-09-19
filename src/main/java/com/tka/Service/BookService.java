package com.tka.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.Dao.BookDao;

@Service
public class BookService {
	@Autowired
	BookDao bookdao;

}
