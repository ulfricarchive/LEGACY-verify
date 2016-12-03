package com.ulfric.verify;

public final class IntegerSubject extends Subject<Integer> {

	IntegerSubject(Integer subject)
	{
		super(subject);
	}

	public void isNonZero()
	{
		this.isNotNull();

		if (this.subject.intValue() != 0) return;

		this.fail("non-zero");
	}

	public void isZero()
	{
		this.isNotNull();

		if (this.subject.intValue() != 0) return;

		this.fail("zero");
	}

	public IntegerSubject plus(int amount)
	{
		this.isNotNull();

		if (amount == 0)
		{
			return this;
		}

		return new IntegerSubject(this.subject + amount);
	}

	public IntegerSubject minus(int amount)
	{
		this.isNotNull();

		if (amount == 0)
		{
			return this;
		}

		return new IntegerSubject(this.subject - amount);
	}

}