package com.geniedev.ScreenMatch;

import com.geniedev.ScreenMatch.Service.ApiConsumer;
import com.geniedev.ScreenMatch.Service.DataConvert;
import model.DataSeries;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;

@SpringBootApplication
public class ScreenMatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenMatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var apiConsumer = new ApiConsumer();

		var json = apiConsumer.fetchData("https://www.omdbapi.com/?t=The+sopranos&Season=1&episode=1&apikey=4214cebd");
		System.out.println(json);
		System.out.println();

		DataConvert convert = new DataConvert();
		var data = convert.obtainData(json, DataSeries.class);
		System.out.println(data);

	}
}
