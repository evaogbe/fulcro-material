(ns ogbe.fulcro.mui.icons.burst-mode
  #?(:cljs (:require
            ["@mui/icons-material/BurstMode" :default BurstMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-burst-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BurstMode)))