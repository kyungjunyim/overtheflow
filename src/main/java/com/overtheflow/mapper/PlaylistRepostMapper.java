package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
public interface PlaylistRepostMapper {
	public void addPlaylistRepost(Map<String, Object> map)throws Exception;
	public void deletePlaylistRepost(Map<String, Object> map)throws Exception;
	public Integer getPlaylistRepost(Map<String, Object> map)throws Exception;
	public List<Integer> getAllPlaylistRepost(Integer memberNo)throws Exception;
	public void deletePlaylistRepostByNo(Integer playlistNo)throws Exception;
}
