# Connect Four

## Description

This is a Connect Four desktop application written by two university students for the fun of it. Feel free to peruse our progress or contribute!

## Motivation

A few motivations for this project are as follows:

1. Build something fun
2. Practice designing an object-oriented system from scratch
3. Practice working in a (small) team
4. Create something interesting for our portfolios

## Design Principles

### Test driven development

We are building this project using test-driven development. In theory, this is a sequential process, but in practice, it is like a graph with cycles. The stages are described as what follows:

1. **Specification** of public interface
   - Choosing public operations
   - Documenting:
       1. _Requirements_: Preconditions, what the method assumes
       2. _Modifications_: What objects are changed (`this` or name of a parameter)
       3. _Effects_: Behaviour, what is returned; describes any *publicly visible* changes.
2. **Usage** scenarios
   - Thinking about ways the abstraction will be used
   - Ensure that the specification covers usage scenarios
   - Scenarios motivate new operations (which are then specified)
3. **Test** specification
   - Writing a thorough and rigorous test suite for every operation before implementation
   - Captures meaning/semantics of specification
4. **Implementation**
   - Internal representation of data (private data and methods)
   - Public and private methods
   - Tests should pass when done

### Testing

As a general guideline, tests should cover the following scenarios:

- All of the method's _effects_
- Each combination of inputs and outputs
  - e.g., one input, many inputs, mixing and matching, etc.
  - Test different program states, i.e., run things in different order
- Boundary cases, i.e., at interval endpoints, conditionals, etc.
- Exceptional cases, i.e., invalid inputs or states
- Branch coverage (this one is less important)

A great way to test your suite coverage is to systematically inject (subtle) bugs and rerun the tests. Ensure that tests fail when a piece of code is broken. Make sure to revert your injected bugs afterwards.

#### Naming

- Name test methods after method and scenario (i.e., `Test<Method><ActionOrBehaviour>`).
- Name test classes as `<ClassBeingTested>Test`.

### Robustness
   
A note about specification requirements: beginner programmers are often taught to ignore exceptional inputs, either by (a) allowing the program to break or (b) doing nothing when such an input is given. While this _may_ be okay for private, internal code, this is not great for public APIs. Instead, in Java, we throw exceptions when our program reaches a state that it doesn't know how to deal with (or that its caller should decide how to deal with itself).

For example, suppose that a user in a game of Connect Four tries to place a piece when it is NOT their turn. The game will complain and say...

> Hey! You're not allowed to do that! Even though you _did_ try to break the rules, I can just prevent you from making that move and I will continue with the game. However, to let you know that you made a mistake, I'm going to throw an exception and let you decide how to deal with it.

The user's game catches this exception and displays an error message to the user.

In summary, the user gave an input that would have violated a key invariant: a player can make a move if, and only if, it is that player's turn. However, we caught this and instead of letting the program crash and burn, we simply displayed an error message.

This is what makes code **robust**. In particular, a program that can appropriately deal with valid AND invalid states is robust.

## Logistics

### Style guide

We follow the [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html) for no particular reason other than (1) that IntelliJ IDEA's CheckStyle plugin supports Google's style guide by default and (2) that we want to stay consistent.

### Semantic versioning

We are using semantic versioning for this project. We will begin versioning this software when it reaches a usuable state.

See [Semantic Versioning 2.0.0](https://semver.org/spec/v2.0.0.html) for more details.

