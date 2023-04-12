package nextstep.helloworld.mvc.mapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param-header")
public class ParamHeaderController {

    public ResponseEntity<String> message() {
        return ResponseEntity.ok().body("message");
    }

    @GetMapping(path="/message", params="name=hello")
    public ResponseEntity<String> messageForParam() {
        return ResponseEntity.ok().body("hello");
    }

    @GetMapping(path = "/message", headers = "HEADER=hi")
    public ResponseEntity<String> messageForHeader() {
        return ResponseEntity.ok().body("hi");
    }
}