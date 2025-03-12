package Capper.capper.controller;

import Capper.capper.service.SoccerPredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;




@RestController
public class CapperController {

    @Autowired
    private SoccerPredictionService soccerPredictionService;

    @GetMapping("/api/run-predictions")
    // public String runPredictions() {
     public Map<String, String> runPredictions() {
        // For now, just return a simple message to test if the endpoint is connected
        // You can remove the soccerPredictionService call for this test
         return Map.of("message", "Soccer Backend connected!");
    }
}






// // DTO class for the request data
// class PayrollRequest {
//     private String employeeName;
//     private double salary;
//
//     // Getters and Setters
//     public String getEmployeeName() {
//         return employeeName;
//     }
//
//     public void setEmployeeName(String employeeName) {
//         this.employeeName = employeeName;
//     }
//
//     public double getSalary() {
//         return salary;
//     }
//
//     public void setSalary(double salary) {
//         this.salary = salary;
//     }
// }
//
// @RestController
// public class CapperController {
//
//     @PostMapping("/api/payroll")
//     public ResponseEntity<String> createPayroll(@RequestBody PayrollRequest request) {
//         // Save payroll data to database (use service class to handle logic)
//         return ResponseEntity.status(HttpStatus.CREATED)
//                              .body("Payroll created for " + request.getEmployeeName());
//     }
// }




