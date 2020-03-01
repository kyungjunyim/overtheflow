package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.PlayListVO;

public interface PlayListMapper {
	public void addPlayList(PlayListVO playlistVO)throws Exception;
	public void modifyPlayList(PlayListVO playlistVO)throws Exception;
	public void deletePlayList(Integer playlistNo)throws Exception;
	public PlayListVO getPlayList(Integer playlistNo)throws Exception;
	public List<PlayListVO> getPlayLists()throws Exception;
	public List<PlayListVO> getPlayLists(Map<String, Object> map) throws Exception;
	public List<PlayListVO> getPlaylistsByNo(Map<String,Object> map) throws Exception;
	public String[] getTagsByPlayListNo(Integer playListNo) throws Exception;
	public int getMaxNo() throws Exception;
	public Integer getTotalCount(Map<String, Object> map) throws Exception;
}
