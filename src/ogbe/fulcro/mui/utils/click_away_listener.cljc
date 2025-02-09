(ns ogbe.fulcro.mui.utils.click-away-listener
  #?(:cljs (:require
            ["@mui/material/ClickAwayListener" :default ClickAwayListener]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-click-away-listener #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ClickAwayListener)))
