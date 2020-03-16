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
	private String memberNickname;
	private Boolean isImportanted;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fileNo == null) ? 0 : fileNo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FileVO other = (FileVO) obj;
		if (fileNo == null) {
			if (other.fileNo != null)
				return false;
		} else if (!fileNo.equals(other.fileNo))
			return false;
		return true;
	}
	public boolean equalsMemberNo(Integer memberNo) {
		if(this.memberNo == memberNo) {return true;}
		return false;
	}
}
