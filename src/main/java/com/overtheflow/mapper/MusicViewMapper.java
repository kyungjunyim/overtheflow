package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.MusicVO;

public interface MusicViewMapper {
	
	public MusicVO getMusicByMusicNo(Integer integer);
	public List<MusicVO> getMusics(Map<String, Object> map);
	public List<MusicVO> getMusicAll(Map<String,Object> map);
	public List<MusicVO> getMusicsByMemberNo(Map<String, Object> map);
	public String[] getTagsByMusicNo(int fileNo);
	public int getMaxNo();
	public List<MusicVO> getMusicsByNos(Map<String, Object> map);
	public Integer getTotalCount(Map<String, Object> map);
}
