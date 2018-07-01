/* Data section */
	.section .data

	 .common b,4,4
	 .common a,4,4
L1:
	 .string "a + b = %d\n"


/* Text section */
	.section .text
	.global main
	.type main,@function
main:
	 pushq %rbp
	 movq %rsp,%rbp
	 pushq %rbx
	 pushq %r12
	 pushq %r13
	 pushq %r14
	 pushq %r15
	 subq $8,%rsp

	 movl $10, %r14d
	 movl %r14d,a(%rip)
	 movl $3, %ebx
	 movl %ebx,b(%rip)
	 movl a(%rip), %ecx
	 movl b(%rip), %r15d
	 addl %r15d, %ecx
	 movl %ecx,a(%rip)
	 movl a(%rip), %esi
	 movl $L1, %edi
	 call printf

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
