package com.overtheflow.mapper;

import java.util.List;
import java.util.Map;

import com.overtheflow.vo.FileVO;

public interface FileViewMapper {

	public FileVO getFileByNo(int fileNo) throws Exception;
	public List<FileVO> getAll() throws Exception;
	public List<FileVO> getFiles(Map<String, Object> map) throws Exception;
	public List<FileVO> getFilesOnPage(Map<String, Object> map) throws Exception;
	public int getMaxNo() throws Exception;
	public int getSize() throws Exception;
	public List<FileVO> getFilesByNo(Integer[] fileNos) throws Exception;
}
