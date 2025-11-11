import { Component, OnInit } from '@angular/core';
import { BaseCtl } from '../base.component';
import { ServiceLocatorService } from '../service-locator.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-staffmember',
  templateUrl: './staffmember.component.html',
  styleUrls: ['./staffmember.component.css']
})
export class StaffmemberComponent extends BaseCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    super(locator.endpoints.STAFF, locator, route);
  }

  validate() {
    return this.validateForm(this.form.data);
  }
  validateForm(form) {
    let flag = true;
    let validator = this.serviceLocator.dataValidator;
    flag = flag && validator.isNotNullObject(form.fullName);
    flag = flag && validator.isNotNullObject(form.joiningDate);
    flag = flag && validator.isNotNullObject(form.divison);
    flag = flag && validator.isNotNullObject(form.previousEmployer);
    return flag;
  }

  populateForm(form, data) {
    form.id = data.id;
    form.fullName = data.fullName;
    form.joiningDate = data.joiningDate;
    form.divison = data.divison;
    form.previousEmployer = data.previousEmployer;

  }


  parseDate(dateString: string): Date {
    if (dateString) {
      return new Date(dateString);
    }
    return null;
  }
  test() {

  }

}
