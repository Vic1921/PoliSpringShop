package ro.hibyte.polispringshop.services;

import org.springframework.stereotype.Service;
import ro.hibyte.polispringshop.domain.MemberCard;

import java.util.List;

public interface MemberCardService {
    List<MemberCard> getAllMemberCards();
}
