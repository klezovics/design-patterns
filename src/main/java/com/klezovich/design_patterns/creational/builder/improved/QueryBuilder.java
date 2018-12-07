package com.klezovich.design_patterns.creational.builder.improved;

public interface QueryBuilder {

	void from(String from);
	
	void where(String where);
	
	Query getQuery();
	
}
