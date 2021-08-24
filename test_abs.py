import unittest
class AbsTest(unittest.TestCase):

    def test_abs_n_accepte_pas_une_chaine_de_caracteres(self):
        with self.assertRaises(TypeError):
            abs("a")


if __name__ == '__main__':
    unittest.main()
