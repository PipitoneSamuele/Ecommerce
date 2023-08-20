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
      {"title":"titolo1", "description":"descrizione1", "price":1, "imageUrl":"https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png"},
      {"title":"titolo2", "description":"descrizione2", "price":2, "imageUrl":"https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png"},
      {"title":"titolo3", "description":"descrizione3", "price":3, "imageUrl":"https://cdn.pixabay.com/photo/2016/05/31/12/42/red-button-1426817_960_720.png"},
      
    ];
  }

}
