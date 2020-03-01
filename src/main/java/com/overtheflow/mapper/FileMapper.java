package com.overtheflow.mapper;
import java.util.List;
import java.util.Map;

import com.overtheflow.vo.FileVO;

public interface FileMapper {
	public void addFile(FileVO file) throws Exception;
	public void modifyFile(FileVO file) throws Exception;
	public void modifyFiles(Integer[] fileNos, Integer fileNo) throws Exception;
	public void deleteFile(Integer fileNo) throws Exception;
	public void deleteFiles(Map<String, Object> map) throws Exception;
	public FileVO getFile(Integer fileNo) throws Exception;
	public List<FileVO> getFiles() throws Exception;
	public List<FileVO> getFiles(Map<String, Object> map) throws Exception;
	public List<FileVO> getFilesByMember(Integer memberNo) throws Exception;
	public List<FileVO> getFilesByFolder(Integer folderNo) throws Exception;
	public List<FileVO> getFilesByNo(Integer[] fileNos) throws Exception;
	public List<FileVO> getFilesOnPage(Map<String, Object> map) throws Exception;
	public int getMaxNo() throws Exception;
	public int getSize() throws Exception;
}
