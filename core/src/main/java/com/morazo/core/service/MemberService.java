package com.morazo.core.service;

import com.morazo.core.dao.MemberDao;
import com.morazo.core.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberDao memberDao;

    public void save(Member member) {
        memberDao.save(member);
    }
}
