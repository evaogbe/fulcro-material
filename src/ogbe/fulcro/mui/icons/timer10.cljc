(ns ogbe.fulcro.mui.icons.timer10
  #?(:cljs (:require
            ["@mui/icons-material/Timer10" :default Timer10]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer10
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timer10)))