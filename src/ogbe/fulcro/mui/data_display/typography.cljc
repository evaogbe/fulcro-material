(ns ogbe.fulcro.mui.data-display.typography
  #?(:cljs (:require
            ["@mui/material/Typography" :default Typography]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-typography #?(:clj  (fn [& _args])
                      :cljs (interop/react-factory Typography)))
