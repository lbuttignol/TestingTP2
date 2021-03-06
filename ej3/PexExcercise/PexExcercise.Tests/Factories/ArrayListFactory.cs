using ArrayListProject;
// <copyright file="ArrayListFactory.cs">Copyright ©  2018</copyright>

using System;
using Microsoft.Pex.Framework;
using System.Collections.Generic;

namespace ArrayListProject
{
    /// <summary>A factory for ArrayListProject.ArrayList instances</summary>
    public static partial class ArrayListFactory
    {

        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList Create0()
        {
            Object[] list = { "Hola", "chau", "other string", "otro" };
            ArrayList arrayList = new ArrayList(list);
            return arrayList;
        }
        /// <summary>A factory for ArrayListProject.ArrayList instances</summary>
        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList Create1()
        {
            ArrayList arrayList = new ArrayList();
            return arrayList;

        }

        [PexFactoryMethod(typeof(ArrayList))]
        public static ArrayList Create2()
        {
            Object[] list = { 0,1,2,3,4,5,6,7,8,9};
            ArrayList arrayList = new ArrayList(list);
            return arrayList;
        }

    }
}
