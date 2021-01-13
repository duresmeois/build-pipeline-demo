package com.userlarsb.demo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SimpleControllerTest {

	@Test
	void index_returns_something() {
		SimpleController controller = new SimpleController();
        String returnValue = controller.index();
        assertThat(returnValue).isNotNull();
        assertThat(returnValue).isNotEmpty();
	}
}
