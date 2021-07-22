package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * This is an example of property based injection (least preferred) in which we inject the properties manually.
 */
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();

		controller.greetingService = new ConstructorInjectedGreetingService();
	}

	@Test
	void getGreeting() {

		System.out.println(controller.getGreeting());
	}
}