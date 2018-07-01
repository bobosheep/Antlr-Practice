/* Data section */
	.section .data

	 .common hello,4,4
	 .common helloworld,4,4
	 .common world,4,4
L2:
	 .string " Helloworld %d!\n"
L4:
	 .string " %d\n"


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
	 movl %r14d,hello(%rip)
	 movl $100, %ebx
	 movl %ebx,world(%rip)
	 movl world(%rip), %ecx
	 movl hello(%rip), %r15d
	 movl %ecx, %eax
	 movl $0, %edx
	 idivl %r15d
	 movl %eax, %ecx
	 movl %ecx,helloworld(%rip)
	 movl $0, %r8d
	 movl %r8d,world(%rip)
	 movl helloworld(%rip), %r9d
	 cmpl $0, %r9d
	 je L1
	 movl hello(%rip), %esi
	 movl $L2, %edi
	 call printf
L1:
	 movl world(%rip), %r10d
	 cmpl $0, %r10d
	 je L3
	 movl helloworld(%rip), %esi
	 movl $L4, %edi
	 call printf
L3:

	 addq $8,%rsp
	 popq %r15
	 popq %r14
	 popq %r13
	 popq %r12
	 popq %rbx
	 popq %rbp
	 ret
