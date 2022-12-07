(ns ogbe.fulcro.mui.icons.timer3
  #?(:cljs (:require
            ["@mui/icons-material/Timer3" :default Timer3]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer3
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timer3)))