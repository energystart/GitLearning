package com.yywu.simple.delaySynData;

import java.util.concurrent.atomic.AtomicBoolean;

public class SynDataToDisk {

	protected final AtomicBoolean synData = new AtomicBoolean(false);
	private int synNum = 0;
	public boolean synData(int value){
		if(!synData.get() && synData.compareAndSet(false, true)){
		}else{
			return false;
		}
		synNum++;
		System.out.println("\tSynDataToDisk:"+ value+"\tsynNum:"+synNum);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synData.compareAndSet(true, false);
		return true;
	}
}
