export default class Product {

    constructor(id,name,unitPrice)
    {
        if(!id || !name || !unitPrice)
        {
            console.log("nesne geçersiz");

        }

        this.id=id;
        this.name=name;
        this.unitPrice=unitPrice;



    }


}