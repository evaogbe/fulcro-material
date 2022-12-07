(ns ogbe.fulcro.mui.icons.leak-remove
  #?(:cljs (:require
            ["@mui/icons-material/LeakRemove" :default LeakRemove]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-leak-remove
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LeakRemove)))