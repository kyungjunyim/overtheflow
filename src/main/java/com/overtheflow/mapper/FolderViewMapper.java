package com.overtheflow.mapper;

import java.util.List;

import java.util.Map;

import com.overtheflow.vo.FolderVO;
public interface FolderViewMapper {
	public FolderVO getFolderView(Integer folderNo) throws Exception;
	public List<FolderVO> getAllFolderView() throws Exception;
	public List<FolderVO> searchFolderView(Map<String, Object> map) throws Exception;
	public List<FolderVO> getFoldersOnPage(Map<String,Object> map) throws Exception;
	public Integer getMaxNo() throws Exception;
}
