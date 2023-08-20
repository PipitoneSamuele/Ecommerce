import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.sass']
})
export class ProductComponent implements OnInit {

  @Input() title: string;
  @Input() description: string;
  @Input() price: any;
  @Input() imageUrl: string;

  constructor() { }

  ngOnInit(): void {
  }

}
