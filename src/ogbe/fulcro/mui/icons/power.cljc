(ns ogbe.fulcro.mui.icons.power
  #?(:cljs (:require
            ["@mui/icons-material/Power" :default Power]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-power
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Power)))