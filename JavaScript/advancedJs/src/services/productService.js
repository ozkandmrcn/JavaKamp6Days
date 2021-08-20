export default class ProductService {
    constructor() {
        this.products = [];
    }



    add(product) {

        if (product.unitPrice <= 0) {
            console.log("lütfen fiyat giriniz")
            return;
        }

        this.products.push(product); //push ekleme için

    }

    list() {
        return this.products;

    }
}