package kodlamaio.hrmsApp.core.utilities.results;


public class DataResult<T> extends Result {
	//T= generic herhangibir şey olabilir string int kullanılan şey belli değilse bu kullanılır
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data = data;
		// TODO Auto-generated constructor stub
	}
	public DataResult(T data, boolean success) {
		super(success);
		this.data = data; 
		
	}

	public T getData() {
		return this.data;
	}
	
	

}
