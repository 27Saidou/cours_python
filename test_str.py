import unittest

class ChaineDeCaractereTest(unittest.TestCase):

    def test_reversed(self):
        resultat = reversed("abcd")
        self.assertEqual("dcba", "".join(resultat))

    def test_sorted(self):
        resultat = sorted("dbca")
        self.assertEqual(['a', 'b', 'c', 'd'], resultat)

    def test_upper(self):
        resultat = "hello".upper()
        self.assertEqual("HELLO", resultat)


if __name__ == '__main__':
    unittest.main()
