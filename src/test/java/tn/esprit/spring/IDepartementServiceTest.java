package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import java.util.List;

import tn.esprit.spring.services.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;

@RunWith(SpringRunner.class)
@SpringBootTest

public class IDepartementServiceTest {
	@Autowired
	IDepartementService IDepartement;
	@Test
	public void getAllDepartements() {
		List<Departement> departements = IDepartement.getAllDepartements();
		assertEquals(4,departements.size());
		
	}
}


