package com.yywu.simple.delaySynData;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class UpdateDataInMemory {

	private final AtomicInteger num = new AtomicInteger(0);
	protected final  AtomicBoolean needUpdate = new AtomicBoolean(false);
	private final SynDataToDisk synData = new SynDataToDisk();
	public void addOne(){
		
		int currentVal = num.incrementAndGet();
		if(!needUpdate.get()){
			needUpdate.compareAndSet(false, true);
		}
		if(!synData.synData.get()){
			new Thread(new Runnable() {
				public void run() {
					synData.synData(num.get());
				}
			}).start();
		}
	}
	public static void main(String[] args) throws InterruptedException {
		UpdateDataInMemory updateData = new UpdateDataInMemory();
		for(int i = 0; i < 1000000; i++){
			updateData.addOne();
			if(i%1000 == 0){
				Thread.sleep(30);
			}
		}
		
	}
}
