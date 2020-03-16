package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface TagPlaylistMapper {
	public void addTagPlaylist(Map<String, Object> map);

	public void addTagsPlaylist(Map<String, Object> map);

	public void deleteTagPlaylist(int playlistNo);

	public String[] getTagPlaylist(int playlistNo);

	public List<Integer> searchTagPlaylist(String key);
}
