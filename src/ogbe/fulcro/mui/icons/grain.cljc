(ns ogbe.fulcro.mui.icons.grain
  #?(:cljs (:require
            ["@mui/icons-material/Grain" :default Grain]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-grain
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Grain)))