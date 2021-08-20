export default class User{
    constructor(id,name,age){

        if(!id  ,!name , !age){
            console.log("Geçersiz")

        }

        this.id=id;
        this.name=name;
        this.age=age;

    }
}