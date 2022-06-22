package at.technikum.measurementsconverter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeasurementsConverterController {
    @RequestMapping("/gram")
    public double ounce_to_gram(@RequestParam double ounce){
        double gram = ounce * 28.35;
        return gram;
    }
    @RequestMapping("/kilogram")
    public double stone_to_kilogram(@RequestParam double stone){
        double kilogram = stone * 6.35;
        return kilogram;
    }
}
