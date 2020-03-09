package com.overtheflow.vo;
import java.util.Date;
import java.util.List;

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
	private Date musicRegDate;
	private Long musicPlayTime;
	private Integer musicPlayCnt;
	private Integer musicLikeCnt;
	private Integer memberNo;
	private String memberNickName;
	private List<String> musicTags;
}
