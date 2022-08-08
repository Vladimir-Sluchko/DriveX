package com.DriveX.user_security.controller;

import com.DriveX.user_security.service.api.IAdminService;
import com.DriveX.user_security.service.dto.CreatUserDto;
import com.DriveX.user_security.service.dto.PageDto;
import com.DriveX.user_security.service.dto.UserReadDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class AdminController {
    private final IAdminService service;

    public AdminController(IAdminService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CreatUserDto> create (@RequestBody CreatUserDto dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<PageDto> getPage (@RequestParam(name = "page",defaultValue = "1") int page,
                                            @RequestParam(name = "size", defaultValue = "20") int size){
        return ResponseEntity.ok(service.getAll(page,size));
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<UserReadDto> getUser(@PathVariable UUID uuid){
        return ResponseEntity.ok(service.get(uuid));
    }

    @PutMapping("{uuid}/dt_update/{dt_update}")
    public ResponseEntity<CreatUserDto> update (@RequestBody CreatUserDto dto,
                                                @PathVariable UUID uuid,
                                                @PathVariable(name = "dt_update") Long dtUpdate){
        return ResponseEntity.ok(service.update(dto,uuid,dtUpdate));
    }

}
