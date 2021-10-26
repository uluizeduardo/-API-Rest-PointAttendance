package API.ControleDePonto.controller;

import API.ControleDePonto.model.WorkingDay;
import API.ControleDePonto.service.WorkingDayService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journey")
public class WorkingDayController {

    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.save(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList() {
        return workingDayService.findAll();
    }
}
