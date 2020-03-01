package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

public interface LikeMusicMapper {
	public void addLikeMusic(Map<String,Object> map) throws Exception;
	public void deleteLikeMusic(Map<String,Object> map) throws Exception;
	public void deleteLikesByMusicNo(Integer fileNo)throws Exception;
	public Integer isLike(Map<String,Object> map) throws Exception;
	public List<Integer> getLikeMusicsByNo(Map<String,Object> map) throws Exception;
	public List<Integer> getLikeMusics() throws Exception;
	public List<Integer> getLikeMusics(Map<String,Object> map) throws Exception;
}
