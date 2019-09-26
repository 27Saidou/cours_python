<?php
interface a
{
    public function foo();
}

interface b extends a
{
    public function baz();
}
// Ceci fonctionnera
class c implements b
{
    public function foo()
    { }

    public function baz()
    {
        echo "Hello World";
     }
}
 $e=new c();
$e->baz();

