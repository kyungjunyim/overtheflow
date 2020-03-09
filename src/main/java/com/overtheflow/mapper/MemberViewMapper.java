package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MemberVO;

public interface MemberViewMapper {
	public MemberVO getMemberView(int memberNo) throws Exception;
	public List<MemberVO> getAll() throws Exception;
	public List<MemberVO> getMemberViews(Map<String,Object> map) throws Exception;
	public MemberVO getMemberById(String memberId) throws Exception;
	public MemberVO getMemberByEmail(String memberEmail) throws Exception;
	public MemberVO getMemberByNickname(String nickname) throws Exception;
	public List<MemberVO> getMembersByNo(List<Integer> memberNo) throws Exception;
	public List<MemberVO> searchMembers(Map<String, Object> map) throws Exception;
	public Integer getTotalCount(Map<String, Object> map) throws Exception;
	public MemberVO getMemberByNo(Integer memberNo) throws Exception;
}
