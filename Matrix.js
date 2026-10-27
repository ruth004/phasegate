function reversecolum (matrix){

    for(let index = 0; index < matrix.length; index ++){
        let left = 0;
        let right = matrix [index].length -1;
        
    while (left < right){
        let temp = matrix [index][left];
    matrix[index][left] = matrix[index][right];
    
    matrix[index][right] = temp;
    left ++; right --;
    
    }
    }
        return matrix
    }
    
        let input = [
                [1,2,3],
                [4,5,6],
                [7,8,9]
                ];
                
    
    console.log(reversecolum(input));
