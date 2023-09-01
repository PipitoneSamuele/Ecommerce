import { Component, OnChanges, OnInit, SimpleChanges } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.sass']
})
export class ProductsComponent implements OnInit, OnChanges {

  products: any;
  counter: number;

  constructor(private httpClient: HttpClient) { }


  ngOnChanges(): void {
    this.counter = this.counter + 1;
    console.log(this.counter);
  }

  ngOnInit(): void {
    this.httpClient.get<any>("http://localhost:8080/products").subscribe(data => {
      this.products = data;
    });
  }
 

}
