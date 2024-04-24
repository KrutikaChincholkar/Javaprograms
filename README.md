# Javaprograms 
#code to find the in given string

	public static void main(String[] args) {
		String str = "enter the string ";
		int count = 0;
		int index = 0;
		while(true) {
			index = str.indexOf("the", index);
			if(index == -1)
				break;
			count++;
			index  = index + "the".length() ; // index  = index + 1; 
		}
		System.out.println(count);
	}
