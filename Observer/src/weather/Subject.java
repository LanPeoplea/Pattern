package weather;


import java.util.ArrayList;
import java.util.List;

abstract class Subject {
	private List<Observer> observers=new ArrayList<Observer>();
	//增加观察者
	public void attach(Observer observer){
		observers.add(observer);	
	} 	
	//移除观察者
	public void detach(Observer observer){
		observers.remove(observer);
	}
	//通知
	public void Notify(){
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update();
		}
	}
}