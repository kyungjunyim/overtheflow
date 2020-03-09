package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
public interface TracklistMapper {
	public void addTrack(Map<String,Object> map) throws Exception;
	public void addTracklist(Map<String,Object> map) throws Exception;
	public void clearTracklist(Integer playlistNo)throws Exception;
	public void deleteTrack(Map<String,Object> map) throws Exception;
	public void deleteTracklist(Map<String,Object> map) throws Exception;
	public void deleteTrackBymusicNo(Integer musicNo)throws Exception;
	public void deleteTrackOnPublic(Integer fileNo, Integer memberNo) throws Exception;
	public Integer getTrack(Map<String,Object> map) throws Exception;
	public List<Integer> getTracklist(Integer playlistNo)throws Exception;
	public Integer getMaxTrackOrder(Integer playlistNo)throws Exception;
}
