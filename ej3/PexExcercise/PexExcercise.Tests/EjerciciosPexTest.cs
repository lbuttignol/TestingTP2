// <copyright file="EjerciciosPexTest.cs">Copyright ©  2018</copyright>

using System;
using EjerciciosPex;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace EjerciciosPex.Tests
{
    [TestClass]
    [PexClass(typeof(global::EjerciciosPex.EjerciciosPex))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    public partial class EjerciciosPexTest
    {

        [PexMethod(MaxRunsWithoutNewTests = 200)]
        public int cal(
            int month1,
            int day1,
            int month2,
            int day2,
            int year
        )
        {
            int result = global::EjerciciosPex.EjerciciosPex.cal(month1, day1, month2, day2, year);
            return result;
            // TODO: add assertions to method EjerciciosPexTest.cal(Int32, Int32, Int32, Int32, Int32)
        }

        [PexMethod(MaxRunsWithoutNewTests = 200, MaxBranches = 20000)]
        public int patternIndex(string subject, string pattern)
        {
            int result = global::EjerciciosPex.EjerciciosPex.patternIndex(subject, pattern);
            return result;
            // TODO: add assertions to method EjerciciosPexTest.patternIndex(String, String)
        }
    }
}
