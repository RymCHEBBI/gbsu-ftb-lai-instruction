import { Component} from '@angular/core';
import { GbsuFtbLaiService } from '../gbsu-ftb-lai.service';

@Component({
  selector: 'app-gbsu-ftb-lai',
  templateUrl: './gbsu-ftb-lai.component.html'
})
export class GbsuFtbLaiComponent {
  
  numberConvertedList : NumberConverted[] = [];
  isEmptyList: boolean = true;

  constructor(private gbsuFtbLaiService: GbsuFtbLaiService) { }

  convertNumber(inputNumber: number): void {

    if(this.numberConvertedList?.length){
      this.isEmptyList = false;
    }

    let result :  string;
    this.gbsuFtbLaiService.sendGetRequest(inputNumber).subscribe((data: any[])=>{
        
        const obj = JSON.parse(JSON.stringify(data));
        result = obj.result;
        
        let numberConverted : NumberConverted = {numberToConvert:inputNumber,result:result}
        this.numberConvertedList.push(numberConverted);
    })
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
