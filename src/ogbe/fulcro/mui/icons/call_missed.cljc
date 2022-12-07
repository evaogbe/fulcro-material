(ns ogbe.fulcro.mui.icons.call-missed
  #?(:cljs (:require
            ["@mui/icons-material/CallMissed" :default CallMissed]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-missed
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallMissed)))