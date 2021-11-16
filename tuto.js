
let now=moment();
console.log(now.format('YYYY'));
console.log(now.format('YY'));
console.log(now.format('dddd'));
console.log(now.format('h:mm:ss'));
console.log(now.format('[Nous sommes en] YYYY'));
console.log(moment().fromNow());
console.log(moment(new Date("2000")).fromNow());
console.log(moment().startOf('day').fromNow());
console.log(moment().subtract(10, 'days').calendar());
