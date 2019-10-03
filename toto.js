var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Animal = /** @class */ (function () {
    function Animal(name) {
        this.name = name;
    }
    return Animal;
}());
var Lion = /** @class */ (function (_super) {
    __extends(Lion, _super);
    function Lion(name, sex) {
        var _this = _super.call(this, name) || this;
        _this.sex = sex;
        return _this;
    }
    Lion.prototype.shout = function () {
        return "Rooooaarrr!";
    };
    return Lion;
}(Animal));
//instanciation
var myLion = new Lion('pablo', 'female');
//call d'un methode
console.log(myLion.shout());
