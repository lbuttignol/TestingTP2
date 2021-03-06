// <copyright file="ArrayListTest.cs">Copyright ©  2018</copyright>

using System;
using ArrayListProject;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace ArrayListProject.Tests
{
    [TestClass]
    [PexClass(typeof(ArrayList))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    public partial class ArrayListTest
    {

        [PexMethod]
        [PexAllowedException(typeof(InsufficientMemoryException))]
        [PexAllowedException(typeof(NullReferenceException))]
        public void add(
            [PexAssumeUnderTest]ArrayList target,
            object item,
            int position
        )
        {
            PexAssume.IsNotNull(item);
            target.add(item, position);
            // TODO: add assertions to method ArrayListTest.add(ArrayList, Object, Int32)
        }

        [PexMethod]
        [PexAllowedException(typeof(NullReferenceException))]
        public void remove([PexAssumeUnderTest]ArrayList target, int position)
        {
            target.remove(position);
            // TODO: add assertions to method ArrayListTest.remove(ArrayList, Int32)
        }
    }
}
