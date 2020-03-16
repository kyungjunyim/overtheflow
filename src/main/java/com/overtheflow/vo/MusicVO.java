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
public class MusicVO {
	private Integer fileNo;
	private Integer genreNo;
	private String genreName;
	private String musicTitle;
	private String musicIntro;
	private Date musicRegdate;
	private Long musicPlaytime;
	private Integer musicPlayCnt;
	private Integer musicLikeCnt;
	private Integer memberNo;
	private String memberNickname;
	private String[] tags;
	public boolean equalsMember(Integer memberNo) {
		if(memberNo == null) {return false;}
		if(memberNo.equals(this.memberNo)) {
			return true;
		}
		return false;
	}
}
