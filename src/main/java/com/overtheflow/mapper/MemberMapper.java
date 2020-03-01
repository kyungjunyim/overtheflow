package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MemberVO;

public interface MemberMapper {
	public void addMember(MemberVO vo) throws Exception;
	public void modifyMember(MemberVO vo) throws Exception;
	public void deleteMember(Integer memberNo) throws Exception;
	public MemberVO getMemberById(String memberId) throws Exception;
	public MemberVO getMemberByEmail(String memberEmail) throws Exception;
	public MemberVO getMemberByNickname(String nickname) throws Exception;
	public MemberVO getMemberByNo(Integer memberNo) throws Exception;
	public List<MemberVO> getMembers() throws Exception;
	public List<MemberVO> getMembers(Map<String, Object> map) throws Exception;
	public List<MemberVO> getMembersByNo(List<Integer> memberNo) throws Exception;
	public Integer getMaxNo() throws Exception;
	public MemberVO getMemberView(Integer memberNo) throws Exception;
	public List<MemberVO> getMemberViews(Map<String,Object> map) throws Exception;
	public Integer getTotalCount(Map<String, Object> map) throws Exception;
}
