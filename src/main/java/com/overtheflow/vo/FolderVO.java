package com.overtheflow.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class FolderVO {
	private Integer folderNo;
	private String folderName;
	private Integer superFolderNo;
	private Integer memberNo;
	private Long folderSize;
	private Integer subFileCnt;
}
