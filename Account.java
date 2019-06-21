public class Account {
	private String name;
    private int accNumber;
    private int balance;

    public Account(String name, int accNo, int balance) {
    this.setName(name);	
      this.setAccNumber(accNo);
      this.balance = balance;
    }

	 Account() {
		// TODO Auto-generated constructor stub
		this.name = null;
		this.accNumber = -1;
		this.balance = 0;
	}

	 
	 public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

    public int depositMoney(int depositamount) {
    	if(depositamount>=0) {
    	balance += depositamount;
    	}
    	       return balance;
    }

    public int withdrawMoney(int withdrawamount) {
    	if(withdrawamount>=0) {
    	   balance -= withdrawamount;

    	}
        return balance;
    }

}