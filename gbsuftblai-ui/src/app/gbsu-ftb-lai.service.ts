import { Inject, Injectable, InjectionToken, Injector } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GbsuFtbLaiService {
  
  private _GbsuFtbLaiPath = "gbsu-ftb-lai";
  nbr : number =0 
  constructor(private _httpClient: HttpClient, @Inject('SERVER_URL') public _REST_API_SERVER: String) { }

  public sendGetRequest(inputNumber: number){

    const url = `${this._REST_API_SERVER}/${this._GbsuFtbLaiPath}/${inputNumber}`;
    return this._httpClient.get(url);
  }

}
