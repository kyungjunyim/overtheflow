package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
public interface TagPlaylistMapper {
	public void addTagPlaylist(Map<String, Object> map)throws Exception;
	public void addTagsPlaylist(Map<String,Object> map) throws Exception;
	public void deleteTagPlaylist(int playlistNo)throws Exception;
	public String[] getTagPlaylist(int playlistNo)throws Exception;
	public List<Integer> searchTagPlaylist(String key)throws Exception;
}
