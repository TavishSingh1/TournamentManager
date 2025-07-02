package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PlayerService;

@RestController
@RequestMapping("/player")
public class PlayerController {
    private PlayerService playerService;


}
