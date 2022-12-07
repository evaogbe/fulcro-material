(ns ogbe.fulcro.mui.icons.running-with-errors
  #?(:cljs (:require
            ["@mui/icons-material/RunningWithErrors" :default RunningWithErrors]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-running-with-errors
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RunningWithErrors)))