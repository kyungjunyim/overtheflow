package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface TagPlaylistMapper {
	public void addTagPlayList(Map<String, Object> map)throws Exception;
	public void addTagsPlayList(Map<String,Object> map) throws Exception;
	public void deleteTagPlayList(Integer playListNo)throws Exception;
	public String[] getTagPlayList(Integer playListNo)throws Exception;
	public List<Integer> getTagPlaylist(String key)throws Exception;
}
