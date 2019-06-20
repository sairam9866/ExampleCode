package example.db.poc.controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.db.poc.model.Record;
import example.db.poc.repository.RecordRepository;
import example.db.poc.service.RecordService;

@RestController
@RequestMapping("/request")
public class RecordController {

	@Autowired
	private RecordRepository recordRepository;

	// @Autowired

//	@GetMapping(value="/getAll")
//	public List<Record> getRecord(){
//			return recordService.getAllRecord();
//	}

	@PostMapping("/saveData")
	public List<Record> saveAll() {
		List<Record> list = new ArrayList<Record>();
		FileInputStream fstream;
		try {
			fstream = new FileInputStream("C:\\Users\\dacha.sankeerth\\Desktop\\Sample.txt");

			// Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			RecordService bs = new RecordService();
			bs.saveDest(br, recordRepository);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@PostMapping("/save")
	public String saverecord(@RequestBody Record record) {
		recordRepository.save(record);
		return "record saved successfully";
	}

}
