class test{
	public static void main (String args[]){

		String tensu[][] = {
			{"国語","78"},
			{"数学","90"},
			{"英語","68"}
		};
		
		for(int i = 0; i < tensu.length ; i++){
			System.out.println("点数は"+tensu[i][1]);
			check(tensu[i][0],Integer.parseInt(tensu[i][1]));
		}
	}

	public static void check(String kyoka, int seiseki){
		System.out.println(kyoka + "の試験結果は");
		if(seiseki > 80){
			System.out.println("合格です\n");
		}else{
			System.out.println("不合格です\n");
		}
	}		
}
