function microondas (prato, time){
    switch (prato){
                //    Brigadeiro / Macarrao
                case 'brigadeiro':
                case 'macarrao':
                    if (time<8){
                        console.log('time inssuficiente ;/ ')
                    }   else if (time >=24){
                        console.log('Kabooooooooom X﹏X ')
                    }   else if (time >= 16) {
                        console.log('O prato queimou :(')
                    }   else {
                        console.log('Prato pronto, Bom apetite :)')
                    }

                    break;   
                    // Feijao
                    case 'Feijao':
                        if (time<12){
                            console.log('time inssuficiente ;/ ')
                        }   else if (time >= 36){
                            console.log('Kabooooooooom X﹏X ')
                        }   else if (time >= 24) {
                            console.log('O prato queimou :(')
                        }   else {
                            console.log('Feijao pronto, aproveite :)')
                        }

                        break
                        // Pipoca
                        case 'Pipoca':
                            if (time<10){
                                console.log('time inssuficiente ;/ ')
                            }   else if (time >= 0){
                                console.log('Kabooooooooom X﹏X ')
                            }   else if (time >= 20) {
                                console.log('A Pipoca queimou :(')
                            }   else {
                                console.log('Pipoca pronta, aproveite :)')
                            }

                            break
                            // Carne                

                            case 'Carne':
                                if (time<15){
                                    console.log('time inssuficiente ;/ ')
                                }   else if (time >= 45){
                                    console.log('Kabooooooooom X﹏X ')
                                }   else if (time >= 30) {
                                    console.log('A Carne queimou :(')
                                }   else {
                                    console.log('Carne pronta, Bom apetite :)')
                                }

                                break
                                default:
                                    console.log ('Prato inexistente :/');
                                    break;
        
    

    }
}

microondas ('Carne', 16)
microondas ('Lazanha', 1)
microondas ('Pipoca', 11)
microondas ('Feijao', 25)
microondas ('macarrao', 16)
microondas ('brigadeiro', 25)
microondas ('macarrão', 8)
microondas ('brigadeiro', 7)
microondas ('brigadeiro', 8)
microondas ('torta', 10)
microondas ('macarrao', 8)