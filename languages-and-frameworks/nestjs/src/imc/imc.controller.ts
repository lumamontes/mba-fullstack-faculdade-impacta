import { Body, Controller, Get, Post } from "@nestjs/common";
import { ImcCalculatorService } from "./imc.service";
import { ImcCalculatorRequest } from "./interfaces/imc.calculator.request";

@Controller("imc")
export class ImcCalculatorController {
  constructor(private readonly imcCalculatorService: ImcCalculatorService) {}

  @Get("table")
  getHello(): object {
    return this.imcCalculatorService.getTable()
  }

  @Post("calculate")
  postCalculate(@Body() imcCalcRequest : ImcCalculatorRequest): object {
    return this.imcCalculatorService.calculate(imcCalcRequest);
  }

}