package main;

import util.Filter;


public class FilterByGpa implements Filter{

	@Override
	public boolean check(data.Student x) {
		// TODO Auto-generated method stub
		return x.getGpa() >= 8;
	}

}
