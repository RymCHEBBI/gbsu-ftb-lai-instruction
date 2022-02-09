import { Component, EventEmitter, OnInit, Output} from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-gbsu-ftb-lai-form',
  templateUrl: './gbsu-ftb-lai-form.component.html'
})
export class GbsuFtbLaiFormComponent implements OnInit{

  InputForm: FormGroup;
  submitted = false;
  @Output() submitNumberOutput = new EventEmitter();
  inputNumber = new FormControl('');

  constructor(private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
      this.InputForm = this.formBuilder.group({
        inputNumber: ['', [Validators.required, Validators.minLength(1)]]
  });
  }

  submitNumber(): void {
    this.submitted = true;
    // Stop here if form is invalid
    if (this.InputForm.invalid) {
        return;
    }
    //Emit input number to parent component: GbsuFtbLaiComponent
    console.log(this.InputForm.value.inputNumber)
    this.submitNumberOutput.emit(this.InputForm.value.inputNumber);
  }

  get f() { return this.InputForm.controls; }

}
