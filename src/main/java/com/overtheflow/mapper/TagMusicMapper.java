package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
public interface TagMusicMapper {
	public void addMusicTag(Map<String,Object> map) throws Exception;
	public List<String> getTagsByNo(Integer fileNo) throws Exception;
	public List<Integer> getMusicTags(Map<String,Object> map) throws Exception;
	public void deleteMusicTag(int fileNo) throws Exception;
}
