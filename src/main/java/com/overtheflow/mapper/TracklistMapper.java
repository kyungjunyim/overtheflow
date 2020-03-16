package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;
/**
@author 이진구
6차 수정 : 김지우/ xml과 시그니처 맞춤
7차 수정 : 김지우 tracklist musicno로 삭제 메소드 추가 */
public interface TracklistMapper {

	/**
	 * @author 김지우
	 * @param map
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public void addTrack(Map<String,Object> map) throws Exception;
	
	/**
	 * @author 김지우
	 * @param map
	 * @throws Exception
	 * 트랙을 여러개 받아 한번에 넣는 메소드.
	 */
	public void addTracklist(Map<String,Object> map) throws Exception;

	
	/**
	 * @author 김지우
	 * @param playlistNo
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public void clearTracklist(Integer playlistNo)throws Exception;
	
	/**
	 * @author 김지우
	 * @param map
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public void deleteTrack(Map<String,Object> map) throws Exception;
	
	/**
	 * @author 김지우
	 * @param map
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public void deleteTracklist(Map<String,Object> map) throws Exception;
	
	/**
	 * @author 김지우
	 * @param musicNo
	 * @throws Exception
	 * 7차 수정 : 시그니처 변경 및 새로 생성
	 */
	public void deleteTrackBymusicNo(Integer musicNo)throws Exception;
	public void deleteTrackOnPublic(Integer fileNo, Integer memberNo) throws Exception;
	/**
	 * @author 김지우
	 * @param map
	 * @return
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public Integer getTrack(Map<String,Object> map) throws Exception;
	
	/**
	 * @author 김지우
	 * @param playlistNo
	 * @return
	 * @throws Exception
	 * 6차 수정 : 시그니처 변경 및 새로 생성
	 */
	public List<Integer> getTracklist(Integer playlistNo)throws Exception;
	
	/**
	 * @author 김지우
	 * @param playlistNo
	 * @return
	 * @throws Exception
	 * 7차 수정 : max trackOrder를 가져오는 메소드
	 */
	public Integer getMaxTrackOrder(Integer playlistNo)throws Exception;
	
}
