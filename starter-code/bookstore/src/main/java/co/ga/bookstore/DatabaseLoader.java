package co.ga.bookstore;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DatabaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void init() {
        log.info("Saved {}", bookRepository.save(new Book("Rainbow Six", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("The Hunt For Red October", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("Without Remorse", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("Red Storm Rising", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("Debt of Honor","Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("Clear and Present Danger", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("Red Rabbit", "Tom Clancy")));
        log.info("Saved {}", bookRepository.save(new Book("The Man in the High Castle", "Philip K. Dick")));
        log.info("Saved {}", bookRepository.save(new Book("A Scanner Darkly", "Philip K. Dick")));
        log.info("Saved {}", bookRepository.save(new Book("Do Androids Dream of Electric Sheep", "Philip K. Dick")));
    }
}
