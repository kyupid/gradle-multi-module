package com.morazo.core.dao;

import com.morazo.core.entity.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {

    void save(Member member);
}
