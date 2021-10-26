package API.ControleDePonto.service;

import API.ControleDePonto.model.WorkingDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import API.ControleDePonto.repository.WorkingDayRepository;

@Service
public class WorkingDayService {

    WorkingDayRepository workDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workDayRepository) {
        this.workDayRepository = workDayRepository;
    }
    
    //Method for saving data to the database
    public WorkingDay save(WorkingDay workingDay){
       return workDayRepository.save(workingDay);
    }
    
}
