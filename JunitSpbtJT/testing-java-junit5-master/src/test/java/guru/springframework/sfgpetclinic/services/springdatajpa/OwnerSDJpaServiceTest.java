package guru.springframework.sfgpetclinic.services.springdatajpa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
class OwnerSDJpaServiceTest {
	
	OwnerSDJpaService ownerSDJpaService;

	@BeforeEach
	void setUp() throws Exception {
		ownerSDJpaService = new OwnerSDJpaService(null, null, null);
	}

	@Disabled
	@Test
	void testFindByLastName() {
		ownerSDJpaService.findByLastName("mn");
	}

	@Test
	void testFindAllByLastNameLike() {
		fail("Not yet implemented");
	}

	@Test
	void testFindAll() {
		fail("Not yet implemented");
	}

	@Test
	void testFindById() {
		fail("Not yet implemented");
	}

	@Test
	void testSave() {
		fail("Not yet implemented");
	}

	@Test
	void testDelete() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteById() {
		fail("Not yet implemented");
	}

}
