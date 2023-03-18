package DI;

public class Worker {

public void work() {
	//;..working
}

class Manager{
	Worker worker;
	public void setWirker(Worker w) {
		worker=w;
	}
	public void manage() {
		worker.work();
		
	}
}

class superWorker{
	public void work()
	{
		//.. working much more
	}
}

}
