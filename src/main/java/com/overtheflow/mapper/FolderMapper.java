package com.overtheflow.mapper;

import java.util.List;

import com.overtheflow.vo.FolderVO;

public interface FolderMapper {
	public void addFolder(FolderVO folder);
	public void modifyFolder(FolderVO folder);
	public void deleteFolder(Integer folderNo);
	public FolderVO getFolderByNo(Integer folderNo);
	public List<FolderVO> getFolders();
	public int getMaxNo();
	public void clear();
}
