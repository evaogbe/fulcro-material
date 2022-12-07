(ns ogbe.fulcro.mui.icons.call-made
  #?(:cljs (:require
            ["@mui/icons-material/CallMade" :default CallMade]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-made
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallMade)))