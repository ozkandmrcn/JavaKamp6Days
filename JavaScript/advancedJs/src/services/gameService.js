export default class GameService {

    constructor() {
        this.games = []
    }

    add(game) {

        if (game.unitPrice <= 0) {
            console.log("lütfen fiyat giriniz")
            return;
        }
        this.games.push(game)

    }

    list() {
        return this.games;

    }

    remove(id){

        let IndexToRemove=-1;
        for(let index=0; index<this.games.length;index++)
        {
            if(this.games[index].id==id)

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
            this.games.splice(IndexToRemove,1);
        }


       
    }


}