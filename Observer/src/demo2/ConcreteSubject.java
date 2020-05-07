package demo2;

//具体目标类
//将有关状态存入具体的观察者对象中。
class ConcreteSubject extends Subject{
	//观察者状态
	private String subjectState;
 
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}	
	
}