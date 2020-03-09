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
public class MemberVO {
	private Integer memberNo;
	private String memberId;
	private String memberPwd;
	private String memberNickName;
	private String memberName;
	private String memberEmail;
	private String memberIntro;
	private Date memberRegDate;
}
