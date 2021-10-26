package API.ControleDePonto.service;

import API.ControleDePonto.model.WorkingDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import API.ControleDePonto.repository.WorkingDayRepository;
import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {

    WorkingDayRepository workingDayRepository;

    @Autowired
    public WorkingDayService(WorkingDayRepository workDayRepository) {
        this.workingDayRepository = workDayRepository;
    }

    //Method for saving and updating data in the database
    public WorkingDay save(WorkingDay workingDay) {
        return workingDayRepository.save(workingDay);
    }

    //Method for fetch everyone in the database
    public List<WorkingDay> findAll() {
        return workingDayRepository.findAll();
    }

    //Method to search the database by id
    public Optional<WorkingDay> getById(Long idWorkingDay) {
        return workingDayRepository.findById(idWorkingDay);
    }
}
