/* Data section */
	.section .data

	 .common b,4,4
	 .common a,4,4
L1:
	 .string "b=%d\n"


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

	 movl $5, %r14d
	 negl %r14d
	 movl %r14d,a(%rip)
	 movl a(%rip), %ebx
	 negl %ebx
	 movl $2, %ecx
	 addl %ecx, %ebx
	 movl %ebx,b(%rip)
	 movl b(%rip), %esi
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
