import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.sass']
})
export class ProductsComponent implements OnInit {

  products: any;

  constructor() { }

  ngOnInit(): void {
    this.products = [
      {"title":"titolo1", "description":"descrizione1", "price":1},
      {"title":"titolo2", "description":"descrizione2", "price":2},
      {"title":"titolo3", "description":"descrizione3", "price":3},
    ];
  }

}
