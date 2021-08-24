import unittest


class UneClasseDeTest(unittest.TestCase):

    def setUp(self):
        print("Avant le test")

    def tearDown(self):
        print("Après le test")

    def test_simple(self):
        self.assertTrue(True)


if __name__ == '__main__':
    unittest.main()
