import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-aircraft-status',
  templateUrl: './aircraft-status.component.html',
  styleUrls: ['./aircraft-status.component.css']
})
export class AircraftStatusComponent implements OnInit {

  aircraftData: any;

  constructor(private http: HttpClient) { }

  ngOnInit(): void {
    this.getAircraftStatus();
  }

  getAircraftStatus() {
    this.http.get('http://localhost:8080/api/aircraft/status')
      .subscribe(data => {
        this.aircraftData = data;
      });
  }
}
