(ns ogbe.fulcro.mui.icons.bug-report
  #?(:cljs (:require
            ["@mui/icons-material/BugReport" :default BugReport]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-bug-report
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BugReport)))