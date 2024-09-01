import { Injectable } from "@nestjs/common";
import { ImcCalculatorRequest } from "./interfaces/imc.calculator.request";
import { imcCalculatorResponse } from "./interfaces/imc.calculator.response";

@Injectable()
export class ImcCalculatorService {
  getTable() {
    return {
      "magreza": "0 a 18.5",
      "normal": "18.5 a 24.9",
      "sobrepeso": "24.9 a 30",
      "obesidade": "30 a 40",
    };
  }

  getImc(imc: number): string {
    if (imc < 18.5) {
      return "magreza";
    } else if (imc < 24.9) {
      return "normal";
    } else if (imc < 30) {
      return "sobrepeso";
    } else {
      return "obesidade";
    }
  }

  calculate(imcCalcRequest: ImcCalculatorRequest): imcCalculatorResponse {
    const imc = imcCalcRequest.weight / (imcCalcRequest.height * imcCalcRequest.height);
    const imcDescription = this.getImc(imc);

    return {
      imc,
      height: imcCalcRequest.height,
      weight: imcCalcRequest.weight,
      imcDescription,
    };
  }
}