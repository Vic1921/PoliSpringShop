package ro.hibyte.polispringshop.bootstrap;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ro.hibyte.polispringshop.domain.*;
import ro.hibyte.polispringshop.domain.enums.CardType;
import ro.hibyte.polispringshop.domain.enums.ShirtSize;
import ro.hibyte.polispringshop.repositories.*;

import java.time.LocalDate;
import java.util.UUID;

import static ro.hibyte.polispringshop.domain.enums.ShirtSize.*;

/*
@Component
public class Bootstrap implements CommandLineRunner {

    private AwayShirtRepository awayShirtRepository;
    private HomeShortRepository homeShortRepository;
    private BallRepository ballRepository;
    private MemberCardRepository memberCardRepository;
    private UserRepsitory userRepsitory;

    public Bootstrap(AwayShirtRepository awayShirtRepository, HomeShortRepository homeShortRepository,
                     BallRepository ballRepository, MemberCardRepository memberCardRepository,
                     UserRepsitory userRepsitory) {
        this.awayShirtRepository = awayShirtRepository;
        this.homeShortRepository = homeShortRepository;
        this.ballRepository = ballRepository;
        this.memberCardRepository = memberCardRepository;
        this.userRepsitory = userRepsitory;
    }

    @Override
    public void run(String... args) throws Exception {

        AwayShirt awayShirt2017 = new AwayShirt(1L, 20, "2017", M);
        AwayShirt awayShirt2018 = new AwayShirt(2L, 15, "2017", L);
        AwayShirt awayShirt2019 = new AwayShirt(3L, 30, "2017", S);

        awayShirtRepository.save(awayShirt2017);
        awayShirtRepository.save(awayShirt2018);
        awayShirtRepository.save(awayShirt2019);

        HomeShirt homeShirt2018 = new HomeShirt(1L, 20, "2018", XS);
        HomeShirt homeShirt2019 = new HomeShirt(2L, 50, "2019", L);
        HomeShirt homeShirt2020 = new HomeShirt(3L, 100, "2020", XXL);

        homeShortRepository.save(homeShirt2018);
        homeShortRepository.save(homeShirt2019);
        homeShortRepository.save(homeShirt2020);

        Ball ball1 = new Ball(1L, 50, "Jabulani", 5);
        Ball ball2 = new Ball(2L, 100, "Puma", 5);
        Ball ball3 = new Ball(3L, 150, "Electrica", 5);

        ballRepository.save(ball1);
        ballRepository.save(ball2);
        ballRepository.save(ball3);

        MemberCard junior = new MemberCard(1L, 99.99, CardType.JUNIOR);
        MemberCard viola = new MemberCard(2L, 199.99, CardType.VIOLA);
        MemberCard gold = new MemberCard(3L, 499.99, CardType.GOLD);
        MemberCard platinum = new MemberCard(4L, 999.99, CardType.PLATINUM);

        memberCardRepository.save(junior);
        memberCardRepository.save(viola);
        memberCardRepository.save(gold);
        memberCardRepository.save(platinum);

        User user1 = new User(UUID.randomUUID(), "Victor", "Binzar", LocalDate.of(2001,11,2), "Timisoara");
        User user2 = new User(UUID.randomUUID(), "Alex", "Binzar", LocalDate.of(2011,12,4), "Arad");
        User user3 = new User(UUID.randomUUID(), "Vlad", "Darius", LocalDate.of(2001,9,3), "Surduc");

        userRepsitory.save(user1);
        userRepsitory.save(user2);
        userRepsitory.save(user3);

    }
}

*/

