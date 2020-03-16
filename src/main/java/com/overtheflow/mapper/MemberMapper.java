package com.overtheflow.mapper;

import com.overtheflow.vo.MemberVO;

public interface MemberMapper {
	public void addMember(MemberVO vo) throws Exception;
	public void modifyMember(MemberVO vo) throws Exception;
	public void deleteMember(int memberNo) throws Exception;
	public Integer getMaxNo() throws Exception;
}
