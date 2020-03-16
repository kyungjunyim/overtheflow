package com.overtheflow.vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistVO {
	private Integer playlistNo;
	private String playlistTitle;
	private Integer memberNo;
	private String memberNickname;
	private String playlistIntro;
	private Date playlistRegDate;
	private String[] playlistTags;
	private Integer playlistLikeCnt;
	private Integer tracklistCnt;
	public boolean equalsMember(int memberNo) {
		if(this.memberNo==memberNo)
			return true;
		else
			return false;
	}
}
