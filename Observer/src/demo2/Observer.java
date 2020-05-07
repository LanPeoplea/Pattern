package demo2;

//抽象观察者
//为所有具体的观察者定义一个接口，在得到主题的通知时更新自己
//更新接口
abstract class Observer{
  public abstract void Updata();
}
 