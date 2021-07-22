package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * The Primary annotation will tell spring to use this class/ service as the primary implementation of the GreetinService interface
 * when there is no specification of which implementation to use. This will be overridden by our @Qualifier annotation in the existing
 * services though.
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService{

	@Override
	public String sayGreeting() {
		return "Hello World - PRIMARY";
	}
}
