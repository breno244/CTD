function fizBuzz (param1, param2){
    for(i=1; i<101; i++){
       if(i%param1===0){
           console.log('FIZZ');
       }
       else if(i%param2===0){
           console.log('buzz');
       }
       else if (i%param1 ===0 && i%param2){
           console.log('fizxbuzz')
       }
       else{
           console.log(i)
       }

       }

        
    }
}


console.log( fizBuzz(10))

   