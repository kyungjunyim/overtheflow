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
public class PlayListVO {
	private Integer playListNo;
	private String playListTitle;
	private Integer memberNo;
	private String playListIntro;
	private Date playListRegDate;
}
