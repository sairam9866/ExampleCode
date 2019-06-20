package example.db.poc.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import example.db.poc.model.Record;

public interface RecordRepository extends JpaRepository<Record,Integer> {


}