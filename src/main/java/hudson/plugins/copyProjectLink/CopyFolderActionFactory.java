package hudson.plugins.copyProjectLink;

import hudson.Extension;
import hudson.model.Action;

import java.util.Collection;
import java.util.Collections;

import com.cloudbees.hudson.plugins.folder.TransientFolderActionFactory;
import com.cloudbees.hudson.plugins.folder.Folder;

@Extension(optional = true)
public class CopyFolderActionFactory extends TransientFolderActionFactory {
    @Override
    public Collection<? extends Action> createFor(Folder target) {
        return Collections.singleton(new CopyAction<Folder>(target));
    }
}
