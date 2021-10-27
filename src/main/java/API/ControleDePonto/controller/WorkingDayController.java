package API.ControleDePonto.controller;

import API.ControleDePonto.model.WorkingDay;
import API.ControleDePonto.service.WorkingDayService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkingDayController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping(value = "/create")
    @ResponseBody
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.save(workingDay);
    }

    @GetMapping(value = "/listAll")
    @ResponseBody
    public List<WorkingDay> getWorkingDayList() {
        return workingDayService.findAll();
    }

    @GetMapping(value = "/searchById")
    @ResponseBody
    public ResponseEntity<WorkingDay> getWorkingDayById(@RequestParam(name = "idWorkingDay") Long idWorkingDay) throws Exception {
        return ResponseEntity.ok(workingDayService.getById(idWorkingDay).orElseThrow(() -> new Exception("WorkingDay not found")));
    }

    @PutMapping(value = "/update")
    @ResponseBody
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.save(workingDay);
    }

    @DeleteMapping(value = "/delete")
    @ResponseBody
    public ResponseEntity<?> deleteWorkingDayById(@RequestParam(name = "idWorkingDay") Long idworkingday) {
        try {
            workingDayService.deleteWorkingDay(idworkingday);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<WorkingDay>) ResponseEntity.ok();
    }
}
