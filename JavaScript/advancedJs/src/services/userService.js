export default class UserService {

    constructor() {
        this.users = []
    }

    add(user) {

        console.log("Kullanıcı eklendi.")

        this.users.push(user)

    }

    list() {
        return this.users;

    }

    remove(id){

        let IndexToRemove=-1;
        for(let index=0; index<this.users.length;index++)
        {
            if(this.users[index].id==id)

            {
                IndexToRemove=index;
            }
        }

        if(IndexToRemove===-1)
        {
            console.log("Böyle bir oyun yok");
        }
        else
        {
            this.users.splice(IndexToRemove,1);
        }


       
    }


}