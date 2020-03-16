package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.PlaylistVO;

public interface PlaylistMapper {
	public void addPlaylist(PlaylistVO playlistVO);

	public void modifyPlaylist(PlaylistVO playlistVO);

	public void deletePlaylist(int playlistNo);

	public PlaylistVO getPlaylist(int playlistNo);

	public List<PlaylistVO> getAllPlaylist();

	public List<PlaylistVO> searchPlaylist(Map<String, Object> map);
}
