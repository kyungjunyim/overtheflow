package com.overtheflow.mapper;

import com.overtheflow.vo.MusicVO;

public interface MusicMapper {
	public void addMusic(MusicVO music);

	public void addPlayCount(Integer fileNo);

	public void modifyMusic(MusicVO music);

	public void deleteMusic(int fileNo);

	public void deletePlayCount(int fileNo);

	public void increasePlayCount(int fileNo);
}
