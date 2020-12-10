import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class VerpakkingService {

  constructor(private http: HttpClient) {
  }

  getVerpakkingen() {
    return this.http.get('http://localhost:8080/verpakkingen');
  }
}
