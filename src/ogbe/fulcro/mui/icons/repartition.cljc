(ns ogbe.fulcro.mui.icons.repartition
  #?(:cljs (:require
            ["@mui/icons-material/Repartition" :default Repartition]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-repartition
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Repartition)))