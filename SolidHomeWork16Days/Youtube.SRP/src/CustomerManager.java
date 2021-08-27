
public class CustomerManager {
	
	 void TransactionalOperation()
	{
		
		Update();
		Insert();
	}
	 
	 
		void Insert()
		{
			MyContext context=new MyContext();
			context.Update();
			
		}
		
		void Update()
		{
			MyContext context=new MyContext();
			context.Update();
			
		}

}
