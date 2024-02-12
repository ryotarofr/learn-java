package com.firstapp.hello.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.firstapp.hello.domains.Member;

@Mapper
public interface MemberMapper {
  List<Member> all();
}