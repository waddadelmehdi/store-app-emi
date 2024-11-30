import {Component, OnInit} from '@angular/core';
import {Command} from '../model/command.model';
import {CommandService} from '../services/command.service';
import {CurrencyPipe, NgForOf} from '@angular/common';

@Component({
  selector: 'app-command-list',
  templateUrl: './command-list.component.html',
  standalone: true,
  imports: [
    CurrencyPipe,
    NgForOf
  ],
  styleUrl: './command-list.component.css'
})
export class CommandListComponent implements OnInit{
  commands:Command[]=[];

  constructor(private commandService:CommandService) {
  }

  ngOnInit(): void {
    this.commandService.getCommands().subscribe(data=>{
      this.commands=data
    });
  }


  protected readonly name = name;
}
