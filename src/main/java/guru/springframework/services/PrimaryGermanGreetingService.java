package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by jt on 5/24/17.
 */

public class PrimaryGermanGreetingService implements GreetingService {
    @Autowired
    private GreetingRepository greetingRepository;

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
