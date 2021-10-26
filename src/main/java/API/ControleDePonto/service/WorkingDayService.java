package API.ControleDePonto.service;

import API.ControleDePonto.model.WorkingDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import API.ControleDePonto.repository.WorkingDayRepository;
import java.util.List;

@Service
public class WorkingDayService {

    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workDayRepository) {
        this.workingDayRepository = workDayRepository;
    }

    //Method for saving data to the database
    public WorkingDay save(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }

    //Method for fetch everyone in the database
    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }
}
