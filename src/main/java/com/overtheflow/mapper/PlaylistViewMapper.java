package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.PlayListVO;
public interface PlaylistViewMapper {
	public PlayListVO getPlaylist(int playlistNo) throws Exception;
	public List<PlayListVO> getPlaylists(Map<String,Object> map) throws Exception;
	public List<PlayListVO> getAll() throws Exception;
	public String[] getTagsByPlaylistNo(int playlistNo) throws Exception;
	public int getMaxNo() throws Exception;
	public List<PlayListVO> getPlaylistsByNos(Map<String,Object> map) throws Exception;
	public Integer getTotalCount(Map<String, Object> map) throws Exception;
}
