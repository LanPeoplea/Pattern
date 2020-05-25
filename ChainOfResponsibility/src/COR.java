public class COR {
	public static void main(String[] args) {
		//组装责任链
		Governor department = new Department();
		Governor manager = new Manager();
		Governor accounter = new Accounter();
		Governor cfo = new CFO();

		department.setNext(manager);
		manager.setNext(accounter);
		accounter.setNext(cfo);
		//提交请求
		department.handleRequest(600);
		department.handleRequest(3000);
	}
}

//抽象处理者：领导类
abstract class Governor{
	private Governor next;
	public void setNext(Governor next){
		this.next = next;
	}
	public Governor getNext(){
		return next;
	}
	//处理请求的方法
	public abstract void handleRequest(int LeaveDays);
}

//具体处理者1：部门经理类
class Department extends Governor {
	public void handleRequest(int payments){
		if(payments<=500)
		{
			System.out.println("部门经理已经报销金额" + payments + "元。");
		}else{
			if(getNext() != null)
			{
				getNext().handleRequest(payments);
			}else{
				System.out.println("金额太多，没有人可以报销该金额!");
			}
		}
	}
}

//具体处理者2：总经理类
class Manager extends Governor {
	public void handleRequest(int payments){
		if(payments<=1000)
		{
			System.out.println("总经理已经报销金额" + payments + "元。");
		}else{
			if(getNext() != null)
			{
				getNext().handleRequest(payments);
			}else{
				System.out.println("金额太多，没有人可以报销该金额!");
			}
		}
	}
}

//具体处理者3：会计类
class Accounter extends Governor {
	public void handleRequest(int payments){
		if(payments<=1500)
		{
			System.out.println("会计部门已经报销金额" + payments + "元。");
		}else{
			if(getNext() != null)
			{
				getNext().handleRequest(payments);
			}else{
				System.out.println("请假天数太多，没有人批准该假条！");
			}
		}
	}
}

//具体处理者4：CFO类
class CFO extends Governor {
	public void handleRequest(int payments){
		if(payments<=2000)
		{
			System.out.println("财务官已经报销金额" + payments + "元。");
		}else{
			if(getNext() != null)
			{
				getNext().handleRequest(payments);
			}else{
				System.out.println("金额太多，没有人可以报销该金额!");
			}
		}
	}
}