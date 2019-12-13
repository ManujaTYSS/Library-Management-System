import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { RouterModule} from '@angular/router';

import { AppComponent } from './app.component';
import { RequirmentformComponent } from './requirmentform/requirmentform.component';
import { HomeComponent } from './home/home.component';
import { UpdateRequirmentComponent } from './update-requirment/update-requirment.component';
import { UpdateComponent } from './update/update.component';
import { CandidateCreationComponent } from './candidate-creation/candidate-creation.component';
import { GetCandidateComponent } from './get-candidate/get-candidate.component';

@NgModule({
  declarations: [
    AppComponent,
    RequirmentformComponent,
    HomeComponent,
    UpdateRequirmentComponent,
    UpdateComponent,
    CandidateCreationComponent,
    GetCandidateComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : "", component:HomeComponent},
      {path : "form",component: RequirmentformComponent},
      {path : "update", component: UpdateRequirmentComponent},
      {path : "updateform", component: UpdateComponent},
      {path : "candidateCreation", component: CandidateCreationComponent},
      {path : "getCandidate", component: GetCandidateComponent}
      
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
