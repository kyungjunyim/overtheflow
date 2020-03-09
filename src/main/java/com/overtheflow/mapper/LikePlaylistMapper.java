package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
public interface LikePlaylistMapper {
	public void addLikePlaylist(Map<String, Object> map) throws Exception;
	public void deleteLikePlaylist(Map<String, Object> map) throws Exception;
	public Integer getLikePlaylist(Map<String, Object> map)throws Exception;
	public List<Integer> getAllLikePlaylist(Integer memberNo)throws Exception;
	public void deleteLikePlaylistByNo(Integer playlistNo)throws Exception;
	
}
