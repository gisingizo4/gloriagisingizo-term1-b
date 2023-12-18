package rca.ac.calculator.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rca.ac.calculator.dtos.DoMathRequest;
import rca.ac.calculator.exceptions.InvalidOperationException;
import rca.ac.calculator.payload.ApiResponse;
import rca.ac.calculator.services.impl.MathOperatorImpl;

@RestController
@RequestMapping("/api/doMath")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public MathController(MathOperatorImpl mathOperatorImpl) {
        this.mathOperatorImpl = mathOperatorImpl;
    }

    @PostMapping
    public ResponseEntity<ApiResponse> create(@RequestBody DoMathRequest dto) throws InvalidOperationException {
        return ResponseEntity.ok(ApiResponse.success(mathOperatorImpl.doMath(dto.getOperand1(), dto.getOperand2(), dto.getOperation())));
    }
}


