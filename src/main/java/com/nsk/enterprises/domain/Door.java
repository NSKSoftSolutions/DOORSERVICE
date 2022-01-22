package com.nsk.enterprises.domain;

public class Door {

	private long doorId;
	private String doorSize;
	private String doorType;

	public long getDoorId() {
		return doorId;
	}

	public void setDoorId(long doorId) {
		this.doorId = doorId;
	}

	public String getDoorSize() {
		return doorSize;
	}

	public void setDoorSize(String doorSize) {
		this.doorSize = doorSize;
	}

	public String getDoorType() {
		return doorType;
	}

	public void setDoorType(String doorType) {
		this.doorType = doorType;
	}

	public Door() {
		// TODO Auto-generated constructor stub
	}

	public Door(long doorId, String doorSize, String doorType) {
		super();
		this.doorId = doorId;
		this.doorSize = doorSize;
		this.doorType = doorType;
	}

	@Override
	public String toString() {
		return "Door [doorId=" + doorId + ", doorSize=" + doorSize + ", doorType=" + doorType + "]";
	}

}
