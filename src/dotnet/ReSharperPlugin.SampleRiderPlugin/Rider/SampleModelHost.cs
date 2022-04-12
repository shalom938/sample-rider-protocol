using System;
using JetBrains.Application.Threading;
using JetBrains.Application.Threading.Tasks;
using JetBrains.Lifetimes;
using JetBrains.ProjectModel;
using JetBrains.Rd.Tasks;
using JetBrains.RdBackend.Common.Features;
using JetBrains.RdBackend.Common.Features.Util;
using JetBrains.UI.Extensions;

namespace ReSharperPlugin.SampleRiderPlugin
{
    [SolutionComponent]
    public class SampleModelHost
    {
        public SampleModelHost(Lifetime lifetime, ISolution solution, IShellLocks shellLocks)
        {
            var model = solution.GetProtocolSolution().GetSampleModel();
            
            model.SomeProp.Change.Advise(lifetime, s =>
            {
                shellLocks.Tasks.StartNew(lifetime, Scheduling.MainDispatcher,
                    () => { model.MethodInfo.Value = "myMethodFromPropertyChange " + DateTime.Now; });
            });
            
            model.Refresh.Advise(lifetime, b =>
            {
                model.MethodInfo.Value = "myMethodFromSignal " + DateTime.Now;
            });

            model.HasMethod.Set((l, u) => RdTask<bool>.Successful(true));  
        }
    }
}