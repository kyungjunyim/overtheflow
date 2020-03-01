package com.overtheflow.vo;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MusicVO {
	private Integer fileNo;
	private Integer genreNo;
	private String musicTitle;
	private String musicIntro;
	private Date musicRegdate;
	private Long musicPlaytime;
	private Integer musicPlayCnt;
	private Integer musicLikeCnt;
	private Integer memberNo;
}
