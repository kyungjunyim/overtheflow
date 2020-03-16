package com.overtheflow.mapper;

import java.util.List;

import com.overtheflow.vo.FolderVO;

public interface FolderMapper {
	public void addFolder(FolderVO folder);
	public void modifyFolder(FolderVO folder);
	public FolderVO getFolderByNo(int folderNo);
	public List<FolderVO> getAll();
	public int getMaxNo();
	public void deleteFolder(int folderNo);
	public void clear();
}
