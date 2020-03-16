package com.overtheflow.mapper;
import java.util.List;
import java.util.Map;

import com.overtheflow.vo.FileVO;

public interface FileMapper {
	public void addFile(FileVO file) throws Exception;
	public void modifyFile(FileVO file) throws Exception;
	public void modifyFiles(Integer[] fileNos, Integer fileNo) throws Exception;
	public void deleteFile(int fileNo) throws Exception;
	public void deleteFiles(Map<String, Object> map) throws Exception;
	public FileVO getFileInfo(int fileNo) throws Exception;
	public List<FileVO> getFileInfos(Map<String, Object> map) throws Exception;
	public List<FileVO> getAll() throws Exception;
	public List<FileVO> getFileInfosByMember(int memberNo);
	public List<FileVO> getFileInfosByFolder(int folderNo);
	public int getMaxNo();
}
