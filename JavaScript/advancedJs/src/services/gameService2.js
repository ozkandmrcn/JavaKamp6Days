import { games } from "../data/games.js"
import { DataError } from "../models/dataError.js"

export default class GameService2 {
    constructor() {
        this.strategy = []
        this.arcade = []
        this.errors = []
    }

    load() {
        for (let game of games) {
            switch (game.gameType) {
                case "Strategy":
                    if (this.validateGame(game) === false) {


                        this.strategy.push(game)

                    }
                    break;


                case "Arcade":
                    if (this.validateGame(game) === false) {
                        this.arcade.push(game)
                    }
                    break;

                default:
                    this.errors.push(new DataError("invalid data", game))

                    break;
            }

        }

        console.log(this.strategy)
        console.log(this.arcade)
        console.log(this.errors)

    }

    validateGame(game) {
        let requiredFields = ["id", "gameName", "unitPrice", "gameType"];
        let hasErrors = false;
        for (let field of requiredFields) {

            if (!game[field]) {
                this.errors.push(new DataError("Geçersiz alan : " + field, game))
                hasErrors = true;
            }


        }
        return hasErrors;


    }

    ValidateName(game)
    {
        let hasErrors = false;
        for (let field of games) {

            if (field.gameName==game.gameName) {
                this.errors.push(new DataError("Böyle bir oyun kayıtlı. " + field, game))
                hasErrors = true;
            }


        }
        return hasErrors;
    }

    add(game)
    {
        if(!this.ValidateName(game))
        {
            games.push(game)
            switch (game.gameType) {
                case "Strategy":
                    if (this.validateGame(game) === false  ) {


                        this.strategy.push(game)

                    }
                    break;


                case "Arcade":
                    if (this.validateGame(game) === false) {
                        this.arcade.push(game)
                    }
                    break;

                default:
                    this.errors.push(new DataError("2 defa aynı oyun eklenemez", game))

                    break;
            }

        }

        console.log(this.games)
        console.log(this.strategy)
        console.log(this.arcade)
        

    }

        }
    
