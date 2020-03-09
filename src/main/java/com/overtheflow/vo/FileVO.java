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
public class FileVO {
	private Integer fileNo;
	private String fileName;
	private String fileExtension;
	private Date fileUploadDate;
	private Long fileSize;
	private Integer folderNo;
	private Integer memberNo;
	private String memberNickName;
}
