package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/example")
public class ExampleResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public List<ExampleData> getData() {
	    List<ExampleData> dataList = new ArrayList<>();
	    ExampleData data1 = new ExampleData();
	    data1.id = 0;
	    data1.name = "selenium";
	    dataList.add(data1);
	    ExampleData data2 = new ExampleData();
	    data2.id = 1;
	    data2.name = "chrome";
	    dataList.add(data2);
	    return dataList;
	  }

  class ExampleData {
    int id;
    String name;
  }
}
