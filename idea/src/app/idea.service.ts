import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class IdeaService {

  private REST_API_SERVER = "http://localhost:8080/home";
  constructor(private httpClient: HttpClient) {
  }

  public sendGetRequest() {
    return this.httpClient.get(this.REST_API_SERVER);
  }
}
