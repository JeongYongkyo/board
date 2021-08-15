package com.java.common.domain;

public class BoardVO {
	private String idx;
	private String parentIdx;
	private String title;
	private String contents;
	private String hitCnt;
	private String createDtm;
	private String createId;
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getParentIdx() {
		return parentIdx;
	}
	public void setParentIdx(String parentIdx) {
		this.parentIdx = parentIdx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getHitCnt() {
		return hitCnt;
	}
	public void setHitCnt(String hitCnt) {
		this.hitCnt = hitCnt;
	}
	public String getCreateDtm() {
		return createDtm;
	}
	public void setCreateDtm(String createDtm) {
		this.createDtm = createDtm;
	}
	public String getCreateId() {
		return createId;
	}
	public void setCreateId(String createId) {
		this.createId = createId;
	}
	
}

