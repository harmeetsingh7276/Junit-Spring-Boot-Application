package com.junitbasic.junitSpringBootApplication;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class JunitSpringBootApplicationTests {
    private Calculator c = new Calculator();

    @Test
    void contextLoads() {
    }

    @Test
    void testSum() {
        //expected
        int expected = 17;
        //actual
        int actualResult = c.doSum(12, 3, 2);
		assertThat(actualResult).isEqualTo(expected);

    }

	@Test
	void testProduct() {
		//expected
		int expected = 8;
		//actual
		int actualResult = c.doSProduct(4, 2);
		assertThat(actualResult).isEqualTo(expected);

	}

	@Test
	@Disabled//To disable test case
	void compareTwoNumbers() {
		Boolean actualResult=c.compareTwoNums(3,3);
		assertThat(actualResult).isTrue();
	}
}
