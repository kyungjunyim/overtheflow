package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface TrackListMapper {
	public void addTrack(Map<String,Object> map) throws Exception;
	public void addTrackList(Map<String,Object> map) throws Exception;
	public void clearTrackList(Integer playListNo)throws Exception;
	public void deleteTrack(Map<String,Object> map) throws Exception;
	public void deleteTrackList(Map<String,Object> map) throws Exception;
	public void deleteTrackBymusicNo(Integer musicNo)throws Exception;
	public void deleteTrackOnPublic(Integer fileNo, Integer memberNo) throws Exception;
	public Integer getTrack(Map<String,Object> map) throws Exception;
	public List<Integer> getTrackList(Integer playListNo)throws Exception;
	public Integer getMaxTrackOrder(Integer playListNo)throws Exception;
}
