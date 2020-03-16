package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface LikePlaylistMapper {
	public void addLikePlaylist(Map<String, Object> map);

	public void deleteLikePlaylist(Map<String, Object> map);

	public Integer getLikePlaylist(Map<String, Object> map);

	public List<Integer> getAllLikePlaylist(Integer memberNo);

	public void deleteLikePlaylistByNo(Integer playlistNo);
}
