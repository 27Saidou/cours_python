from mathlib import *

class test_abc():
    
    def test_calc_addition(self):
        output = mathlib.calc_addition(2, 4)
        assert output == 6

    def test_calc_substraction(self):
        output = mathlib.calc_substraction(2, 4)
        assert output == -2

    def test_calc_multiply(self):
        output = mathlib.calc_multiply(2, 4)
        assert output == 8

    

