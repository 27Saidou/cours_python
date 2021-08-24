import mathlib

def test_calc_addition():
    resultat = mathlib.calc_addition(2, 4)
    assert resultat == 6

def test_calc_substraction():
    resultat = mathlib.calc_substraction(2, 4)
    assert resultat == -2


def test_calc_multiply():
    resultat = mathlib.calc_multiply(2, 4)
    assert resultat == 8
