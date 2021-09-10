package ro.hibyte.polispringshop.services;

import ro.hibyte.polispringshop.domain.MemberCard;
import ro.hibyte.polispringshop.repositories.MemberCardRepository;

import java.util.ArrayList;
import java.util.List;

public class MemberCardServiceImpl implements MemberCardService {

    private MemberCardRepository memberCardRepository;

    public MemberCardServiceImpl(MemberCardRepository memberCardRepository) {
        this.memberCardRepository = memberCardRepository;
    }

    @Override
    public List<MemberCard> getAllMemberCards() {
        return new ArrayList<>(memberCardRepository.findAll());
    }
}
