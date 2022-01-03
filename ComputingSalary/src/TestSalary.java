package ece325_assignment4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TestSalary {
	// each test has a comment above stating which test it corresponds to in the test plan
	@Test
	// test 1
	void testPayExpectedOutput() {
		assertEquals(60, Salary.pay(100.00, 50.00, 10), 0.001);
	}
	@Test
	// test 2
	void testPayLargeBonus() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(100.00, 50.00, 11);
		});
	}
	@Test
	// test 3
	void testPayNegativeBonus() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(100.00, 50.00, -1);
		});
	}
	@Test
	// test 4
	void testPayNegativeSalary() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(-1.00, 50.00, 10);
		});
	}
	@Test
	// test 5
	void testPayLargeSalary() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(1001.00, 50.00, 10);
		});
	}
	@Test
	// test 6
	void testPayNegativeSnacksAmount() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(100.00, -1.00, 10);
		});
	}
	@Test
	// test 7
	void testPayLargeSnacksAmount() {
		assertThrows(IllegalArgumentException.class, () -> {Salary.pay(100.00, 101.00, 0);
		});
	}
	@Test
	// test 8
	void testPaySnacksAmountGreaterThanSalary() {
		assertEquals(9, Salary.pay(100.00, 101.00, 10), 0.001);
	}
}