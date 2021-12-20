   .data
_primero:    .word 0
_segundo:    .word 0

_msg1: .asciiz "Ingrese el primer numero: "
_msg2: .asciiz "Ingrese el segundo numero: "
_msg3: .asciiz "Primero es mayor"
_msg4: .asciiz "Segundo es mayor"
_msg5: .asciiz "Fuera de todo"

   .text
   .globl main

main: 
li $v0, 4
la $a0, _msg1
syscall

li $v0, 5
syscall
sw $v0, _primero

li $v0, 4
la $a0, _msg2
syscall

li $v0, 5
syscall
sw $v0, _segundo

lw $t0, _primero
lw $t1, _segundo
bgt $t0, $t1, _etiq6
b _etiq8

_etiq6:
li $v0, 4
la $a0, _msg3
syscall

b _etiq8

_etiq8:
li $v0, 4
la $a0, _msg4
syscall

li $v0, 4
la $a0, _msg5
syscall

li $v0 10
 syscall
