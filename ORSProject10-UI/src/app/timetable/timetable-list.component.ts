import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../base-list.component';

@Component({
  selector: 'app-timetable-list',
  templateUrl: './timetable-list.component.html',
  styleUrls: ['./timetable.component.css']
})
export class TimetableListComponent  extends BaseListCtl {


   public form = {

    error: false, //error 
    message: null, //error or success message
    preload: [], // preload data
    data: { id: null}, //form data
    inputerror: {}, // form input error messages
    searchParams: {}, //search form
    searchMessage: null, //search result message
    list: [ ], // search list 
    pageNo: 0
  };
  
  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super( locator.endpoints.TIMETABLE, locator, route);
    let ppSize= 0;
  }
  
}