(ns ogbe.fulcro.mui.icons.donut-small
  #?(:cljs (:require
            ["@mui/icons-material/DonutSmall" :default DonutSmall]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-donut-small
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DonutSmall)))