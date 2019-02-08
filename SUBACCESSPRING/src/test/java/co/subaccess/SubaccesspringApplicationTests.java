package co.subaccess;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import co.subaccess.model.Accessibility;
import co.subaccess.model.Direction;
import co.subaccess.model.Status;
import co.subaccess.model.escalator.Escalator;
import co.subaccess.model.escalator.IEscalatorRepository;
import co.subaccess.model.subway.ISubwayRepository;
import co.subaccess.model.subway.Subway;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SubaccesspringApplicationTests {

	@Autowired
	private IEscalatorRepository escalators;

	@Autowired
	ISubwayRepository subway;

	@Before
	public void before() {

	}

	@After
	public void after() {

	}

	@Test
	public void testSubwayRepo() {
		// SUBWAY
		Subway lourmel = new Subway("lourmel", 48.837706333521396, 2.2819772051447753, 8, "Paris", "Balard");

		Escalator lourmelE = new Escalator(Accessibility.TOTALLY, Direction.UP, Status.ACTIVE, "sortie 2");
		lourmelE.setAccessibility(Accessibility.PARTIEL);
		escalators.save(lourmelE);
		lourmel.addEscalator(lourmelE);
		subway.save(lourmel);
		assertTrue(subway.count() == 1);


	}
}
