(ns ogbe.fulcro.mui.icons.commit-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CommitSharp" :default CommitSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-commit-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CommitSharp)))