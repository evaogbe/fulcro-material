(ns ogbe.fulcro.mui.icons.timer10-select
  #?(:cljs (:require
            ["@mui/icons-material/Timer10Select" :default Timer10Select]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-timer10-select
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Timer10Select)))