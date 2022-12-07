(ns ogbe.fulcro.mui.icons.call-split
  #?(:cljs (:require
            ["@mui/icons-material/CallSplit" :default CallSplit]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-split
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallSplit)))