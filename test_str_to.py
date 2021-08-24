from pathlib import Path
def is_sourcefile(path):
    """Retourne True si le fichier est un fichier source Python"""
    if not path.is_file():
        raise Exception("Fichier indisponible")
    return path.suffix == ".py"
