package com.overtheflow.mapper;
import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MusicVO;

/**
 * 
 * @author 김준성
 * getter 및 search 메소드들을 MusicViewMapper 로 옮김.
 */
public interface MusicMapper {
	public void addMusic(MusicVO music)throws Exception;
	public void addPlayCnt(Integer fileNo)throws Exception;
	public void modifyMusic(MusicVO music)throws Exception;
	public void deleteMusic(Integer fileNo)throws Exception;
	public void deletePlayCnt(Integer fileNo)throws Exception;
	public void increasePlayCnt(Integer fileNo) throws Exception;
	public MusicVO getMusicByNo(Integer integer)throws Exception;
	public List<MusicVO> getMusics()throws Exception;
	public List<MusicVO> getMusics(Map<String, Object> map)throws Exception;
	public List<MusicVO> getMusicsByNo(Map<String, Object> map)throws Exception;
	public List<MusicVO> getMusicsByMemberNo(Map<String, Object> map)throws Exception;
	public String[] getTagsByNo(Integer fileNo)throws Exception;
	public int getMaxNo()throws Exception;
	public Integer getTotalCount(Map<String, Object> map) throws Exception;
}
