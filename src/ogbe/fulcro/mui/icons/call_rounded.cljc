(ns ogbe.fulcro.mui.icons.call-rounded
  #?(:cljs (:require
            ["@mui/icons-material/CallRounded" :default CallRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallRounded)))