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
public class PlayListVO {
	private Integer playListNo;
	private String playListTitle;
	private Integer memberNo;
	private String playListIntro;
	private Date playListRegDate;
	private List<String> playListTags;
	private Integer playListLikeCnt;
	private Integer trackListCnt;
}
