const oddValues = (arr) => {
  let temp = arr.filter((num)=>{
    return (!(num % 2 === 0));
  });
  return temp;
};

console.log(oddValues([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));

var text = ['apple'];


console.log(text[0].match(/a,e,i,o,u/));
