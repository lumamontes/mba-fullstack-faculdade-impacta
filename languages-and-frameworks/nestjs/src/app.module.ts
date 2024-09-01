import { Module } from '@nestjs/common';
import { AppController } from './app.controller';
import { AppService } from './app.service';
import { ImcModule } from './imc/imc.module';

@Module({
  imports: [ImcModule],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
