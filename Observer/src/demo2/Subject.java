package demo2;

import java.util.ArrayList;
import java.util.List;
//主题或抽象通知者 一般用一个抽象类或者一个接口实现
//他把所有对观察者的引用保持在集合中，每个主题可以有任何数量的观察者
//提供一个接口 ，可以添加和删除观察者
abstract class Subject{
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
			observers.get(i).Updata();
		}
	}
}