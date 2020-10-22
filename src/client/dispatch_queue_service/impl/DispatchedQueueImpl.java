package client.dispatch_queue_service.impl;

import java.util.LinkedList;
import java.util.Queue;

import client.dispatch_queue_service.DispatchedQueue;
import client.dispatch_queue_service.Model;

class DispatchedQueueImpl implements DispatchedQueue{
	//synchronized 체크 
	private final Queue<Model> queue = new LinkedList<>();
	
	@Override
	synchronized public void add(Model model) {
		queue.add(model);
		this.notify();
	}

	@Override
	synchronized public Model poll() {
		return queue.poll();
	}

	@Override
	public boolean isEmpty() {
		if(queue.isEmpty())
			return true;
		return false;
	}
	
}