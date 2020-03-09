package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.PlayListVO;
public interface PlaylistMapper {
	public void addPlaylist(PlayListVO playlistVO)throws Exception;
	public void modifyPlaylist(PlayListVO playlistVO)throws Exception;
	public void deletePlaylist(int playlistNo)throws Exception;
	public PlayListVO getPlaylist(int playlistNo)throws Exception;
	public List<PlayListVO> getAllPlaylist()throws Exception;
	public List<PlayListVO> searchPlaylist(Map<String, Object> map)throws Exception;
}
