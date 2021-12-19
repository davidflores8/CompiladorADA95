   .data
_primero    .word 0
_segundo    .word 0

_msg1: .asciiz "Esta a punto de entrar en un if"
_msg2: .asciiz "Dentro del if"
_msg3: .asciiz "Fuera de todo"
_msg4: .asciiz "Otra vez fuera de todo"
_msg5: .asciiz "Fuera"

   .text
   .globl Main

li $v0 4
la $a0 _msg1
syscall

lw $t0, _primero
lw $t1, _segundo
bgt $t0, $t1, _etiq3
b _etiq5


_etiq3:
li $v0 4
la $a0 _msg1
syscall



_etiq5:
li $v0 4
la $a0 _msg1
syscall

li $v0 4
la $a0 _msg1
syscall

li $v0 4
la $a0 _msg1
syscall

