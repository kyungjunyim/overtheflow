package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface TagMusicMapper {
	public void addMusicTag(Map<String, Object> map);

	public List<String> getTagsByNo(Integer fileNo);

	public List<Integer> getMusicTags(Map<String, Object> map);

	public void deleteMusicTag(int fileNo);

}
