package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface LikeMusicMapper {
	public void addLikeMusic(Map<String,Object> map);
	public void deleteLikeMusic(Map<String,Object> map);
	public Integer isLike(Map<String,Object> map);
	public List<Integer> getLikeMusicsByNo(Map<String,Object> map);
	public List<Integer> getLikeMusics(Map<String,Object> map);
	public void deleteLikesByMusicNo(Integer fileNo);
	
}
