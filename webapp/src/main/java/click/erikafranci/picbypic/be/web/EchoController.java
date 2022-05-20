package click.erikafranci.picbypic.be.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @RequestMapping("/echo")
    public ResponseEntity<String> echo(){
        return ResponseEntity.ok("ok");
    }

}
