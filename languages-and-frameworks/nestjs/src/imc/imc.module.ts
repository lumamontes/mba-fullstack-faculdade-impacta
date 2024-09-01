import { Module } from '@nestjs/common';
import { ImcCalculatorController } from './imc.controller';
import { ImcCalculatorService } from './imc.service';

@Module({
  imports: [],
  controllers: [ImcCalculatorController],
  providers: [ImcCalculatorService],
})
export class ImcModule {}
