class argument{
	public static void main(String args[]){
		disp("[","]",10,7,9);
		disp("<",">",2,3);
	}

	private static void disp(String sb,String sa,int ...num){
		for(int i =0; i<num.length; i++){
			System.out.println(sb+num[i]+sa);
		} 
	
	}

}
